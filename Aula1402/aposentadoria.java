import java.util.Scanner;

public class aposentadoria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com a idade");
        int idade = sc.nextInt();
        System.out.println("Entre com o tempo");
        int tempo = sc.nextInt();
        if (idade >= 65 || tempo >= 30 || (idade >= 60 && tempo >= 25)) {
    System.out.println("Pode se aposentar");
    } else {
    System.out.println("Não pode se aposentar");
    }
    sc.close();






    }
    
}