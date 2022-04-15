import java.util.List;
import java.util.Scanner;

public class Painel {
    private String operacao;
    private String operador;
    private String valor1;
    private String valor2;

    Scanner ler = new Scanner(System.in);


    public void exibir(){
        System.out.println("---------------Tabela da Verdade---------------\n");
        System.out.println("Digite a operação: ");

        this.ler();
    }

    public void ler(){
        this.setOperacao(ler.next());

        this.setValor1(this.getOperacao().substring(0,1));
        this.setOperador(this.getOperacao().substring(1,2));
        this.setValor2(this.getOperacao().substring(2,3));

        if(this.getOperador().equals("^")){
            OperadorAnd and = new OperadorAnd(this.getValor1(), this.getValor2());
            this.exibirResultado(and.resultado());
        }

        if(this.getOperador().equals("v")){
            OperadorOr or = new OperadorOr(this.getValor1(), this.getValor2());
            this.exibirResultado(or.resultado());
        }
    }

    public void exibirResultado(List<Valores> listaValores){

        for (Valores valores : listaValores ){
            System.out.print(valores.getValor1() + " - " + valores.getValor2() + " - " + valores.getResultado());
        }
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
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
}
