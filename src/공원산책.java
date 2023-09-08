import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 공원산책 {
    public static void main(String[] args) {

        String[] park1 = {  "SOO",
                            "OOO",
                            "OOO"};

        String[] park2 = {  "SOO",
                            "OXX",
                            "OOO"};

        String[] park3 = {  "OSO",
                            "OOO",
                            "OXO",
                            "OOO"};

        String[] routes1 = {"E 2","S 2","W 1"};
        String[] routes2 = {"E 2","S 2","W 1"};
        String[] routes3 = {"E 2","S 3","W 1"};

        System.out.println(Arrays.toString(solution(park1, routes1)));
        System.out.println(Arrays.toString(solution(park2, routes2)));
        System.out.println(Arrays.toString(solution(park3, routes3)));

    }
    static public int[] solution(String[] park, String[] routes) {
        int numRows = park.length;
        int numCols = park[0].length();
        int[] location = {0, 0};
        String[][] parkArray = new String[numRows][numCols];

        for (int i = 0; i < numRows; i++) {
            parkArray[i] = park[i].split("");
        }
        for (int i=0; i<parkArray.length; i++){
            for (int j=0; j<parkArray[i].length; j++){
                if(parkArray[i][j].equals("S")) {
                    location = new int[]{i, j};
                    break;
                }
            }
        }

        for (String route : routes){
            String[] sRoute = route.split("");

            }
        return null;
        }
    }
