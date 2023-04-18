public class App {
    public static void main(String[] args) throws Exception {
        MuqueMan muqueman = new MuqueMan();
        
        RaioLaser raioLaser = new RaioLaser();
        Relampago relampago = new Relampago();
        Alienigena alienigena = new Alienigena();
        relampago.golpearFraco(alienigena);
        relampago.golpearForte(muqueman);
        alienigena.golpearFraco(muqueman);
        muqueman.golpearForte(relampago);
        raioLaser.golpearMedio(muqueman);
        raioLaser.golpearMedio(muqueman);
        
        System.out.println("Vida do muqueMan: "+muqueman.getPontosDeVida());
        System.out.println("Vida do raioLaser: "+ raioLaser.getPontosDeVida());
        System.out.println("Vida do alienigena: "+ alienigena.getPontosDeVida());
        System.out.println("vida da relampago: "+relampago.getPontosDeVida());



    }
}
