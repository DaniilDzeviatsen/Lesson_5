import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st lentgh");
        int y=sc.nextInt();
        System.out.println("enter 2nd length");
        int u=sc.nextInt();
        System.out.println("enter 3d length");
        int o=sc.nextInt();
int [][][]arr=new int[y][u][o];
                System.out.println("Enter increasing number");
                int m=sc.nextInt();
                for (int i=0; i<y;i++){
                    for (int j=0; j<u; j++){
                        for (int k=0; k<o; k++){
                            arr [i][j][k]=k+m;
                            System.out.print(k+m+" ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                }

    }
}
