import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com as 4  notas e a presença ");
        
        double nota = sc.nextDouble();
        
        nota += sc.nextDouble();
        nota += sc.nextDouble();
        nota += sc.nextDouble();;
        nota = nota/4;

        int presenca = sc.nextInt();

        System.out.printf("Média = %.1f %s%n ", nota, nota >= 6 && presenca >= 75 ? "Aprovado" : "Reprovado");





        sc.close();

    }














}
