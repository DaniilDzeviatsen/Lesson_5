import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num of rows");
        int m= sc.nextInt();
        System.out.println("enter num of columns");
        int n=sc.nextInt();
        int sum=0;
        int [][] arr = new int [m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int p=(int)(Math.random()*1000);
                arr[i][j]=p;
                sum=sum+p;
            }
        }
        System.out.println(sum);
    }
}
