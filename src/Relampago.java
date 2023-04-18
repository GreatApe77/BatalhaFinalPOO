public class Relampago extends Personagem implements Atacavel {
    

    Relampago(){
        super("Relampago");
    }


    private int danoDeChoque = 3;
    
    @Override
    public void golpearFraco(Personagem alvo){
        sofrerDanoContinuo();

        alvo.setDanoContinuo(danoDeChoque);
        int pontosDeVidaAtuais = alvo.getPontosDeVida();

        pontosDeVidaAtuais = pontosDeVidaAtuais -10;
        alvo.setPontosDeVida(pontosDeVidaAtuais);
        System.out.println("Relâmpago usou Lightning Attack");

    }
    
    @Override
    
    public void golpearMedio(Personagem alvo){
        sofrerDanoContinuo();

        alvo.setDanoContinuo(danoDeChoque);
        int pontosDeVidaAtuais = alvo.getPontosDeVida();

        pontosDeVidaAtuais = pontosDeVidaAtuais -20;

        alvo.setPontosDeVida(pontosDeVidaAtuais);
        System.out.println("Relâmpago usou Lightning Storm");  
    }
    
    @Override
    
    public void golpearForte(Personagem alvo){
        sofrerDanoContinuo();

        alvo.setDanoContinuo(danoDeChoque);
        int pontosDeVidaAtuais = alvo.getPontosDeVida();

        pontosDeVidaAtuais = pontosDeVidaAtuais -40;

        alvo.setPontosDeVida(pontosDeVidaAtuais);
        System.out.println("Relâmpago usou Hail Storm");

    }

}
