public class ElementosJogo {
    public static int jogarDado(){
        int jogadaDado; 
        do {
            jogadaDado =  (int)(Math.random()*10);
        } while (jogadaDado<1||  jogadaDado>6);
        return jogadaDado;
    }

    public void iniciarJogo(int NumeroDeRodadas,String personagemEscolhido){
        /*
          
        switch (personagemEscolhido) {
            case valu:
                
                break;
        
            default:
                break;
        }
          
         
         */
        

    }    

}
