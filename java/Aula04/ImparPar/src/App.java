import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner scan = new Scanner(System.in);

        
        System.out.println("Digite um numero: ");
        Integer num = scan.nextInt();
        
        Boolean par = (num%2) == 0;
        Boolean positivo = num >+0;

        System.out.println("par: " + par);
        System.out.println("positivo: " + positivo);
        scan.close();
    }
}
