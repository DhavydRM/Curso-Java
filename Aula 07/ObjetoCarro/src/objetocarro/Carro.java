package objetocarro;

public class Carro {  
    public String marca;
    public String modelo;
    public String cor;
    public Short ano;
    
    void status(){
        System.out.println("Informações do carro");
        System.out.println("Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Cor: "+this.cor);
        System.out.println("Ano: "+this.ano);
    }
}