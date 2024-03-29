import java.util.Scanner;

public class ElementosJogo {

    public static int jogarDado() {
        int jogadaDado;
        do {
            jogadaDado = (int) (Math.random() * 10);
        } while (jogadaDado < 1 || jogadaDado > 6);
        return jogadaDado;
    }
    public static void esperar(int tempoEmSegundos){
        try {
            Thread.sleep(tempoEmSegundos*1000); 
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    public static void esperar(){
        try {
            Thread.sleep(6000); 
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
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

    public void iniciarJogo(int numeroDeRodadas) {
        //menu de escolha de personagens
        Personagem heroiEscolhido = escolherPersonagem();
        //tela de apresentacao 
        apresentarJogo(heroiEscolhido);
        //cria o inimigo
        Personagem inimigo = criarInimigo();


        for (int i = 0; i < numeroDeRodadas; i++) {
            rodada(heroiEscolhido, inimigo);
            
        }
        
        if(heroiEscolhido.getPontosDeVida() > inimigo.getPontosDeVida()){
            System.out.println("--------------------");
            System.out.printf("%s conseguiu salvar a terra de ZORG! O mundo esta em paz\n",heroiEscolhido.getNome());
            System.out.println("--------------------");
        }else{
            System.out.println("--------------------");
            System.out.println("Voce Perdeu! ZORG estabeleceu um império maligno e todos foram escravizados!");
            System.out.println("--------------------");

        }
        

        System.out.println("Vida do heroi: "+heroiEscolhido.getPontosDeVida());
        System.out.println("Vida do inimigo: "+inimigo.getPontosDeVida());

    }
    
    public void iniciarJogo() {
        //menu de escolha de personagens
        Personagem heroiEscolhido = escolherPersonagem();
        //tela de apresentacao 
        apresentarJogo(heroiEscolhido);
        //cria o inimigo
        Personagem inimigo = criarInimigo();

        carregar();

        for (int i = 0; i < 6; i++) {
            rodada(heroiEscolhido, inimigo);
        }
        
        

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
    
    private void apresentarJogo(Personagem personagemEscolhido){
        System.out.println("================================================================================");
        System.out.printf("A nave de ZORG pousou! a terra está em perigo e apenas %s pode salvar o dia! \n",personagemEscolhido.getNome());
        System.out.println("================================================================================");

    }
    private Alienigena criarInimigo(){
        return new Alienigena();
    }

    private void rodada(Personagem heroi,Personagem inimigo){
        
        int dadoDoJogador;
        
        int dadoDoInimigo;
        



        Scanner scanner = new Scanner(System.in);
        String botaoApertado;
        do {
            
            System.out.println("=============");
            System.out.println("APERTE (J) PARA JOGAR O DADO" );
            System.out.println("=============");
            botaoApertado = scanner.nextLine();
            dadoDoJogador = ElementosJogo.jogarDado();
        } while (!botaoApertado.toLowerCase().equals("j"));

        
        carregar();


        //Atacar Com o Heroi
        
        if(dadoDoJogador==1||dadoDoJogador==2){
            System.out.println("Voce tirou "+dadoDoJogador+"!");
            heroi.golpearFraco(inimigo);
        }else if(dadoDoJogador==3||dadoDoJogador==4||dadoDoJogador==5){
            System.out.println("Voce tirou "+dadoDoJogador+"!");
            heroi.golpearMedio(inimigo);
        }else if(dadoDoJogador==6){
            System.out.println("Voce tirou "+dadoDoJogador+"!");
            heroi.golpearForte(inimigo);
        }
        
        carregar();
        //Atacar com o o vilao
        dadoDoInimigo = ElementosJogo.jogarDado();
        if(dadoDoInimigo==1||dadoDoInimigo==2){
            System.out.println("ZORG tirou: "+dadoDoInimigo+"!");
            inimigo.golpearFraco(heroi);
        }else if(dadoDoInimigo==3||dadoDoInimigo==4||dadoDoInimigo==5){
            System.out.println("ZORG tirou: "+dadoDoInimigo+"!");

            inimigo.golpearMedio(heroi);
        }else if(dadoDoInimigo==6){
            System.out.println("ZORG tirou: "+dadoDoInimigo+"!");

            inimigo.golpearForte(heroi);
        }

        carregar();

        
        
        exibirVidaPosRound(heroi, inimigo);

    }

    public static void carregar(){
        
        for (int i = 0; i < 3; i++) {
            System.out.println(".");
            esperar(1);
            
        }
    }

    public void exibirVidaPosRound(Personagem heroi,Personagem inimigo){

        System.out.printf("Vida do %s : %d\n",heroi.getNome(),heroi.getPontosDeVida());

        System.out.printf("Vida do %s : %d\n",inimigo.getNome(),inimigo.getPontosDeVida());
        
    }
}
