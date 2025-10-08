import java.util.Scanner;
public class Matriz_9 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        String[] produto = {"produto1","produto2","produto3"};
        String[] loja = {"loja1","loja2","loja3"};
        double[][] vendasPrimeiroMes = new double[3][3];
        double[][] vendasSegundoMes = new double[3][3];
        double[][] bimestre = new double[3][4];

        System.out.println("Informe as vendas do primeiro mês:");
        for (int i = 0; i<3; i++) {
            System.out.println("loja "+(i+1)+": ");
            for (int j = 0; j<3; j++) {
                System.out.println("Venda "+(j+1)+": ");
                vendasPrimeiroMes[i][j] = e.nextDouble();
            }
        }

        System.out.println("Informe as vendas do segundo mês:");
        for (int i = 0; i<3; i++) {
            System.out.println("loja "+(i+1)+": ");
            for (int j = 0; j<3; j++) {
                System.out.println("Venda "+(j+1)+": ");
                vendasSegundoMes[i][j] = e.nextDouble();
            }
        }

        System.out.println("Informe as 3 metas de venda:");
        for (int i = 0; i<3; i++) {
            System.out.println("Menta "+(i+1)+": ");
            bimestre[i][3] = e.nextDouble();
        }

        for (int i = 0; i<3; i++) {
            for (int j = 0; j<3; j++) {
                bimestre[i][j] = vendasPrimeiroMes[i][j]+vendasSegundoMes[i][j];
            }
        }

        System.out.println("As vendas de cada produto em cada loja no bimestre:");
        for (int i = 0; i<3; i++) {
            System.out.println("Loja "+(i+1)+": ");
            double total = 0;
            for (int j = 0; j<3; j++) {
                total += bimestre[i][j];
            }
            System.out.println("Vendas: "+total);
        }

        double max = bimestre[0][0];
        double min = bimestre[0][0];
        int x = 0, y = 0;
        System.out.println("Identificar o produto com a melhor saída no bimestre:");
        System.out.println("A loja com a menor venda no bimestre:");
        for (int i = 0; i<3; i++) {
            for (int j = 0; j<3; j++) {
                if (max<bimestre[i][j]) {
                    x = i;
                }
                if (min>bimestre[i][j]) {
                    y = j;
                }
            }
        }
        System.out.println("Produto: "+produto[x]);
        System.out.println("Loja: "+loja[y]);

        int cont = 0;
        System.out.println("Quantos produtos atingiram meta no bimestre:");
        for (int i = 0; i<3; i++) {
            for (int j = 0; j<3; j++) {
                if (bimestre[i][j]==bimestre[i][3]) {
                    cont++;
                }
            }
        }
        System.out.println("Quantidade: "+cont);

    }
}
