import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Entre com os lados dos triangulo");
            double ladoA = sc.nextDouble();
            double ladoB = sc.nextDouble();
            double ladoC = sc.nextDouble();

            if (ladoA + ladoB < ladoC || ladoA + ladoC < ladoB || ladoB + ladoC < ladoA ) {
                System.err.println("não é um triangulo");
                sc.close();
                return;
            }
            if (ladoA == ladoB && ladoC == ladoA) {
                System.out.println("Triangulo equilatero");
            }
            else if ( ladoA == ladoB && ladoC != ladoA || ladoB == ladoC && ladoA != ladoB ) {
                System.out.println("Triangulo Isoceles");
            }
            else 
            System.out.println("Triangulo escaleno");


            sc.close();
    }
}
