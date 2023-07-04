import java.util.Arrays;

public class 가장가까운같은글자 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution("banana")));
        System.out.println(Arrays.toString(solution("foobar")));
    }

    static int[] solution(String s) {
        int[] answer = new int[s.length()];

        Arrays.fill(answer,0);
        for (int i=0; i<s.length(); i++){
            int index = i;
            if(answer[i]!=0) continue;
            answer[i] = -1;
            for(int j=i+1; j<s.length(); j++){
                if(s.charAt(i)==s.charAt(j)){
                    answer[j]=j-index;
                    index = j;
                }
            }
        }
        return answer;
    }
}
