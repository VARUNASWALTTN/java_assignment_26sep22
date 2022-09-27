import java.util.*;

public class Q4
{
    public static void main(String[] args) {
        int rows,cols,row,col;

        int arr[][] = {
                {11, 2, 13},
                {4, 15, 6},
                {7, 8, 19}
        };

        rows = arr.length;
        cols = arr[0].length;

       for(int i = 0; i < rows; i++){
            row = 0;
            for(int j = 0; j < cols; j++){
                row = row + arr[i][j];
            }
            System.out.println((i+1) +" row: " + row);
        }

        for(int i = 0; i < cols; i++){
            col = 0;
            for(int j = 0; j < rows; j++){
                col = col + arr[j][i];
            }
            System.out.println((i+1) +" column: " + col);
        }
    }
}