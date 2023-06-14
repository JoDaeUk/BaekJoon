import java.util.Arrays;

public class x만큼간격이있는n개의숫자 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(2, 5)));
        System.out.println(Arrays.toString(solution(4, 3)));
        System.out.println(Arrays.toString(solution(-4,2)));
    }

    static public long[] solution(int x, int n) {
        long[] amswer = new long[n];
        for(int i=0; i<n; i++){
            amswer[i]= (long) x *(i+1);
        }
        return amswer;
    }
}
