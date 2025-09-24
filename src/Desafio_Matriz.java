import java.util.Locale;
import java.util.Scanner;

public class Desafio_Matriz {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] numerosSorteados = new int[6];
        int[] numeros = new int[60];
        int[] numerosEscolhidos = new int[6];
        int[] vetor = new int[60];
        int[] vetor2 = new int[60];
        int acertos = 0;
        String mensagem;


        System.out.println("--------- NÚMEROS SORTEADOS -------------");
        System.out.println();
        for (int i = 0; i < 60; i++) {
            numeros[i] = (i + 1);
        }
        for (int i = 0; i < 6; i++) {
            System.out.println("Informe o " + (i + 1) + "o. número sorteado: ");
            numerosSorteados[i] = sc.nextInt();
        }
        System.out.println("----------------------------------");
        System.out.println();
        for (int i = 0; i < 60; i++) {
            for (int j = 0; j < 6; j++) {
                if (numeros[i] == numerosSorteados[j]) {
                    vetor[i] = 1;
                    break;
                } else if (numeros[i] != numerosSorteados[j]) {
                    vetor[i] = 0;
                }
            }
        }

        for (int i = 0; i < 60; i++){
            if (vetor[i] == 1){
                System.out.print("X ");
            } else if (vetor[i] == 0 && numeros[i] < 10) {
                System.out.print("0"+numeros[i]+" ");
            }else if(vetor[i] == 0 && numeros[i] % 10 == 0){
                System.out.println(numeros[i]);
            } else {
                System.out.print(numeros[i]+" ");
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("-------NÚMEROS APOSTADOS---------");
        System.out.println();
        for (int i = 0; i < 6; i++) {
            System.out.println("Informe o " + (i + 1) + "o. número apostado: ");
            numerosEscolhidos[i] = sc.nextInt();
        }
        System.out.println("----------------------------------------------");
        System.out.println();


        for (int i = 0; i < 60; i++) {
            for (int j = 0; j < 6; j++) {
                if (numeros[i] == numerosEscolhidos[j]) {
                    vetor2[i] = 1;
                    break;
                } else if (numeros[i] != numerosEscolhidos[j]) {
                    vetor2[i] = 0;
                }
            }
        }

        for (int i = 0; i < 60; i++){
            if (vetor2[i] == 1){
                System.out.print("X ");
            } else if (vetor2[i] == 0 && numeros[i] < 10) {
                System.out.print("0"+numeros[i]+" ");
            }else if(vetor2[i] == 0 && numeros[i] % 10 == 0){
                System.out.println(numeros[i]);
            } else {
                System.out.print(numeros[i]+" ");
            }
        }

        System.out.println();

        for (int j = 0; j < 6; j++) {
            if (numerosEscolhidos[j] == numerosSorteados[j]) {
                acertos++;
            }
        }


        if (acertos < 3) {
            mensagem = " - O Usuário não ganho NADA";
        } else if (acertos == 4) {
            mensagem = " - O Usuário fez uma QUADRA";
        } else if (acertos == 5) {
            mensagem = " - O Usuário fez uma QUINA";
        } else {
            mensagem = "O Usuário fez uma SENA";
        }
        System.out.print("Resultado: Acertos= " + acertos + mensagem);


        sc.close();
    }
}
