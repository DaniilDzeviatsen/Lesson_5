import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter num of rows");
        int m= sc.nextInt();
        System.out.println("enter num of columns");
        int n=sc.nextInt();
                int [][] arr = new int [m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int p=(int)(Math.random()*10);
                arr[i][j]=p;

                if (i==j){
                    System.out.print(arr[i][j]+" ");
                }else if (i+j== arr.length-1){
                                   System.out.print(arr[i][j]+" ");
                }
                else if (i!=j){
                    arr[i][j]=0;
                    System.out.print(0+" ");
                }




            }System.out.println();

        }

    }
}
