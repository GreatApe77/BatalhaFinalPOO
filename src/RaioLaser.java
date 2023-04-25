public class RaioLaser extends Personagem implements Atacavel {
    
    RaioLaser(){
        super("Raio-Laser");
    }
    private int boostDeAtaque = 0;

    @Override
    public void golpearFraco(Personagem alvo){
        sofrerDanoContinuo();

        int pontosDeVidaAtuais = alvo.getPontosDeVida();

        pontosDeVidaAtuais = pontosDeVidaAtuais - 10 - boostDeAtaque;
        alvo.setPontosDeVida(pontosDeVidaAtuais);
        
        System.out.println("Raio-Laser usou Optic Blast");
        //aumenta o ataque
        this.boostDeAtaque += 3;
    }
    
    @Override
    
    public void golpearMedio(Personagem alvo){
        sofrerDanoContinuo();

        int pontosDeVidaAtuais = alvo.getPontosDeVida();

        pontosDeVidaAtuais = pontosDeVidaAtuais -20 - boostDeAtaque;

        alvo.setPontosDeVida(pontosDeVidaAtuais);
        System.out.println("Raio-Laser usou Mega Optic");
        this.boostDeAtaque += 3;
    }
    
    @Override
    
    public void golpearForte(Personagem alvo){
        sofrerDanoContinuo();


        int pontosDeVidaAtuais = alvo.getPontosDeVida();

        pontosDeVidaAtuais = pontosDeVidaAtuais -40 -boostDeAtaque;

        alvo.setPontosDeVida(pontosDeVidaAtuais);
        System.out.println("Raio-Laser usou Super Optic");
        this.boostDeAtaque += 3;
    }


}
