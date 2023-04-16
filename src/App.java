public class App {
    public static void main(String[] args) throws Exception {
        MuqueMan muqueman = new MuqueMan();
        
        RaioLaser raioLaser = new RaioLaser();

        muqueman.golpearForte(raioLaser);
        muqueman.golpearForte(raioLaser);
        raioLaser.golpearMedio(muqueman);
        Alienigena alienigena = new Alienigena();
        alienigena.golpearForte(muqueman);
        alienigena.golpearForte(muqueman);
        alienigena.golpearForte(muqueman);
        alienigena.golpearForte(muqueman);
        alienigena.golpearForte(muqueman);
        alienigena.golpearForte(muqueman);
        alienigena.golpearForte(muqueman);
        if(muqueman.getPontosDeVida()<0){
            System.out.println("MuqueMAnMOrreu");
        }
        System.out.println("Vida do muqueMan: "+muqueman.getPontosDeVida());
        System.out.println("Vida do raioLaser: "+ raioLaser.getPontosDeVida());



    }
}
