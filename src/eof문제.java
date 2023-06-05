import java.util.Scanner;

public class eof문제 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//      입력은 여러 개의 테스트 케이스로 이루어져 있다.
//
//      각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

                while(scanner.hasNext()){
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    System.out.println(a+b);
                }
            }
        }
