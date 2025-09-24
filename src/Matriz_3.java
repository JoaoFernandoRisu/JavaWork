import java.util.Scanner;
import java.text.DecimalFormat;
public class Matriz_3 {
    public static void main(String[] args) {

        String[] lojas = {"A","B","C","D","E","F","G","H"};
        String[] produtos = {"W","X","Y","Z"};
        double[][] precos = new double[4][8];

        DecimalFormat df = new DecimalFormat("0.00");

        for(int i=0; i<4; i++){
            for(int j=0; j<8; j++){
                precos[i][j] = (double) (Math.random() * 190);
                if(precos[i][j]<120.00){
                    System.out.println("Loja: "+lojas[j]+"; Produto: "+produtos[i]+"; Preço: "+df.format(precos[i][j]));
                }
            }
        }

    }
}
