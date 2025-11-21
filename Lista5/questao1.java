import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em fahrenheint: ");
        double tempF = sc.nextDouble();
        
        double celsius = (tempF- 32) * 5/9;
        System.out.printf("Temperatura em celsius é %.3f%n" , celsius);

        
    
    
    
        sc.close();
    }
}