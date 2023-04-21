import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        ElementosJogo elementosJogo = new ElementosJogo();
        

        String personagemEscolhido = scanner.nextLine();

        elementosJogo.iniciarJogo(0, personagemEscolhido);
        
    }
}
