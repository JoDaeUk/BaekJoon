import java.util.Scanner;

public class 문자와_문자열 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*Todo 단어 S와 정수 i가 주어졌을 때, S의 i번째 글자를 출력하는 프로그램을 작성하시오.*/
        String str = scanner.nextLine();
        int num = scanner.nextInt();

        System.out.println(str.charAt(num-1));

    }
}