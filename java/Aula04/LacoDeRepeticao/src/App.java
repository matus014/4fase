import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("digite o numero a ser multiplicado:");
        Integer num = scan.nextInt();

        for(int i = 1 ; i <= 10; i++)
        {
            System.out.println(num +" x " + i + " = " + (num*i));
        }

    }
}
