import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com um valor em centavos ");
        int valor= sc.nextInt();
         int moedas = valor / 50;
            System.out.println("Numero de moedas de 50 centavos é " + moedas);
        valor = valor % 50;
         moedas = valor / 25;
            System.out.println("Numero de moedas de 25 centavos é " + moedas);
        valor = valor % 25;
         moedas = valor / 10;
            System.out.println("Numero de moedas de 10 centavos é " + moedas);
        valor = valor % 10; 
         moedas = valor / 5;
            System.out.println("Numero de moedas de 5 centavos é " + moedas);
        valor = valor % 5;
            System.out.println("Numero de moedas de 1 centavo é " + valor);
        



















        sc.close();
    }










 

}
