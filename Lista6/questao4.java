import java.util.Scanner;
public class questao4 {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o valor da negociação");
        double valor = sc.nextDouble();
        double comissao;

        if (valor<2500) {
            comissao = 30 + 0.017 * valor ;            
        }
        else if (valor >= 2500 && valor < 6250) {
            comissao = 56 + 0.0066 * valor;
        }
        else if (valor >= 6250 && valor < 20000) {
            comissao = 76 + valor * 0.0034;
        }
        else if (valor >= 20000 && valor < 50000) {
            comissao = 100 + valor * 0.0022;
        }
        else if (valor >= 50000 && valor <= 500000) {
            comissao = 155 + valor * 0.0011;
        }
        else 
            comissao = 255 + valor * 0.009;

        if (comissao < 39) {
            comissao = 39;
        }

        System.out.println("Taxa de corretagem : R$ " + comissao);

        sc.close();
    }
}