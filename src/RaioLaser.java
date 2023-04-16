public class RaioLaser extends Personagem implements Atacavel {
    
    private int boostDeAtaque = 0;

    @Override
    public void golpearFraco(Personagem alvo){

        int pontosDeVidaAtuais = alvo.getPontosDeVida();

        pontosDeVidaAtuais = pontosDeVidaAtuais - 10 - boostDeAtaque;
        alvo.setPontosDeVida(pontosDeVidaAtuais);
        
        System.out.println("Raio-Laser usou Optic Blast");
        //aumenta o ataque
        this.boostDeAtaque += 3;
    }
    
    @Override
    
    public void golpearMedio(Personagem alvo){
        int pontosDeVidaAtuais = alvo.getPontosDeVida();

        pontosDeVidaAtuais = pontosDeVidaAtuais -20 - boostDeAtaque;

        alvo.setPontosDeVida(pontosDeVidaAtuais);
        System.out.println("Raio-Laser usou Mega Optic");
        this.boostDeAtaque += 3;
    }
    
    @Override
    
    public void golpearForte(Personagem alvo){

        int pontosDeVidaAtuais = alvo.getPontosDeVida();

        pontosDeVidaAtuais = pontosDeVidaAtuais -40;

        alvo.setPontosDeVida(pontosDeVidaAtuais);
        System.out.println("Raio-Laser usou Super Optic");
        this.boostDeAtaque += 3;
    }


}
