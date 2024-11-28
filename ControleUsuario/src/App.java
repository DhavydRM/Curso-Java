/* Escola: Instituto Hope
 * Curso: Java Básico
 * Data: 28/11/2024
 */
import java.util.Scanner;
public class App {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String usuario, senha;
        System.out.println("Digite o usuário:");
        usuario = sc.next();
        System.out.println("Digite a senha:");
        senha = sc.next();

        if(usuario.equals("Dhavyd") && senha.equals("hope123")){
            System.out.println("Acesso Liberado!");
        }else if(usuario.equals("Dhavyd") && senha != "hope123"){
            System.out.println("Senha Incorreta!");
        }else if(usuario != "Dhavyd" && senha.equals("hope123")){
            System.out.println("Usuario Incorreto!");
        }else{
            System.out.println("Login Não Cadastrado!");
        }
        sc.close();
        
    }
}