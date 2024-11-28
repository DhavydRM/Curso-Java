import java.util.Scanner;
public class App {

    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        
        System.out.println("Nome do produto:");
        String nome = a.next();
        System.out.println("Preço de custo:");
        double custo = a.nextDouble();
        System.out.println("Valor da venda:");
        double valorVenda = a.nextDouble();

        double lucro = valorVenda - custo;
        if(lucro >= 100){
            System.out.println("Produto com desconto!");

        }else{
            System.out.println("Produto sem desconto: ");
        }

    }
}