import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        Integer num = scan.nextInt();

        if (num > 0){
            
            System.out.println("o Numero é Positivo");
        }
        else if (num < 0){
             System.out.println("o Numero é Negativo");
        }
        else{
            System.out.println("o Numero é Zero");
        }

        if( (num%2) == 0) {
            System.out.println("o Numero é Par");
        }
        else{
             System.out.println("o Numero é Impar");
        }
        scan.close();
    }
    }

