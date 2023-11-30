public abstract class Veiculo {
    private String modelo;
    private String cor;

    // Construtor
    public Veiculo(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
    }

    // Getters e setters

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    // Método abstrato para obter informações específicas de cada veículo
    public abstract String obterInformacoes();
}