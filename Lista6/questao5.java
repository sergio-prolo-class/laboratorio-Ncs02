import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] unidades = {
            "", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"
        };

        String[] especiais = {
            "dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"
        };

        String[] dezenas = {
            "", "", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"
        };

        System.out.print("Digite um número entre 1 e 99: ");
        int numero = scanner.nextInt();

        if (numero < 1 || numero > 99) {
            System.out.println("Número fora do intervalo permitido.");
        } else if (numero < 10) {
            System.out.println("Por extenso: " + unidades[numero]);
        } else if (numero < 20) {
            System.out.println("Por extenso: " + especiais[numero - 10]);
        } else {
            int dezena = numero / 10;
            int unidade = numero % 10;

            String resultado = dezenas[dezena];
            if (unidade != 0) {
                resultado += " e " + unidades[unidade];
            }

            System.out.println("Por extenso: " + resultado);
        }

        scanner.close();
    }
}