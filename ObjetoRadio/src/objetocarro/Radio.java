package objetocarro;

public class Radio {
    String fabricante = "Philips";
        String tamanho = "Médio";
        boolean ligado = true;

        void status(){
            System.out.println("Fabricante: " +this.fabricante);
            System.out.println("Tamanho: "+this.tamanho);
        }
        void ligar(){
            if(ligado == true){
                System.out.println("Ligado!");
                
            }else{
                System.out.println("Desligado!");
            }
        }
}
