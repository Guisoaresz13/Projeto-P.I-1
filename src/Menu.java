import java.util.Scanner;

public class Menu {
    static Scanner input = new Scanner(System.in);
    public static void Inicial(){
        System.out.println("""
                 +---------------+
                 | 1. INSTRUÇÕES |
                 +---------------+
                 | 2. CRÉDITOS   |
                 +---------------+
                 | 3. JOGAR      |
                 +---------------+
                 | 4. SAIR       |
                 +---------------+
                                 """);
    
    }
    public static void Instrucoes(){
        System.out.println("""
         Este é um jogo de alternativas, então você irá utilizar:
                         1
                         2
                         3
                         4
         Para responder as questões, este é um jogo de pontos acumulativos.
         Você não perde pontos ao errar questões, então fique tranquilo.
         Ao final do quiz sua pontuação será exibida em sua tela, fique ligado!
         Preparado??
                         """);
        
        System.out.println("Enter para voltar ao menu");
        input.nextLine();
    }
    public static void Creditos(){
        System.out.println("""
                 Integrantes:
                
                 * Guilherme dos Santos Soares
                 * Gustavo Souza Santana
                 * Otávio Augusto Silva Pereira
                             """);

        System.out.println("Enter para voltar ao menu");
        input.nextLine();
    }
    public static void Limpar() {
        System.out.print("\033[H\033[2J");
        System.out.flush();

}
}
