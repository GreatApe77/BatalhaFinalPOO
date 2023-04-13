public abstract class Personagem implements Movimentos {
    
    private int pontosDeVida = 200;

 



    public int getPontosDeVida(){
        return this.pontosDeVida;
    }

    public void setPontosDeVida(int pontosDeVida){
        this.pontosDeVida = pontosDeVida;
    }
    
    public void golpearFraco(Personagem alvo){
        
        int pontosDeVidaAtuais = alvo.getPontosDeVida();

        pontosDeVidaAtuais = pontosDeVidaAtuais -10;

    }
    public  abstract void golpearMedio(Personagem alvo);
    public abstract void golpearForte(Personagem alvo);

}
