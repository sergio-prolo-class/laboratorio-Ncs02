import java.util.Scanner;
public class questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o valor em angulo");

        double angulo = sc.nextDouble();
        double seno ;
        double senoReal;

        if (angulo>360 || angulo<0) {
            System.out.println("Entre com um angulo entre 0-360");
            sc.close();
            return;
        }
        
            seno =(4*angulo * (180-angulo)) / (40500 - angulo * (180 - angulo));
            angulo = ((angulo* Math.PI) / 180) ;
            senoReal = Math.sin(angulo);
        
       System.out.printf("Seno aproximado : %.4f %n" ,seno );
       System.out.printf("Seno real : %.4f %n" ,senoReal);


        sc.close();
    };
}
