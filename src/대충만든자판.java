import java.util.Arrays;
import java.util.HashMap;

public class 대충만든자판 {
    public static void main(String[] args) {
        String[] keymap1 ={"ABACD", "BCEFD"};
        String[] keymap2 ={"AA"};
        String[] keymap3 ={"AGZ", "BSSS"};

        String[] targets1 ={"ABCD","AABB"};
        String[] targets2 ={"B"};
        String[] targets3 ={"ASA","BGZ"};

        System.out.println(Arrays.toString(solution(keymap1, targets1)));
        System.out.println(Arrays.toString(solution(keymap2, targets2)));
        System.out.println(Arrays.toString(solution(keymap3, targets3)));
    }
    static int[] solution(String[] keymap, String[] targets) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int[] ret = new int[targets.length];

        for(String key : keymap) {
            for(int i=0 ; i<key.length() ; i++) {
                char c = key.charAt(i);
                if(!hm.containsKey(c) || i<hm.get(c)) {
                    hm.put(c, i+1);
                }
            }
        }

        for(int i=0 ; i<targets.length ; i++) {
            int cnt = 0;
            for(int j=0 ; j<targets[i].length() ; j++) {
                char c = targets[i].charAt(j);
                if(!hm.containsKey(c)) {
                    cnt = 0;
                    break;
                } else {
                    cnt += hm.get(c);
                }
            }
            ret[i] = cnt==0?-1:cnt;
        }
        return ret;
    }
}
