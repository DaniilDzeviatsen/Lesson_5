public class Task2 {
    public static void main(String[] args) {
        String[][] arr = new String[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + 2) % 2 == 0) {
                    if ((j + 2) % 2 != 0) {
                        arr[i][j] = "B";
                    } else if ((j + 2) % 2 == 0){
                        arr[i][j] = "W";
                    }
                }
                if (((i + 2) % 2 != 0)) {
                    if ((j + 2) % 2 == 0) {
                        arr[i][j] = "B";
                    }else if ((j + 2) % 2 != 0)
                    {
                        arr[i][j] = "W";
                    }

                }System.out.print(arr[i][j] + " ");

            }System.out.println();
        }
    }
}
