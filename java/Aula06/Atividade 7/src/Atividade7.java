import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("digite um numero inteiro positivo: ");
        Integer numero = scan.nextInt();

        if(numero >= 0){
            System.out.printf("\nSeu valor em decimal é: %d" , numero);
            System.out.printf("\nSeu valor em hexadecimal é: %X" , numero);
            System.out.printf("\nSeu valor em octal é: %o" , numero);
            System.out.printf("\nSeu valor convertido em caractere é: %c" , numero);
        }
        else{
            System.out.printf("erro");
        }
    }
}
