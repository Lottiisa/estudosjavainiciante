import java.util.Scanner;

public class Teste {
    System.out.println("1-Café Expresso (R$ 5,00)");
        System.out.println("2-Cappuccino (R$ 10,00)");
        System.out.println("3-Chocolate Quente (R$8,00)");
        Scanner op = new Scanner(System.in);
        System.out.println("Escolha uma das opções do cardapio");
        int cardapio = op.nextInt();
        switch (cardapio) {
            case 1:
                System.out.println("Você escolheu Café Expresso (R$ 5,00)");
                break;
            case 2:
                System.out.println("Você escolheu Cappuccino (R$ 10,00)");
                break;
            case 3:
                System.out.println("Você escolheu Chocolate Quente (R$8,00)");
                break;
            default:
                System.out.println("Opção Invalida!");

		}
}