import java.lang.reflect.Constructor;

public abstract class Personagem  {
    
    private int pontosDeVida = 200;
    
     Personagem(String nome){
        setNome(nome);
     }
    private String nome;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    private int danoContinuo = 0;
    public void setDanoContinuo(int danoContinuo) {
        this.danoContinuo = danoContinuo;
    }
    public int getDanoContinuo() {
        return danoContinuo;
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

    public void sofrerDanoContinuo(){
        int meusPontosDeVida = this.getPontosDeVida();
        
        meusPontosDeVida -= this.getDanoContinuo();
        
        this.setPontosDeVida(meusPontosDeVida);
    }
    
}
