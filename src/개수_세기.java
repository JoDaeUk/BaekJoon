import java.util.Scanner;

public class 개수_세기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //Todo 총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
        int[] array = new int[N];
        int cnt = 0;

        for(int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }

        int v= sc.nextInt();

        for(int i = 0; i < array.length; i++) {
            if (v == array[i]){
                cnt++;
            }
        }

        System.out.println(cnt);


    }
}