import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        

        System.out.println("escreva uma frase");
        String frase = scan.nextLine();

        // String[] palavras = frase.splitWithDelimiters(frase, -1);
        String[] palavras = frase.trim().split(" ");
        

   
        for(int i = 0; i < palavras.length ;i++){
            System.out.println(palavras[i]);
            
        }
        System.out.println("a sua frase contem " + palavras.length + " palavras");
        scan.close();
    }
}
