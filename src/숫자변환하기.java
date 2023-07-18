
public class 숫자변환하기 {
    public static void main(String[] args) {
        System.out.println(solution(10,40,5));
        System.out.println(solution(10,40,30));
        System.out.println(solution(2,5,4));
    }

    static public int solution(int x, int y, int n) {
        int count = -1;
        if (y % x == 0){
            count = y / x;
        }
        return count;
    }
}
