import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Backtracking {

    public static void main(String[] args) {
        // System.out.print(pathCount(3, 4));

        // mazePath("", 4, 3);
        // System.out.println(mazePathRet("", 3, 3).toString());
        // System.out.println(mazePathDiagRet("", 3, 3).toString());

        boolean[][] obstacle = {
            { false, false, false },
            { false, true, false },
            { false, false, false },
        };

        // boolean[][] vis = new boolean[obstacle.length][obstacle[0].length];

        int[][] path = new int[obstacle.length][obstacle[0].length];

        System.out.println(
            allMazePathObstacleRet("", 0, 0, obstacle, path, 1).toString()
        );
    }

    static int pathCount(int row, int col) {
        if (row == 1 || col == 1) {
            return 1;
        }
        return pathCount(row - 1, col) + pathCount(row, col - 1);
    }

    static void mazePath(String unproc, int row, int col) {
        if (row == 1 && col == 1) {
            System.out.println(unproc);
            return;
        }

        if (col > 1) {
            mazePath(unproc + 'R', row, col - 1);
        }
        if (row > 1) {
            mazePath(unproc + 'D', row - 1, col);
        }
    }

    static List<String> mazePathRet(String unproc, int row, int col) {
        List<String> ls = new ArrayList<>();
        if (row == 1 && col == 1) {
            ls.add(unproc);
            return ls;
        }
        if (row > 1) {
            ls.addAll(mazePathRet(unproc + "D", row - 1, col));
        }
        if (col > 1) {
            ls.addAll(mazePathRet(unproc + "R", row, col - 1));
        }
        return ls;
    }

    static List<String> mazePathDiagRet(String unproc, int row, int col) {
        List<String> ls = new ArrayList<>();
        if (row == 1 && col == 1) {
            ls.add(unproc);
            return ls;
        }
        if (row > 1 && col > 1) {
            ls.addAll(mazePathDiagRet(unproc + "Dia", row - 1, col - 1));
        }
        if (row > 1) {
            ls.addAll(mazePathDiagRet(unproc + "D", row - 1, col));
        }
        if (col > 1) {
            ls.addAll(mazePathDiagRet(unproc + "R", row, col - 1));
        }
        return ls;
    }

    static List<String> mazePathObstacleRet(
        String unproc,
        int row,
        int col,
        boolean[][] obstacle
    ) {
        List<String> ls = new ArrayList<>();

        if (row == obstacle.length - 1 && col == obstacle[0].length - 1) {
            ls.add(unproc);
            return ls;
        }
        if (obstacle[row][col]) {
            return ls;
        }
        if (row < obstacle.length - 1 && col < obstacle[0].length - 1) {
            ls.addAll(
                mazePathObstacleRet(unproc + "Dia", row + 1, col + 1, obstacle)
            );
        }
        if (row < obstacle.length - 1) {
            ls.addAll(
                mazePathObstacleRet(unproc + "D", row + 1, col, obstacle)
            );
        }
        if (col < obstacle[0].length - 1) {
            ls.addAll(
                mazePathObstacleRet(unproc + "R", row, col + 1, obstacle)
            );
        }
        return ls;
    }

    static List<String> allMazePathObstacleRet(
        String unproc,
        int row,
        int col,
        boolean[][] obstacle,
        int[][] path,
        int step
    ) {
        List<String> ls = new ArrayList<>();

        if (path[row][col] != 0) {
            return ls;
        }
        path[row][col] = step;
        if (row == obstacle.length - 1 && col == obstacle[0].length - 1) {
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(unproc);
            System.out.println();
            ls.add(unproc);
            path[row][col] = 0;
            return ls;
        }
        if (obstacle[row][col]) {
            path[row][col] = 0;
            return ls;
        }
        if (row < obstacle.length - 1 && col < obstacle[0].length - 1) {
            ls.addAll(
                allMazePathObstacleRet(
                    unproc + "Dia",
                    row + 1,
                    col + 1,
                    obstacle,
                    path,
                    step + 1
                )
            );
        }
        if (row > 0 && col > 0) {
            ls.addAll(
                allMazePathObstacleRet(
                    unproc + "DiaUP",
                    row - 1,
                    col - 1,
                    obstacle,
                    path,
                    step + 1
                )
            );
        }
        if (row < obstacle.length - 1) {
            ls.addAll(
                allMazePathObstacleRet(
                    unproc + "D",
                    row + 1,
                    col,
                    obstacle,
                    path,
                    step + 1
                )
            );
        }
        if (col < obstacle[0].length - 1) {
            ls.addAll(
                allMazePathObstacleRet(
                    unproc + "R",
                    row,
                    col + 1,
                    obstacle,
                    path,
                    step + 1
                )
            );
        }
        if (row > 0) {
            ls.addAll(
                allMazePathObstacleRet(
                    unproc + "U",
                    row - 1,
                    col,
                    obstacle,
                    path,
                    step + 1
                )
            );
        }
        if (col > 0) {
            ls.addAll(
                allMazePathObstacleRet(
                    unproc + "L",
                    row,
                    col - 1,
                    obstacle,
                    path,
                    step + 1
                )
            );
        }
        path[row][col] = 0;

        return ls;
    }

    static void subseq(StringBuilder proc, String unproc, int idx) {
        if (unproc.isEmpty()) {
            System.out.println(proc.toString());
            return;
        }

        char ch = unproc.charAt(idx);
        subseq(proc.append(ch), unproc, idx + 1);
        proc.deleteCharAt(proc.length() - 1);
        subseq(proc, unproc, idx + 1);
    }
}
