import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num of rows");
        int m = sc.nextInt();
        System.out.println("enter num of columns");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int p = (int) (Math.random() * 100);
                arr[i][j] = p;


            }

        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Arrays.sort(arr[i]);
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
    }
}