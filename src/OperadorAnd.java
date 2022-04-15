import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OperadorAnd {
    private String valor1;
    private String valor2;
    List<Valores> listaValores = new ArrayList<Valores>();

    public OperadorAnd(String valor1, String valor2){
        this.setValor1(valor1);
        this.setValor2(valor2);


    }

    public List<Valores> resultado(){
        List<Boolean> lista = new ArrayList<Boolean>(Arrays.asList(false,true));
        for (Boolean i:lista){
            for (Boolean x:lista){
                Valores valor = new Valores(i,x,i && x);
                this.listaValores.add(valor);
            }
        }

        return listaValores;
    }


    public String getValor1() {
        return valor1;
    }

    public void setValor1(String valor1) {
        this.valor1 = valor1;
    }

    public String getValor2() {
        return valor2;
    }

    public void setValor2(String valor2) {
        this.valor2 = valor2;
    }

    public List<Valores> getListaValores() {
        return listaValores;
    }

    public void setListaValores(List<Valores> listaValores) {
        this.listaValores = listaValores;
    }
}
