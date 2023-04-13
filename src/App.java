public class App {
    public static void main(String[] args) throws Exception {
        MuqueMan muqueman = new MuqueMan();
        
        RaioLaser raioLaser = new RaioLaser();

        muqueman.golpearForte(raioLaser);
        muqueman.golpearForte(raioLaser);
        raioLaser.golpearMedio(muqueman);
        System.out.println("Vida do muqueMan: "+muqueman.getPontosDeVida());
        System.out.println("Vida do raioLaser: "+ raioLaser.getPontosDeVida());



    }
}
