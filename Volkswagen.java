public class Volkswagen extends Veiculo {
    private boolean direcaoAssistida;

    public Volkswagen(String modelo, String cor, boolean direcaoAssistida) {
        super(modelo, cor);
        this.direcaoAssistida = direcaoAssistida;
    }

    @Override
    public String obterInformacoes() {
        return "Volkswagen - Modelo: " + getModelo() + ", Cor: " + getCor() +
                ", Direção Assistida: " + (direcaoAssistida ? "Sim" : "Não");
    }
}