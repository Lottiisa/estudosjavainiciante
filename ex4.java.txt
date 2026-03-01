
import java.sql.SQLOutput;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        int i = 0;

        for(i=0;i<3;i++)
        {
            int password =1710;

            System.out.println("Digite a senha para entrar no banco");
            Scanner pass = new Scanner(System.in);
            int senha = pass.nextInt();


            if(senha==password)
            {
                System.out.println("Acesso permitido!");
                break;
            }
            else {
                if (i == 2) {
                    System.out.println("Acesso bloqueado");
                }
                else{
                    System.out.println("Senha incorreta, tente novamente");
                }
            }
        }
    }
}

