public class Hyundai extends Veiculo {
    private String tipoMotor;

    public Hyundai(String modelo, String cor, String tipoMotor) {
        super(modelo, cor);
        this.tipoMotor = tipoMotor;
    }

    @Override
    public String obterInformacoes() {
        return "Hyundai - Modelo: " + getModelo() + ", Cor: " + getCor() + ", Tipo de Motor: " + tipoMotor;
    }
}
