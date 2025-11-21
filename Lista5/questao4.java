import java.util.Scanner;

public class questao4 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Entre com um ano");
    int ano = sc.nextInt();
   
    System.out.println(  ano % 400 == 0  ? " é bissexto" : ano %4 == 0 && ano % 100 == 0 ? "não é bissexto" : ano % 4 == 0 ? "é bissexto" : "não é bissexto"   );    

 sc.close();
 }

}
