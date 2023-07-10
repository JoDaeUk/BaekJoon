public class 콜라문제 {
    public static void main(String[] args) {

        System.out.println(solution(2,1,20));
        System.out.println(solution(3,1,20));

    }

    static public int solution(int a, int b, int n) {
        int answer = 0;
        int cont = 0;
        int rest = 0;
        while (n >= a){
            cont = n / a * b;
            rest = n % a;
            answer += cont ;
            n = cont + rest;
        }
        return answer;
    }
}
