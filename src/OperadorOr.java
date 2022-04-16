import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OperadorOr extends OperadorAnd{


    public OperadorOr(String valor1, String valor2) {
        super(valor1, valor2);
    }


    public List<Valores> montaTabela(){
        List<Boolean> lista = new ArrayList<Boolean>(Arrays.asList(false,true));
        for (Boolean i:lista){
            for (Boolean x:lista){
                Valores valor = new Valores(i,x,i || x);
                this.listaValores.add(valor);
            }
        }

        return listaValores;
    }
}
