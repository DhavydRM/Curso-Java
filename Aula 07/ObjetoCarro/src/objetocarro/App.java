package objetocarro;
public class App {
    public static void main(String[] args) throws Exception {
        Carro objC = new Carro();
        objC.marca = "Fiat";
        objC.modelo = "Uno";
        objC.cor = "Azul";
        objC.ano = 2016;
        objC.status();
    }
}
