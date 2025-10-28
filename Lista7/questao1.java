import java.util.Scanner;
public class questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entre com o número de linhas ");
            int linhas = sc.nextInt();
            int numero = 1;
            int n = 1;
            
            while (n<=linhas) {
                System.out.print(numero);
                System.out.print(" ");
                numero++;
                
                if ( numero % 2 ==0) {
                    System.out.println();
                    n++;
                }
               
               
                   
            }












        sc.close();
    }
}
