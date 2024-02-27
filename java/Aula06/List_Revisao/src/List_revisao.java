import java.util.ArrayList;
import java.util.List;

public class List_revisao {

    public static void main(String[] args){

        
    }

    public static void filter2(String[] args){
        List<Integer> lista = new ArrayList<>();

           
        for(int i = 0; i<lista.size();i++){
            if(lista.get(i)%2 == 0)
                System.out.println(lista.get(i));
        }

   
        for(Integer valor: lista){
            if(valor%2 != 0)
                System.out.println(valor);
        }
    
       lista.forEach(valor -> {
            if(valor%2 == 0)
                System.out.println(valor);
        });

        lista.stream()
            .filter(valor ->(valor % 2 ==0 ))
            .forEach(valor -> System.out.println(valor));
                
            }

    
    
    public static void filter1(String[] args){
        List<Integer> lista = new ArrayList<>();

           
        for(int i = 0; i<lista.size();i++){
            if(lista.get(i)%2 == 0)
                System.out.println(lista.get(i));
        }

   
        for(Integer valor: lista){
            if(valor%2 != 0)
                System.out.println(valor);
        }
    
       lista.forEach(valor -> {
            if(valor%2 == 0)
                System.out.println(valor);
        });

    }

    public static void metodoPercorrer(String[] args) throws Exception {
        
        List<Float> lista = new ArrayList<>();

    //metodo 1 de percorrer uma list vetor no java 
    for(int i = 0; i<lista.size();i++){
        System.out.println(lista.get(i));
    }

    //metodo 2 de percorrer uma list vetor no java 
    for(Float valor: lista){
        System.out.println(valor);
    }
    
    //metodo 3 de percorrer uma list vetor no java 
    //o forEach vai percorrer o vetor e, em cada casa do vetor o valor dentro dele vai para o parametro "valor" e percorre o que foi programado
    lista.forEach(valor -> {
        System.out.println(valor);
    });

    }
}
