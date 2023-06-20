import java.util.Arrays;

public class 덧칠하기 {
    public static void main(String[] args) {

        int[] section1 = {2,3,6};
        int[] section2 = {1,3};
        int[] section3 = {1,2,3,4};


        System.out.println(solution(8,4,section1));
        System.out.println(solution(5,4,section2));
        System.out.println(solution(4,1,section3));

    }

    static public int solution(int n, int m, int[] section) {
        boolean[] arr = new boolean[n];
        int result = 0;
        //벽 만들기 페인트 칠해야할 벽은 false
        Arrays.fill(arr,true);
        for (int i : section){
            arr[i-1] = false;
        }

        for (int i=0; i<arr.length; i++){
            if(!arr[i]){
                for(int j=i; j<m+i; j++){
                    if(j>=arr.length)break;
                    arr[j] = true;
                }
                result++;
            }
        }
        return result;
    }
}
