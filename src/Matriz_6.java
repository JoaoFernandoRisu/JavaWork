import java.util.Scanner;
public class Matriz_6 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        String[] produtos = {"produto1","produto2","produto3","produto4","produto5"};
        int[] custoTransporte = {1, 2, 3, 4, 5};
        double[][] precoProdutoPorLoja = new double[5][4];
        double[][] impostoPorProduto = new double[5][4];
        double[][] custoFinal = new double[5][4];

        for (int i = 0; i< 4; i++) {
            System.out.println("Loja: "+(i+1));
            for (int j = 0; j< 5; j++){
                System.out.println("Preço produto : "+(j+1));
                precoProdutoPorLoja[j][i] = e.nextDouble();
                if (precoProdutoPorLoja[j][i]>100) {
                    impostoPorProduto[j][i] = 0.2;
                }
                else if (precoProdutoPorLoja[j][i]<100 && precoProdutoPorLoja[j][i]<50.1) {
                    impostoPorProduto[j][i] = 0.1;
                }
                else {
                    impostoPorProduto[j][i] = 0.05;
                }
                custoFinal[j][i] = precoProdutoPorLoja[j][i]+custoTransporte[j]+(precoProdutoPorLoja[j][i]*impostoPorProduto[j][i]);
            }
        }

        for (int i = 0; i< 4; i++) {
            for (int j = 0; j< 5; j++){
                System.out.println("Nome do produto: "+produtos[j]+
                        "; Loja: "+(i+1)+"; Valor do imposto: "+impostoPorProduto[j][i]+
                        "; Custo do transporte: "+custoTransporte[j]+
                        "; Preço do produto: "+precoProdutoPorLoja[j][i]+
                        "; Preço final: "+custoFinal[j][i]);
            }
        }

    }
}
