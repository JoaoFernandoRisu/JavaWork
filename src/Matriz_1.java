import java.sql.SQLOutput;
import java.util.Scanner;
public class Matriz_1 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        int[][] cliente = new int[3][5];
        int bonus = 0, milhagem = 0;

        for(int i = 0; i<3; i++) {
            System.out.println("Digite o código do cliente "+(i+1)+": ");
            cliente[i][0] = e.nextInt();
            System.out.println("Digite a quantidade de milhagem: ");
            cliente[i][1] = e.nextInt();
            do{
                System.out.println("Categoria: ");
                cliente[i][2] = e.nextInt();
            }while(cliente[i][2]!=1 && cliente[i][2]!=2 && cliente[i][2]!=3);
            if(cliente[i][2]==1){
                cliente[i][3] = 10000;
            }
            else if(cliente[i][2]==2){
                cliente[i][3] = 5000;
            }
            else{
                cliente[i][3] = 0;
            }
            cliente[i][4] = cliente[i][1] + cliente[i][3];
        }

        for(int m = 0; m<3; m++){
                System.out.println("Código do cliente: "+cliente[m][0]+"; qtd. milhagem: "+cliente[m][1]+"; Categoria: "+cliente[m][2]+"; Bonus: "+cliente[m][3]+"; Milhagem atual: "+cliente[m][4]);
        }
    }
}
