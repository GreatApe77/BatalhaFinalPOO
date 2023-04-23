public class MuqueMan extends Personagem implements Atacavel {
    
    MuqueMan(){
        super("Muque-Man");
    }

    @Override
    public void golpearFraco(Personagem alvo){
        sofrerDanoContinuo();
        regenerarVida();
        int pontosDeVidaAtuais = alvo.getPontosDeVida();
        pontosDeVidaAtuais = pontosDeVidaAtuais -10;
        alvo.setPontosDeVida(pontosDeVidaAtuais);
        System.out.println("Muque Man usou o chute!");

    }
    
    @Override
    
    public void golpearMedio(Personagem alvo){
        sofrerDanoContinuo();
        regenerarVida();
        int pontosDeVidaAtuais = alvo.getPontosDeVida();

        pontosDeVidaAtuais = pontosDeVidaAtuais -20;

        alvo.setPontosDeVida(pontosDeVidaAtuais);
        System.out.println("Muque man usou o Tornado!");
    }
    
    @Override
    
    public void golpearForte(Personagem alvo){
        sofrerDanoContinuo();
        regenerarVida();
        int pontosDeVidaAtuais = alvo.getPontosDeVida();

        pontosDeVidaAtuais -= 40;

        alvo.setPontosDeVida(pontosDeVidaAtuais);
        System.out.println("Muque man usou o Berserker!");
    }


    //Habilidade unica de Muque Man
    public void regenerarVida(){
        int pontosDeVidaAtuais = this.getPontosDeVida();
        pontosDeVidaAtuais += 5;
        setPontosDeVida(pontosDeVidaAtuais);
    }

}
