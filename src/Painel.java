import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Painel {
    private String operacao;
    private int tamanhoOperacao;
    private String operador;
    private String valor1;
    private String valor2;

    Scanner ler = new Scanner(System.in);


    public void exibirMenu(){
        System.out.println("---------------Tabela da Verdade---------------\n");
        System.out.println("Digite a operação: ");
    }

    public List<Valores> ler(){
        List<Valores> valores = new ArrayList<Valores>();

        this.operacao = ler.next();


        while(this.operacao.length()>1) {
            this.valor1 = this.operacao.substring(0, 1);
            this.operador = this.operacao.substring(1, 2);
            this.valor2 = this.operacao.substring(2, 3);

            System.out.println(this.operacao);
            this.operacao = this.operacao.substring(2);

            valores.addAll(this.selecionaOperacao());

        }
        return valores;
    }

    private List<Valores> selecionaOperacao(){
        if(this.operador.equals("^")){
            OperadorAnd and = new OperadorAnd(this.valor1, this.valor2);
            return and.montaTabela();
        }
        else if(this.operador.equals("v")){
            OperadorOr or = new OperadorOr(this.valor1, this.valor2);
            return or.montaTabela();
        }
        else return null;
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
