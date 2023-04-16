public class App {
    public static void main(String[] args) throws Exception {
        MuqueMan muqueman = new MuqueMan();
        
        RaioLaser raioLaser = new RaioLaser();

        raioLaser.golpearFraco(muqueman);
        raioLaser.golpearFraco(muqueman);
        System.out.println("Vida do muqueMan: "+muqueman.getPontosDeVida());
        System.out.println("Vida do raioLaser: "+ raioLaser.getPontosDeVida());



    }
}
