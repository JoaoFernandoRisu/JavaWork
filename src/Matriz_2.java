import java.util.Scanner;
public class Matriz_2 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        int[][] M = new int[2][2];
        int[][] R = new int[2][2];

        int max = M[0][0];

        for(int i = 0; i<2; i++){
            for(int j = 0; j<2; j++){
                System.out.println("Num matriz M: ");
                M[i][j] = e.nextInt();
                if(max<M[i][j]){
                    max = M[i][j];
                }
            }
        }
        System.out.println("Matriz R: ");
        for(int i = 0; i<2; i++){
            for(int j = 0; j<2; j++){
                R[i][j] = max*M[i][j];
                System.out.println(R[i][j]);
            }
        }
    }
}
