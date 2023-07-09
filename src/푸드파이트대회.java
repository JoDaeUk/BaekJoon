import java.util.ArrayList;
import java.util.List;

public class 푸드파이트대회 {
    public static void main(String[] args) {
        int[] food1 = {1,3,4,6};
        int[] food2 = {1,7,1,2};

        System.out.println(solution(food1));
        System.out.println(solution(food2));

    }

    static public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        int count = 0;
        for (int i=0; i<food.length; i++){
            while (food[i]/2>count){
                answer.append(i);
                count++;
            }
            count=0;
        }
        answer.append(0);
        for (int i=answer.length()-2; i>=0; i--){
            answer.append(answer.charAt(i));
        }
        return answer.toString();
    }
}
