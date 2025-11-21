import java.util.Scanner;
public class questao1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       System.err.println("Entre com o valor de vendas e avaliação");
        double vendas = sc.nextDouble();
        double avaliacao = sc.nextDouble();
        double comissao  ;
        double remuneracao  ;

        comissao = vendas * 0.05;

            if (avaliacao > 10 || avaliacao < 1) {
                sc.close();
                System.err.println("Coloque uma avaliação de 1-10");
                return;
            }
            if (vendas>10000 ) {
                comissao = 0.07 * vendas;
            }
            else if (vendas>10000 && avaliacao >= 8) {
                comissao = 0.07 * vendas + 500;
            }
            
            remuneracao = 2000 + comissao ;
        System.out.println("Remuneração = R$" + remuneracao);

       sc.close();
    }


}
