package AhaAlgorithm;

public class MapTraversalDfs {
    static int[] book = new int[5];
    static int sum=0;
    static int n=5;
    static int[][] map = new int[5][5];

    public void dfs(int cur) {
        int i;
        System.out.println("cur is " + cur);
        sum++;
        if (sum == n) return;
        for (i = 0; i < n; i++) {
            if (map[cur][i] == 1 && book[i] == 0) {
                book[i] = 1;
                dfs(i);
            }
        }
//        System.out.println(sum);
        return;
    }

    public static void main(String[] args) {


        int i,j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i == j) map[i][j] = 0;
                else map[i][j] = 99999;
            }
        }

        map[0][1] = 1;
        map[0][2] = 1;
        map[0][4] = 1;
        map[1][0] = 1;
        map[1][3] = 1;
        map[2][0] = 1;
        map[2][4] = 1;
        map[3][1] = 1;
        map[4][0] = 1;
        map[4][2] = 1;

        book[0] = 1;
        MapTraversalDfs mtd = new MapTraversalDfs();
        mtd.dfs(0);

    }
}
