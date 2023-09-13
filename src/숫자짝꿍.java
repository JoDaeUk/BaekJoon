import java.util.*;
import java.util.stream.Collectors;

public class 숫자짝꿍 {
    public static void main(String[] args) {

        String X1 = "100";
        String X2 = "100";
        String X3 = "100";
        String X4 = "12321";
        String X5 = "5525";

        String Y1 = "2345";
        String Y2 = "203045";
        String Y3 = "123450";
        String Y4 = "42531";
        String Y5 = "1255";


        System.out.println(solution(X1,Y1));
        System.out.println(solution(X2,Y2));
        System.out.println(solution(X3,Y3));
        System.out.println(solution(X4,Y4));
        System.out.println(solution(X5,Y5));

    }
    static public String solution(String X, String Y) {
        Map<String, Integer> xMap = new HashMap<>();
        Map<String, Integer> yMap = new HashMap<>();

        List<String> list = new ArrayList<>();

        for(String key: X.split("")) {
            xMap.put(key, xMap.getOrDefault(key, 0)+1);
        }

        for(String key: Y.split("")) {
            yMap.put(key, yMap.getOrDefault(key, 0)+1);
        }

        for(String key: xMap.keySet()) {
            if(!yMap.containsKey(key)) continue;

            int length = Math.min(xMap.get(key), yMap.get(key));
            for(int i = 0; i < length; i++) {
                list.add(key);
            }
        }

        String result = list.stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.joining());

        if(result.isEmpty()) return "-1";
        if(result.replaceAll("0", "").isEmpty()) return "0";
        return result;
    }
}

