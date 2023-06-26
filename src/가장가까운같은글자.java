import java.util.Arrays;

public class 가장가까운같은글자 {
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
        int[] result = new int[targets.length];
        int resultCount = 0;
        int keymapNum = keymap[0].length();
        for (String keyStr : keymap){
            if(keymapNum<keyStr.length()) keymapNum = keyStr.length();
        }

        for(int i=0; i<targets.length; i++){
            String[] targetArr = targets[i].split("");
            for(String str : targetArr){
                for(int j=0; j<keymapNum; j++){
                    String[] keymapArr = keymap[i].split("");
                    for(String keyStr : keymapArr){
                        
                    }
                }
            }
        }

    }
}
