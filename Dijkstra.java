package AhaAlgorithm;

public class Dijkstra {

    public static void main(String[] args) {
        int[][] map = new int[6][6];
        int[] dis = new int[6];
        int[] book = new int[6];

        int i, j, n=6, v, min;
        int u=0;

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i == j) map[i][j] = 0;
                else map[i][j] = 99999;
            }
        }

        map[0][1] = 1;
        map[0][2] = 12;
        map[1][2] = 9;
        map[1][3] = 3;
        map[2][4] = 5;
        map[3][2] = 4;
        map[3][4] = 13;
        map[3][5] = 15;
        map[4][5] = 4;

        for (i = 0; i < n; i++) {
            book[i] = 0;
        }
        book[0] = 1;

        for (i = 0; i < n; i++) {
            dis[i] = map[0][i];
        }

        for (i = 0; i < n; i++) {
            min = 99999;
            for (j = 0; j < n; j++) {
                if (book[j] == 0 && dis[j] < min) {
                    min = dis[j];
                    u = j;
                }
            }
            book[u] = 1;
            for (v = 0; v < n; v++) {
                if (map[u][v] < 99999) {
                    if (dis[v] > dis[u] + map[u][v]) {
                        dis[v] = dis[u] + map[u][v];
                    }
                }
            }
        }

        for (i = 0; i < n; i++) {
            System.out.println(dis[i]);
        }

    }



}
