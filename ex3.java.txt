import java.util.Scanner;
    public static void main(String[] args) {

        double saldo = 1000.00;

        System.out.println("1 - Saldo atual");
        System.out.println("2 - Sacar");

        Scanner op = new Scanner(System.in);
        System.out.println("Escolha uma das opções: ");
        int opcao = op.nextInt();

        switch(opcao)
        {
            case 1:
                System.out.println("Saldo atual: R$" + saldo);
                break;
            case 2:
                Scanner saque = new Scanner(System.in);
                System.out.println("Valor do saque: ");
                 double valor = saque.nextDouble();
                if(valor<=saldo)
                {
                    saldo =  saldo - valor;
                    System.out.println("Você sacou: R$" + valor + "\nSobrou: R$" + saldo);
                }
                else{
                    System.out.println("Saldo insuficiente");
                }
        }

    }

