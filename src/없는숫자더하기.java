import java.util.ArrayList;

public class 없는숫자더하기 {
    public static void main(String[] args) {
        int[] numbers1 = {1,2,3,4,6,7,8,0};
        int[] numbers2 = {5,8,4,0,6,7,9};
        System.out.println(solution(numbers1));
        System.out.println(solution(numbers2));
    }

    static public int solution(int[] numbers) {
        int answer = 45;
        for (int n : numbers) {
            answer -= n;
        }

        return answer;
    }
}
