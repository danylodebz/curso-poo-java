import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero de linhas: ");
        int m = sc.nextInt();

        System.out.println("Digite o numero de colunas: ");
        int n = sc.nextInt();

        int[][] mat = new int[m][n];

        System.out.println("Digite os elementos da matriz: ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matriz informada:");

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + "\t"); // \t para separar as colunas
            }
            System.out.println(); // Move para a próxima linha após cada linha da matriz
        }

        System.out.println("Digite um valor pertencente a matriz: ");
        int x = sc.nextInt();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (x == mat[i][j]) {
                    if (j > 0) {
                        System.out.println("Left: " + mat[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + mat[i - 1][j]);
                    }
                    if (j < mat[i].length - 1) {
                        System.out.println("Right: " + mat[i][j + 1]);
                    }
                    if (i < mat.length - 1) {
                        System.out.println("Down: " + mat[i + 1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}


