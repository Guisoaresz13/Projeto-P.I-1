import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();
        Game game = new Game();

        byte opcaoMenu;
        boolean sair = false;

        do {
            Menu.Inicial();
            opcaoMenu = input.nextByte();

            switch (opcaoMenu){
                case 1:
                    Menu.Instrucoes();
                    break;
                case 2:
                    Menu.Creditos();
                    break;
                case 3:
                    break;
                case 4:
                    sair = true;
                    break;
                default:
                    System.out.println("Digite um número válido, por gentileza");
            }
        }while (!sair);
        List questoes = new ArrayList();
        questoes.add("AAAAAA");

        System.out.println(questoes);
    }
}