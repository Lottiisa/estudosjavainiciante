import java.sql.SQLOutput;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        int i = 0;
        int soma=0;
        System.out.println("Digite um numero inicial: ");
        Scanner num1 = new Scanner(System.in);
        int one = num1.nextInt();
        System.out.println("Digite um numero final: ");
        Scanner num2 = new Scanner(System.in);
        int two = num2.nextInt();

        for(i=one;i<=two;i++)
        {
            if(i%2==0)
            {
                soma=soma+i;

            }
        }
        System.out.println("A soma dos pares é: "+soma);
    }
    }
