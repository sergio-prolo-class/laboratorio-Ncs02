import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o primeiro digito");
        int verificador = 0;
        int n1 = sc.nextInt();

        System.out.println("Entre com os proximos 6 digitos");
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        int n5 = sc.nextInt();
        int n6 = sc.nextInt();
        int n7 = sc.nextInt();

        System.out.println("Entre com os próximos 5 digitos");
        int n8 = sc.nextInt();
        int n9 = sc.nextInt();
        int n10 = sc.nextInt();
        int n11 = sc.nextInt();
        int n12 = sc.nextInt();

            verificador = (n1 + n3 + n5 + n7 + n9 + n11) + (n2 + n4 + n6 + n8 + n10 + n12)*3; 
            verificador = verificador - 1;
            verificador = verificador % 10;
            verificador = 9 - verificador;

                System.out.println("Digito verificador :" + verificador);

        sc.close();
    }
}