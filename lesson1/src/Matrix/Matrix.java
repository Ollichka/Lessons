package Matrix;

import   java.util.Random;

public class Matrix {

    private static Random random = new Random();

    public void rotate(){
        int m[][] = fill(3);
        int[][] mr = rotateMatrix(m);
        print(m);
        print(mr);
    }

    public  int[][]  rotateMatrix(int[][] m){
        int [][] mr = new int[m.length][m.length];
        for(int i = 0;i<m.length;i++){
            for(int j = 0;j<m.length;j++){
                mr[i][j] = m[j][m.length-i-1];
            }
        }
        return mr;
    }

    public  void print(int[][] m){
        for(int i = 0;i<m.length;i++){
            for(int j = 0;j<m.length;j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println("\n");
        }
    }

    public  int[][]  fill(int n){
        int [][] m = new int[n][n];
        for(int i = 0;i<m.length;i++){
            for(int j = 0;j<m.length;j++){
                m[i][j] = random.nextInt();
            }
        }
        return m;
    }
}
