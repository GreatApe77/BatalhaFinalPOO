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

        Personagem inimigo = criarInimigo();

        rodada(heroiEscolhido, inimigo);
        

        System.out.println("Vida do heroi: "+heroiEscolhido.getPontosDeVida());
        System.out.println("Vida do inimigo: "+inimigo.getPontosDeVida());

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
    
    private Alienigena criarInimigo(){
        return new Alienigena();
    }

    private void rodada(Personagem heroi,Personagem inimigo){
        
        int dadoDoJogador = ElementosJogo.jogarDado();
        int dadoDoInimigo = ElementosJogo.jogarDado();
        




        //Atacar Com o Heroi

        if(dadoDoJogador==1||dadoDoJogador==2){
            heroi.golpearFraco(inimigo);
        }else if(dadoDoJogador==3||dadoDoJogador==4||dadoDoJogador==5){
            heroi.golpearMedio(inimigo);
        }else if(dadoDoJogador==6){
            heroi.golpearForte(inimigo);
        }

        //Atacar com o o vilao

        if(dadoDoInimigo==1||dadoDoInimigo==2){
            inimigo.golpearFraco(heroi);
        }else if(dadoDoInimigo==3||dadoDoInimigo==4||dadoDoInimigo==5){
            inimigo.golpearMedio(heroi);
        }else if(dadoDoInimigo==6){
            inimigo.golpearForte(heroi);
        }




    }

}
