import java.util.Scanner;

public class Metodos_string {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

/*Inicio */
        //o valor é imutavel, não se atualiza sozinho. necessida atribuir o novo valor a uma variavel nova ou a ela mesma
        String string = scan.nextLine();
        string = string.toUpperCase();

/*CONCATENAÇÃO */

        //metodo 1 de string de concatenação 
        String string2 = string.concat(string.concat(string));

/*COMPARAÇÃO */

        // metodo 1 de strings de comparação 
        if(string == string2){
            System.out.println("Sâo iguais");
        }
        else{
            System.out.println("São diferentes");
        }

        // metodo 2 de strings de comparação 
        if(string.equals(string2)){
            System.out.println("São iguais");
        }

        // metodo 3 de strings de comparação 
        //ou usar if(string.toUpperCase() == string.toUpperCase()){};
        if(string.compareToIgnoreCase(string2) == 0)
        {
            System.out.println("São iguais");
        }

        String string3 = " Hellow my name is  your name ";

/*TRIM */

        // metodo 1 de string de remoção de espaço de uma sting
        string3 = string3.trim();

/*SPLIT */

        //split é o fatiador de string, escolha o caracter que sera fatiada e armazena o proximo caracter idepentende do que seja
        String string4 = "mateus de oliveira gomes";
        String [] listNome = string4.split(" ");
        


        for (String valor : listNome) {
            System.out.println(valor);
        }
        
    scan.close();
    }

}
