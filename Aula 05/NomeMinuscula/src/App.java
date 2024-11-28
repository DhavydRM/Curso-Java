import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        try (Scanner inserir = new Scanner(System.in)) {
            System.out.println("Informe o nome do Cliente:");
            String nome = inserir.next();
            System.out.println("Nome: "+nome.toLowerCase());
        }
    }
}