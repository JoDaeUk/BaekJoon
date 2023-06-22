import java.util.Arrays;

public class 크가가작은부분문자열 {
    public static void main(String[] args) {


        System.out.println(solution("3141592","271"));
        System.out.println(solution("500220839878","7"));
        System.out.println(solution("10203","15"));

    }

    static int solution(String t, String p) {
        int length = p.length();
        long pValue = Long.parseLong(p);
        int result = 0;
        long value;

        String[] tArr = t.split("");

        for (int i = 0; i < t.length() - length + 1; i++) {
            StringBuilder stringValue = new StringBuilder();
            for (int j = i; j < i + length; j++) {
                stringValue.append(tArr[j]);
            }
            value = Long.parseLong(stringValue.toString());
            if (value <= pValue)
                result++;
        }
        return result;
    }
}
