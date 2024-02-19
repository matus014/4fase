import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatua em Celsius.");
        Double celsius = scan.nextDouble();
        Double fahrenheit = (celsius *1.8+32);

        System.out.println("celsius: " + celsius);
        System.out.println("fahrenheit: " + fahrenheit);
        scan.close();
        
            
        }
}
