import java.util.Arrays;

public class Kuliza {
    public static void main(String[] args) {
        System.out.println("hi");
        int[] i = {5, 4, 3, 2, 1, 11, 10, 14, 13, 12, 9};
        solution(11, i);
        int[][] a = {{1, 2,3},{4,5,6},{7,8,9}};
        solution(3,3,a);
    }

    public static void solution(int N, int[] K) {
        //
        // write your logic here and print the desired output
        //
        Arrays.sort(K);
        int MAX = 0;
        int counter = 1;
        for (int i = 0; i < N - 1; i++) {
            if (K[i + 1] - K[i] == 1) {
                counter++;
            } else {
                if (counter > MAX) {
                    MAX = counter;
                }
                counter = 1;
            }
        }
        if (counter > MAX) {
            MAX = counter;
        }
        System.out.println(MAX);
    }

    public static void solution(int R,int C, int[][] M){
        //
        // write your logic here and print the desired output
        //
        for (int i = 0; i<R-1;i++){
            printMatrix(R-i, C-i, M, 0+i,0+i);
        }
    }

    public static void printMatrix(int R,int C, int[][] M, int sR, int sC){
        for(int i =sC; i< C; i++){
            System.out.print(M[sC][i]);
        }
        for(int i =sR+1; i< R; i++){
            System.out.print(M[i][C-1]);
        }
        for(int i =C-2; i>=sC; i--){
            System.out.print(M[R-1][i]);
        }
        for(int i =R-2; i>sR; i--){
            System.out.print(M[i][sR]);
        }
    }
}
