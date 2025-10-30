import java.util.Scanner;
public class questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entre com o número inteiro positivo ");
         int n = sc.nextInt();
         int contador = 1;
         int linha = 1;
      
        while (linha <= n) {
            int coluna = 1;

            while (coluna <= linha) {
                System.out.print(contador + " ");
                contador++;
                coluna++;
            }

            System.out.println(); 
            linha++;
        }
           sc.close();;      
            }
    }


