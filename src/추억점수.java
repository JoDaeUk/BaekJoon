import java.util.ArrayList;
import java.util.Arrays;

public class 추억점수 {
    public static void main(String[] args) {
        String[] name1 = {"may", "kein", "kain", "radi"};
        String[] name2 = {"kali", "mari", "don"};
        String[] name3 = {"may", "kein", "kain", "radi"};

        int[] yearning1 = {5,10,1,3};
        int[] yearning2 = {11,1,55};
        int[] yearning3 = {5,10,1,3};

        String[][] photo1 ={{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
        String[][] photo2 ={{"kali", "mari", "don"}, {"pony", "tom", "teddy"}, {"con", "mona", "don"}};
        String[][] photo3 ={{"may"},{"kein", "deny", "may"}, {"kon", "coni"}};

        System.out.println(Arrays.toString(solution(name1,yearning1,photo1)));
        System.out.println(Arrays.toString(solution(name2,yearning2,photo2)));
        System.out.println(Arrays.toString(solution(name3,yearning3,photo3)));
    }

    static public int[] solution(String[] name, int[] yearning, String[][] photo) {
        ArrayList<Integer> resultArr = new ArrayList<>();
        int cont = 0;
        //photo 2중 반복문 사용
        for (int i=0; i<photo.length; i++){
            for(int j=0; j<photo[i].length; j++){
                for(int k=0; k<name.length; k++){
                    if(photo[i][j].equals(name[k])) {
                        cont += yearning[k];
                        break;
                    }
                }

            }
            resultArr.add(cont);
            cont=0;
        }
        return resultArr.stream().mapToInt(Integer::intValue).toArray();
    }
}
