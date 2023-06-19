import java.util.Arrays;

public class 바탕화면정리 {
    public static void main(String[] args) {

        String[] wallpaper1 = {".#...", "..#..", "...#."};
        String[] wallpaper2 = {"..........", ".....#....", "......##..", "...##.....", "....#....."};
        String[] wallpaper3 = {".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."};
        String[] wallpaper4 = {"..", "#."};
        String[] wallpaper5 = {"##"};

        System.out.println(Arrays.toString(solution(wallpaper1)));
        System.out.println(Arrays.toString(solution(wallpaper2)));
        System.out.println(Arrays.toString(solution(wallpaper3)));
        System.out.println(Arrays.toString(solution(wallpaper4)));
        System.out.println(Arrays.toString(solution(wallpaper5)));
    }

    static public int[] solution(String[] wallpaper) {
        int U = wallpaper.length;
        int D = 0;
        int L = wallpaper[0].length();
        int R = 0;

        for (int i = 0; i < wallpaper.length; i++) {
            String[] wallpaperArr = wallpaper[i].split("");
            for (int j = 0; j < wallpaperArr.length; j++) {
                if (wallpaperArr[j].equals("#")) {
                    if (U > i) U = i;
                    if (D < i+1) D = i+1;
                    if (L > j) L = j;
                    if (R < j+1) R = j+1;
                }
            }

        }
        return new int[]{U, L, D, R};
    }
}
