/* Curso: Java Básico - Instituto HopeS
 * Aula: Variáveis Compostas
 * Data: 27/11/2024
*/
import java.util.Arrays;

public class Aula06 {
    public static void main(String[] args) {
        String nomes[] = {"Ana", "Carlos", "Aline", "Marcos","Roger", "José"};
        Arrays.sort(nomes);
        for(int i = 0; i<nomes.length; i++){
            System.out.println(nomes[i]);
        }
    }
}
