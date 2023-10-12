import java.util.Arrays;

public class 행열의덧샘 {
    public static void main(String[] args) {
        int[][] arr11 ={{1,2},{2,3}};
        int[][] arr12 ={{1},{2}};

        int[][] arr21 ={{3,4},{5,6}};
        int[][] arr22 ={{3},{4}};

        System.out.println(Arrays.deepToString(solution(arr11, arr21)));
        System.out.println(Arrays.deepToString(solution(arr12, arr22)));
    }
    static int[][] solution(int[][] arr1, int[][] arr2) {
        for(int i=0 ; i<arr1.length ; i++) {
            for(int j=0 ; j<arr1[0].length ; j++) {
                arr1[i][j] += arr2[i][j];
            }
        }
        return arr1;
    }
}
