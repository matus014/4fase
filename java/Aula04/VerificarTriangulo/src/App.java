import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite três valores para formar um Triangulo \nPrimeiro Valor: ");
        Long num1 = scan.nextLong();

        System.out.println("Segundo Valor: ");
        Long num2 = scan.nextLong();

        System.out.println("Terceiro Valor: ");
        Long num3 = scan.nextLong();

         if(num1 + num2 > num3 && num1 + num3 > num2 && num2 + num3 > num1){
            System.out.println("É possivel formar um triangulo com os tamanhos");
         }
         else{
            System.out.println("Não é possivel formar um triangulo");
         }


    }
}
