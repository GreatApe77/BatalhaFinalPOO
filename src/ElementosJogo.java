import java.util.Scanner;

public class ElementosJogo {

    public static int jogarDado() {
        int jogadaDado;
        do {
            jogadaDado = (int) (Math.random() * 10);
        } while (jogadaDado < 1 || jogadaDado > 6);
        return jogadaDado;
    }


    public Personagem escolherPersonagem(){
        Scanner scanner = new Scanner(System.in);
        
        Personagem heroi = null;

        switch (personagemEscolhido) {
            case "Muque-Man":
                heroi = new MuqueMan();

                break;
            case "Relampago":
                heroi = new Relampago();
                break;
            case "Raio-Laser":
                heroi = new RaioLaser();
                break;
            default:
                
        }

        return heroi;

    }

    public void iniciarJogo(int NumeroDeRodadas, String personagemEscolhido) {

        Personagem heroi = escolherPersonagem(personagemEscolhido);
        System.out.println("================================================================================");
        System.out.printf("A nave de ZORG pousou! a terra está em perigo e apenas %s pode salvar o dia! \n",heroi.getNome());
        System.out.println("================================================================================");

    }

}
