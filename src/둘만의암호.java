import java.util.ArrayList;
import java.util.List;

public class 둘만의암호 {
    public static void main(String[] args) {

        System.out.println(solution("aukks","wbqd",5));
    }

    static public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        List<String> alphabetList = new ArrayList<>();

        for (char c = 'a'; c <= 'z'; c++) {
            alphabetList.add(String.valueOf(c));
        }
        String[] skipArr = skip.split("");

        for(String skipString : skipArr){
            alphabetList.remove(skipString);
        }
        System.out.println(alphabetList);
        for (int i=0; i<s.length(); i++){
            int sIndex = alphabetList.indexOf(String.valueOf(s.charAt(i)))+index;
            while (sIndex >= alphabetList.size()) sIndex -= alphabetList.size();
            answer.append(alphabetList.get(sIndex));
        }

        return answer.toString();
    }
}
