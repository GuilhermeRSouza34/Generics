import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Veiculo> listaVeiculos = new ArrayList<>();

        listaVeiculos.add(new Honda("Civic", "Preto", true));
        listaVeiculos.add(new Hyundai("Elantra", "Prata", "1.6"));
        listaVeiculos.add(new Volkswagen("Golf", "Azul", true));
        listaVeiculos.add(new Peugeot("208", "Branco", 4));
        // Adicione veículos de outros fabricantes...

        for (Veiculo veiculo : listaVeiculos) {
            System.out.println(veiculo.obterInformacoes());
        }
    }
}