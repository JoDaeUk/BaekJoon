import java.util.ArrayList;

public class 약수 {
    public static void main(String[] args) {
        System.out.println(solution(5));
    }

    static public int solution(int n) {
        //n번 반복+ 리스트에 n의 약수 add
        ArrayList<Integer> nArr = new ArrayList<>();
        for (int i = 1; i < n; i++){
            if(n % i==0){
                nArr.add(i);
            }
        }
        nArr.add(n);
        int sum = 0;
        for(int i : nArr){
            sum += i;
        }
        return sum;
    }
}
