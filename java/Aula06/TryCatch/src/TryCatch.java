import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        try{
            System.out.println("Digite um valor numerico: ");
            Integer numero = scan.nextInt();
            System.out.printf("seu numero: %d", numero);
 
        } catch (Exception ex) {
            System.out.println("Ocorreu um erro ");
        }
    }
}
