import java.util.Scanner;

public class ElementosJogo {

    public static int jogarDado() {
        int jogadaDado;
        do {
            jogadaDado = (int) (Math.random() * 10);
        } while (jogadaDado < 1 || jogadaDado > 6);
        return jogadaDado;
    }

    public Personagem escolherPersonagem() {
        Scanner scanner = new Scanner(System.in);
        int opcaoEscolhida;

        do {
            mostrarMenu();
            opcaoEscolhida = scanner.nextInt();
        } while (opcaoEscolhida  >3 ||opcaoEscolhida <1);

        switch (opcaoEscolhida) {
            case 1:
                return new MuqueMan();

            case 2:
                return new Relampago();

            case 3:
                return new RaioLaser();
            default:
                return null;

        }

    }

    public void iniciarJogo() {
        
        Personagem heroiEscolhido = escolherPersonagem();

        apresentarJogo(heroiEscolhido.getNome());

    }

    private void mostrarMenu() {
        System.out.println("--------Batalha Final--------");
        System.out.println("================================================================================");
        System.out.println("Escolha entre : Muque-Man,Relampago e Raio-Laser!");
        System.out.println("(1)-------> Muque-Man");
        System.out.println("(2)-------> Relampago");
        System.out.println("(3)-------> Raio-Laser");
        System.out.println("================================================================================");
        System.out.println("Digite abaixo sua escolha e aperte ENTER! :");

    }

    private void apresentarJogo(String nomePersonagemEscolhido){
        System.out.println("================================================================================");
        System.out.printf("A nave de ZORG pousou! a terra está em perigo e apenas %s pode salvar o dia! \n",nomePersonagemEscolhido);
        System.out.println("================================================================================");

    }

}
