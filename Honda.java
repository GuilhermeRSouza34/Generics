public class Honda extends Veiculo {
    private boolean arCondicionado;

    public Honda(String modelo, String cor, boolean arCondicionado) {
        super(modelo, cor);
        this.arCondicionado = arCondicionado;
    }

    @Override
    public String obterInformacoes() {
        return "Honda - Modelo: " + getModelo() + ", Cor: " + getCor() +
                ", Ar Condicionado: " + (arCondicionado ? "Sim" : "Não");
    }
}