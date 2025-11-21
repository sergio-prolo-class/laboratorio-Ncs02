import java.util.Scanner;
public class SomaDigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com um numero inteiro não negativo");
        int numero = sc.nextInt();
        int separacao = 0;
        int soma = 0;
            
            while (numero>0) {
                separacao = numero % 10;
                numero = numero / 10 ;
                soma = soma+ separacao;
            }
            
            System.out.println("Soma de digitos " + soma);
            sc.close();
    }
}