import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        // List<Integer> list = Arrays.asList(5, 5, 6, 6);

        System.out.println("quantos numeros quer digitar: ");
        int j = scan.nextInt();

        for(int i=0; i<j ; i++){
            System.out.println("digite o valor "+(i+1)+":");
            list.add(scan.nextInt());
        }
        scan.close();
        
    
        Integer soma = list.stream()
            .reduce((n1, n2) -> (n1 + n2))
            .orElse(0);
            System.out.println(("a soma dos valores é: "+ soma));

        Integer somaImpar = list.stream()
            .filter(n -> n%2!=0)
            .reduce((n1, n2) -> (n1 + n2))
            .orElse(0);
            System.out.println(("a soma dos valores impar é: "+somaImpar));

        Integer somaPar = list.stream()
            .filter(n -> n%2==0)
            .reduce((n1, n2) -> (n1 + n2))
            .orElse(0);
            System.out.println(("a soma dos valores par é: "+somaPar));  

    }




public static void array(){

    Scanner scan = new Scanner(System.in);
    // List<Float> list = new ArrayList<Float>();
    List<Integer> list = Arrays.asList(1, 2, 3);

    for(int i=0; i<3 ; i++){

        System.out.println("digite o valor "+(i+1)+":");
        list.add(scan.nextInt());

    }

    System.out.println(list.remove(2));
    System.out.println(list.toString());
    scan.close();

    }

    
public static void arrayForEach(){

    Scanner scan = new Scanner(System.in);
    // List<Float> list = new ArrayList<Float>();
    List<Integer> list = Arrays.asList(1, 2, 3);

    for(int i=0; i<3 ; i++){

        System.out.println("digite o valor "+(i+1)+":");
        list.add(scan.nextInt());

    }

    System.out.println(list.remove(2));
    System.out.println(list.toString());
    scan.close();

    }


public static void arrayMap(){

    Scanner scan = new Scanner(System.in);
    // List<Float> list = new ArrayList<Float>();
    List<Integer> list = Arrays.asList(1, 2, 3);

     //caso seja só uma linha pode utilizar dentro dos parente sem precisar abrir chaves e colocar o return
     list.stream().map(l ->{
        return l= l+1 ;
     });

    }


public static void arrayReduce(){

    Scanner scan = new Scanner(System.in);
    // List<Float> list = new ArrayList<Float>();
    List<Integer> list = Arrays.asList(1, 2, 3);
    Integer soma = list.stream()


    // .filter(n -> n%2!=0)
   .map(n -> n = n + 1)
    
    // .forEach(n -> System.out.println(n));

    .reduce((n1, n2) -> (n1 + n2))
    .orElse(0);
    System.out.println((soma));
    

    }


}


