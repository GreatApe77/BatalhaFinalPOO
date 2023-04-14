public class MuqueMan extends Personagem implements Atacavel {
    

    @Override
    public void golpearFraco(Personagem alvo){
        
        int pontosDeVidaAtuais = alvo.getPontosDeVida();

        pontosDeVidaAtuais = pontosDeVidaAtuais -10;
        alvo.setPontosDeVida(pontosDeVidaAtuais);
        System.out.println("Muque Man usou o chute!");

    }





}
