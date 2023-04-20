public class ElementosJogo {

    public static int jogarDado() {
        int jogadaDado;
        do {
            jogadaDado = (int) (Math.random() * 10);
        } while (jogadaDado < 1 || jogadaDado > 6);
        return jogadaDado;
    }

    public void iniciarJogo(int NumeroDeRodadas, String personagemEscolhido) {

        Personagem heroi = null;

        switch (personagemEscolhido) {
            case "Muque-Man":
                 heroi = new MuqueMan();
                System.out.println("Escolheu Muque-Man");
                break;
            case "Relampago":
                 heroi = new Relampago();
                System.out.println("Escolheu Relampago");
                break;
            case "Raio-Laser":
                 heroi = new RaioLaser();
                System.out.println("Escolheu Raio-Laser");
                break;
            default:
                return;
        }
        
        
         System.out.println("You Choose"+heroi.getNome());                       
        




        
    }

}
