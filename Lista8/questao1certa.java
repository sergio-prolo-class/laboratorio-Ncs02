import java.util.Scanner;

public class  questao1certa {

    // Retorna o menor de três valores
    static double menorDeTres(double a, double b, double c) {
        double menor = a;
        if (b < menor) menor = b;
        if (c < menor) menor = c;
        return menor;
    }

    // Calcula a média dos dois maiores valores
    static double mediaDosMaiores(double x1, double x2, double x3) {
        return (x1 + x2 + x3 - menorDeTres(x1, x2, x3)) / 2;
    }

    // Calcula a média final ponderada
    static double mediaFinal(double mediaProvas, double mediaTrabalhos) {
        return 0.8 * mediaProvas + 0.2 * mediaTrabalhos;
    }

    // Lê uma nota válida entre 0 e 10
    static double lerNotaValida(Scanner sc, int numero) {
        double nota;
        do {
            System.out.printf("Nota %d: ", numero);
            nota = sc.nextDouble();
            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
            }
        } while (nota < 0 || nota > 10);
        return nota;
    }

    // Lê o número de alunos (≥ 1)
    static int lerNumeroDeAlunos(Scanner sc) {
        int n;
        do {
            System.out.print("Entre com o número de alunos: ");
            n = sc.nextInt();
            if (n < 1) {
                System.out.println("Número inválido! Deve ser maior ou igual a 1.");
            }
        } while (n < 1);
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalAlunos = lerNumeroDeAlunos(sc);
        double somaMedias = 0;

        for (int i = 1; i <= totalAlunos; i++) {
            System.out.printf("Entre com as notas das provas do aluno %d:%n", i);
            double p1 = lerNotaValida(sc, 1);
            double p2 = lerNotaValida(sc, 2);
            double p3 = lerNotaValida(sc, 3);
            double mediaProvas = mediaDosMaiores(p1, p2, p3);

            System.out.printf("Entre com as notas dos trabalhos do aluno %d:%n", i);
            double t1 = lerNotaValida(sc, 1);
            double t2 = lerNotaValida(sc, 2);
            double t3 = lerNotaValida(sc, 3);
            double mediaTrabalhos = mediaDosMaiores(t1, t2, t3);

            double media = mediaFinal(mediaProvas, mediaTrabalhos);
            System.out.printf("Média final do aluno %d: %.2f%n", i, media);

            somaMedias += media;
        }

        double mediaDisciplina = somaMedias / totalAlunos;
        System.out.printf("Média da disciplina: %.2f%n", mediaDisciplina);

        sc.close();
    }
}

