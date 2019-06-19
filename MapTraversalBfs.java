package AhaAlgorithm;

public class MapTraversalBfs {
    public static void main(String[] args) {
        int i, j, cur, head=0, tail=0, n=5;
        int[] book = new int[5];
        int[][] map = new int[5][5];
        int[] que = new int[5];

        for (i =  0; i < n; i++) {
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

        que[tail] = 0;
        tail++;
        book[0] = 1;

        while (head < tail) {
            cur = que[head];
            for (i = 0; i < n; i++) {
                if (map[cur][i] == 1 && book[i] ==0) {
                    que[tail] = i;
                    tail++;
                    book[i] = 1;
                }

                if (tail > n) {
                    break;
                }
            }
            head++;
        }

        for (i = 0; i < n; i++) {
            System.out.println("que = " + que[i]);
        }

    }
}
