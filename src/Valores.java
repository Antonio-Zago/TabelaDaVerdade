public class Valores {
    private boolean valor1;
    private boolean valor2;
    private boolean resultado;

    public Valores(boolean valor1,boolean valor2, boolean resultado){
        this.setValor1(valor1);
        this.setValor2(valor2);
        this.setResultado(resultado);
    }



    public void setValor1(boolean valor1) {
        this.valor1 = valor1;
    }


    public void setValor2(boolean valor2) {
        this.valor2 = valor2;
    }


    public void setResultado(boolean resultado) {
        this.resultado = resultado;
    }

    public boolean getValor1() {
        return valor1;
    }

    public boolean getValor2() {
        return valor2;
    }

    public boolean getResultado() {
        return resultado;
    }
}
