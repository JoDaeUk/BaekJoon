import java.util.Arrays;

public class 자릿수더하기 {
    public static void main(String[] args) {
        System.out.println(solution(15619));
        System.out.println(solution(1561));
        System.out.println(solution(156));
    }

    static public int solution(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
