import java.util.Scanner;
public class questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com a classe (1-arqueiro, 2-bárbaro, 3-druida, 4-mago: )");
        System.err.println("Entre com a vitalidade desejada");
        int classe = sc.nextInt();
        int vitalidade = sc.nextInt();
        int armazenador = 0;
        int nivel ;
            if (classe != 1 || classe !=2 || classe !=3 || classe != 4) {
                System.out.println("Classe invalida");
                return;
            }
       while (vitalidade!= armazenador) {
        switch (classe) {
            case 1 -> { 
                
        }
       }


    }


}