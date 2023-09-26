import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 음향더하기 {
    public static void main(String[] args) {
        int[] absolutes1 = {4,7,12};
        int[] absolutes2 = {1,2,3};

        boolean[] signs1 = {true,false,true};
        boolean[] signs2 = {false,false,true};

        System.out.println(solution(absolutes1,signs1));
        System.out.println(solution(absolutes2,signs2));
    }
    static public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < signs.length; i++) {
            if (signs[i]) {
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }

        return answer;
    }
}
