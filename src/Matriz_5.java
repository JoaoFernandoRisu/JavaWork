import java.util.Scanner;

public class Matriz_5 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        String[] unidades = {"unidade1", "unidade2", "unidade3"};
        String[] cursos = {"curso1", "curso2", "curso3", "curso4", "curso5"};

        int[][] matriculasUm = new int[cursos.length][unidades.length];
        int[][] matriculasDois = new int[cursos.length][unidades.length];
        int[][] anual = new int[cursos.length][unidades.length];

        // ====== Leitura de dados ======
        System.out.println("=== Primeiro Semestre ===");
        for (int i = 0; i < cursos.length; i++) {
            for (int j = 0; j < unidades.length; j++) {
                System.out.print("Curso: " + cursos[i] + " | Unidade: " + unidades[j] + " | Matrículas: ");
                matriculasUm[i][j] = e.nextInt();
            }
        }

        System.out.println("\n=== Segundo Semestre ===");
        for (int i = 0; i < cursos.length; i++) {
            for (int j = 0; j < unidades.length; j++) {
                System.out.print("Curso: " + cursos[i] + " | Unidade: " + unidades[j] + " | Matrículas: ");
                matriculasDois[i][j] = e.nextInt();
            }
        }

        // ====== Cálculo anual ======
        for (int i = 0; i < cursos.length; i++) {
            for (int j = 0; j < unidades.length; j++) {
                anual[i][j] = matriculasUm[i][j] + matriculasDois[i][j];
            }
        }

        // ====== a) Matrículas de cada curso por unidade ======
        System.out.println("\n=== (a) Matrículas de cada curso por unidade ===");
        for (int i = 0; i < cursos.length; i++) {
            System.out.println("\nCurso: " + cursos[i]);
            for (int j = 0; j < unidades.length; j++) {
                System.out.println("  Unidade: " + unidades[j] + " | Matrículas anuais: " + anual[i][j]);
            }
        }

        // ====== b) Total de matrículas por unidade ======
        System.out.println("\n=== (b) Total de matrículas por unidade ===");
        for (int j = 0; j < unidades.length; j++) {
            int totalUnidade = 0;
            for (int i = 0; i < cursos.length; i++) {
                totalUnidade += anual[i][j];
            }
            System.out.println("Unidade: " + unidades[j] + " | Total anual: " + totalUnidade);
        }

        // ====== c) Total de matrículas por curso ======
        System.out.println("\n=== (c) Total de matrículas por curso ===");
        for (int i = 0; i < cursos.length; i++) {
            int totalCurso = 0;
            for (int j = 0; j < unidades.length; j++) {
                totalCurso += anual[i][j];
            }
            System.out.println("Curso: " + cursos[i] + " | Total anual: " + totalCurso);
        }
    }
}
