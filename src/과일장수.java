import java.util.Arrays;
import java.util.Scanner;

public class 과일장수 {
    public static void main(String[] args) {
        int[] score1 = {1, 2, 3, 1, 2, 3, 1};
        int[] score2 = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        System.out.println(solution(3,4,score1));
        System.out.println(solution(4,3,score2));
    }

    static public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        for(int i=score.length-1; i>=m-1; i-=m) {
            int[] temp = new int[m];
            for(int j=i, l=0; j>i-m; j--, l++) {
                temp[l] = score[j];
            }
            int min = Arrays.stream(temp)
                    .min()
                    .getAsInt();
            answer += min * m;
        }
        return answer;
    }
}
