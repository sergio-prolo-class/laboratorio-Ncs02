import java.util.Scanner;

public class imc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com a altura em metros e o peso em quilo");
        double altura= sc.nextDouble();
        double peso = sc.nextDouble();
            if (altura < 0|| peso  < 0) {
            System.err.println("altura ou peso invalidos ");
            sc.close();
            return; 
            } 
        
                double imc = peso / (altura*altura);
                System.out.printf("Seu imc é %.3f %n" , imc);
                if (imc<18.5) { 
                    System.out.println(" Abaixo do peso");
                } else if (imc>18.5 && imc <24.9) {
                    System.out.println(" Peso normal");
                } else if (imc > 25 && imc < 29.9) {
                    System.err.println(" Sobrepeso");
                } else {
                    System.err.println(" Obesidade");
                } 

    sc.close();
    }
}
