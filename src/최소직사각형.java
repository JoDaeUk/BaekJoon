

public class 최소직사각형 {
    public static void main(String[] args) {

        int[][] sizes1 = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int[][] sizes2 = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
        int[][] sizes3 = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};

        System.out.println(solution(sizes1));
        System.out.println(solution(sizes2));
        System.out.println(solution(sizes3));

    }
    static public int solution(int[][] sizes) {
        int max_v=0;
        int max_h=0;
        for (int[] size : sizes) {
            int v = Math.max(size[0], size[1]);
            int h = Math.min(size[0], size[1]);
            max_v = Math.max(max_v, v);
            max_h = Math.max(max_h, h);
        }
        return max_v*max_h;
    }
}

