import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Painel painel = new Painel();


        painel.exibirMenu();

        List<Valores> resultado = painel.ler();

        painel.exibirResultado(resultado);
    }
}
