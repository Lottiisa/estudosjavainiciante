import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
//
        double gratificacao = 0;
        double imposto =0;
        double salariof;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu salario: ");
        double salario = sc.nextDouble();

        gratificacao = salario * 0.05;
        salariof = salario + gratificacao;
        imposto = salario * 0.07;
        salariof = salariof - imposto;


        System.out.println("O salario final é: " + salariof);
    }
}