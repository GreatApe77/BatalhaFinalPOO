public abstract class Personagem  {
    
    private int pontosDeVida = 200;
    private int danoContinuo = 0;
    
    public void setDanoContinuo(){
        danoContinuo = 3;
    }

    public int getPontosDeVida(){
        return this.pontosDeVida;
    }

    public void setPontosDeVida(int pontosDeVida){
        this.pontosDeVida = pontosDeVida;
    }
    

    // classes filhas vao dar override nesses metodos abaixo
    public void golpearFraco(Personagem alvo){
        
        int pontosDeVidaAtuais = alvo.getPontosDeVida();

        pontosDeVidaAtuais = pontosDeVidaAtuais - 10;
        alvo.setPontosDeVida(pontosDeVidaAtuais);

    }
    public void golpearMedio(Personagem alvo){
        int pontosDeVidaAtuais = alvo.getPontosDeVida();

        pontosDeVidaAtuais = pontosDeVidaAtuais -20;

        alvo.setPontosDeVida(pontosDeVidaAtuais);

    }

    public void golpearForte(Personagem alvo){

        int pontosDeVidaAtuais = alvo.getPontosDeVida();

        pontosDeVidaAtuais = pontosDeVidaAtuais -40;

        alvo.setPontosDeVida(pontosDeVidaAtuais);
    }


    
}
