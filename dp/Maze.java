package dp;

import java.util.Arrays;

public class Maze {
    public static void main(String[] args) {

        int[][] maze = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int[][] dp = new int[maze.length][maze[0].length];

        for (int i = 0; i < maze.length; i++) {
            Arrays.fill(dp[i], -1);
        }

        System.out.println(mazeSolver(0, 0, maze, dp));
        System.out.println(times);
        System.out.println(withOutDp);

    }

    static int times = 0;
    static int withOutDp = 0;

    static int mazeSolver(int i, int j, int[][] maze, int[][] dp) {
        if (i >= maze.length || j >= maze[0].length) {
            return Integer.MAX_VALUE;
        }
        withOutDp++;
        if (i == maze.length - 1 && j == maze[0].length - 1) {
            return maze[i][j];
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        times++;
        return dp[i][j] = maze[i][j] + Math.min(mazeSolver(i + 1, j, maze, dp), mazeSolver(i, j + 1, maze, dp));
    }
}
