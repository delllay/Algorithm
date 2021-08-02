import java.util.*;

public class p1260_DFS와_BFS {
    public static int[][] arr;
    public static boolean[] visited;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int point = scan.nextInt();
        int line = scan.nextInt();
        int start = scan.nextInt();

        arr = new int[point][point];
        visited = new boolean[point];

        for (int i = 0; i < line; i++) {
            int p1 = scan.nextInt() - 1;
            int p2 = scan.nextInt() - 1;

            arr[p1][p2] = 1;
            arr[p2][p1] = 1;
        }
        dfs(start - 1);
        System.out.println();
        visited = new boolean[point];
        bfs(start - 1);
    }

    private static void dfs(int start) {
        System.out.print((start + 1) + " ");
        visited[start] = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[start][i] == 1 && !visited[i])
                dfs(i);
        }
    }

    private static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<Integer>();

        queue.add(start);

        while (!queue.isEmpty()) {
            int point = queue.poll();

            System.out.print((point + 1) + " ");
            visited[point] = true;
            for (int i = 0; i < arr.length; i++) {
                if (arr[point][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }

    }

}