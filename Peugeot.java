public class Peugeot extends Veiculo {
    private int numPortas;

    public Peugeot(String modelo, String cor, int numPortas) {
        super(modelo, cor);
        this.numPortas = numPortas;
    }

    @Override
    public String obterInformacoes() {
        return "Peugeot - Modelo: " + getModelo() + ", Cor: " + getCor() +
                ", Número de Portas: " + numPortas;
    }
}