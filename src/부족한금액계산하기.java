public class 부족한금액계산하기 {
    public static void main(String[] args) {
        int price=3;
        int money=20;
        int count=4;

        System.out.println(solution(price,money,count));
    }
    static public long solution(int price, int money, int count) {
        long answer = 0;
        long total=0;

        for(int i=1; i<count+1; i++){
            total += price*i;
        }
        if(money<total)
            answer = total-money;
        else
            answer = 0;
        return answer;
    }
}
