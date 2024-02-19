import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        soma();
    }

    public static void soma(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro valor.");
        Integer a = scan.nextInt();
        System.out.println("Digite o segundo valor.");
        Integer b = scan.nextInt();
        Integer soma = a + b;
        
        System.out.println("a soma é: " + soma);
        scan.close();
    }
    public static void calcular(){
        
    Calculadora calcular = new Calculadora();
    int numero;
    numero = calcular.soma(4, 2);
    System.out.println(numero);
}
    public static void helloword(String[] args){
    Scanner scan = new Scanner(System.in);
    String nome = scan.nextLine();
    System.out.println("Hello, " + nome);
    scan.close();
}

}

