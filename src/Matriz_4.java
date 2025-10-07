import java.util.Scanner;
public class Matriz_4 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        String[] nomeProduto = {"A","B","C","D","E"};
        String[] nomeLoja = {"lojaA","lojaB","lojaC","lojaD","lojaE"};
        double[][] preco = new double[5][5];

        for (int i = 0; i<5; i++){
            System.out.println("Loja "+(i+1));
            for (int j = 0; j<5; j++){
                System.out.println("Produto "+(j+1));
                preco[i][j] = e.nextDouble();
            }
        }

        double max = preco[0][0];
        double min = preco[0][0];
        int produtoMax = 0;
        int lojaMax = 0;
        int produtoMin = 0;
        int lojaMin = 0;


        for (int i = 0; i<5; i++){
            for (int j = 0; j<5; j++){
                if (max<preco[i][j]) {
                    max = preco[i][j];
                    produtoMax = j;
                    lojaMax = i;
                }
                if (min>preco[i][j]) {
                    min = preco[i][j];
                    produtoMin = j;
                    lojaMin = i;
                }
            }
        }

        System.out.println("Produto mais caro: "+nomeProduto[produtoMax]+"; Loja: "+nomeLoja[lojaMax]+"; Preço: "+max);
        System.out.println("Produto mais barato: "+nomeProduto[produtoMin]+"; Loja: "+nomeLoja[lojaMin]+"; Preço: "+min);
    }
}
