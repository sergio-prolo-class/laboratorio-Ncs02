import java.util.Scanner;
public class questao1 {
    static final Scanner IN = new Scanner(System.in);
    static final int alunoParaMetodo = IN.nextInt();
    static final int numeroAlunosCrescente = 1;
   
       
        static double menorDeTres(double a, double b, double c) {
        double min = a; 
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }


    static double calcularMediaDosMaiores(double x1, double x2, double x3) { 
         int aluno = alunoParaMetodo;
         System.out.print("Entre com as notas das provas do aluno 1");
            while (x1>10 || x2>10 || x3>10) {
             System.out.println("Entre com um valor maior que 0 e menor que 10");
           x1 = IN.nextDouble();
           x2 = IN.nextDouble();
           x3 = IN.nextDouble();
            }
            while (numeroAlunosCrescente < aluno) {
                System.out.println("Entre com as notas dos Trabalhos do aluno" + numeroAlunosCrescente);
                
                double mediaAritimetica = (x1 + x2 + x3 - menorDeTres(x1, x2, x3)) / 2;
                double mediaFinal = 0.8 * mediaAritimetica + 0.2 * calcularMediaDosMaiores(x1, x2, x3);
                System.out.println("Média final = " + mediaFinal);    
                numeroAlunosCrescente = numeroAlunosCrescente + 1 ;
                System.out.println("Entre com as provas do aluno ");            
        }
        return (x1 + x2 + x3 - menorDeTres(x1, x2, x3)) / 2;
    } 
    

static double calcularMediaDosTrabalhos(double x1, double x2, double x3) {
       
        return (x1 + x2 + x3 - menorDeTres(x1, x2, x3)) / 2;
}



    
                 
                 
        

    static void numeroAlunos() {
        int  alunoParaMetodo = IN.nextInt();
        while ( alunoParaMetodo < 1) {
            System.out.println("Número de alunos inválido");
            alunoParaMetodo = IN.nextInt();
        }
        
    }


    public static void main(String[] args) {
        System.out.println("Entre com o número de alunos");
        numeroAlunos();
       calcularMediaDosMaiores(double x1, double x2, double x3)
        
        
        
        IN.close();
    }


    }
