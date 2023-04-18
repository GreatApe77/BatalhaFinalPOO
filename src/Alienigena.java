public class Alienigena extends Personagem  implements Atacavel{
    
    //Rival Alienígena: Split Kick, Bit Laser, Shockwave
    @Override
    public void golpearFraco(Personagem alvo){
        sofrerDanoContinuo();
        int pontosDeVidaAtuais = alvo.getPontosDeVida();
        pontosDeVidaAtuais = pontosDeVidaAtuais -10;
        alvo.setPontosDeVida(pontosDeVidaAtuais);
        System.out.println("Alienigena usou o Split Kick!");

    }
    
    @Override
    
    public void golpearMedio(Personagem alvo){
        sofrerDanoContinuo();
        int pontosDeVidaAtuais = alvo.getPontosDeVida();

        pontosDeVidaAtuais = pontosDeVidaAtuais -20;

        alvo.setPontosDeVida(pontosDeVidaAtuais);
        System.out.println("Alienígena usou o  Bit Laser!");
    }
    
    @Override
    
    public void golpearForte(Personagem alvo){
        sofrerDanoContinuo();
        int pontosDeVidaAtuais = alvo.getPontosDeVida();

        pontosDeVidaAtuais = pontosDeVidaAtuais -40;

        alvo.setPontosDeVida(pontosDeVidaAtuais);
        System.out.println("Alienígena usou o Shockwave!");
    }

    public void sofrerDanoContinuo(){
        int meusPontosDeVida = this.getPontosDeVida();
        
        meusPontosDeVida -= this.getDanoContinuo();
        
        this.setPontosDeVida(meusPontosDeVida);
    }
}
