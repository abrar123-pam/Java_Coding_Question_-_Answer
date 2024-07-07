package DSAquestions;

public class setMatrixZero {
    public static  void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j] == 0)
                    matrix[i][j] = -1;
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j] == -1){
                    matrix[i][j] = 0;
                    makeZero(i,j,n,m,matrix);
                }

            }
        }



    }

    public static void makeZero(int r, int c, int n, int m, int[][] matrix) {
        for (int i = 0; i < n; i++) {
            if (matrix[i][c] != -1)
                matrix[i][c] = 0;
        }

        for (int j = 0; j < m; j++) {
            if (matrix[r][j] != -1)
                matrix[r][j] = 0;
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};

        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
        setZeroes(arr);
        System.out.println("---------------------------------------------------");
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }

    }
}