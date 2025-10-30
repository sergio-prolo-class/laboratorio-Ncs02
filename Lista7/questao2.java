import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a senha");
        
        int senha = 314159;
        int suasenha = sc.nextInt();
        int tentativas = 0;

        while (tentativas < 3) {
            if (senha != suasenha) {
                System.out.println("Acesso negado / SENHA INCORRETA ");
                System.out.println(" Entre com a senha");
            }
            else {
                System.out.println("Acesso autorizado" );
                return;
            } 
            
        tentativas++;
            if (tentativas == 3 ) {
            System.out.println("SISTEMA BLOQUEADO");
            return;
        }
        suasenha = sc.nextInt();
        }
        
    
        sc.close();
    }
}
