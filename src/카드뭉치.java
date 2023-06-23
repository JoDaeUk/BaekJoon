import java.util.Arrays;

public class 카드뭉치 {
    public static void main(String[] args) {
        String[] card11 ={"i", "drink", "water"};
        String[] card12 ={"i", "water", "drink"};

        String[] card21 ={"want", "to"};
        String[] card22 ={"want", "to"};

        String[] goal1 ={"i", "want", "to", "drink", "water"};
        String[] goal2 ={"i", "want", "to", "drink", "water"};

        System.out.println(solution(card11,card21,goal1));
        System.out.println(solution(card12,card22,goal2));
    }
    static public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";

        int card1Index = 0;
        int card2Index = 0;

        for (int i = 0; i < goal.length; i++) {
            if(card1Index < cards1.length && goal[i].equals(cards1[card1Index])) {
                card1Index++;
                continue;
            }

            if(card2Index < cards2.length && goal[i].equals(cards2[card2Index])) {
                card2Index++;
                continue;
            }

            answer = "No";
            return answer;
        }

        return answer;
    }
}
