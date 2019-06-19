package AhaAlgorithm;

public class BellmanFordQuene {
    public static void main(String[] args) {
        int n = 5, m = 7, i, j, k;
        int[] u = new int[m];
        int[] v = new int[m];
        int[] w = new int[m];

        int[] first = new int[n];
        int[] next = new int[m];

        int[] dis = new int[n];
        int[] book = new int[n];
        int[] que = new int[m];
        int head = 0, tail = 0;
        int inf = 999999;

        for (i = 0; i < n; i++) {
            dis[i] = inf;
        }
        dis[0] = 0;

        for (i = 0; i < n; i++) {
            book[i] = 0;
        }

        for (i = 0; i < n; i++) {
            first[i] = -1;
        }

        u[0] = 0;
        u[1] = 0;
        u[2] = 1;
        u[3] = 1;
        u[4] = 2;
        u[5] = 3;
        u[6] = 4;

        v[0] = 1;
        v[1] = 4;
        v[2] = 2;
        v[3] = 4;
        v[4] = 3;
        v[5] = 4;
        v[6] = 2;

        w[0] = 2;
        w[1] = 10;
        w[2] = 3;
        w[3] = 7;
        w[4] = 4;
        w[5] = 5;
        w[6] = 6;

        for (i = 0; i < m; i++) {
            next[i] = first[u[i]];
            first[u[i]] = i;
        }

        que[tail] = 0;
        tail++;
        book[0] =1;
        while (head < tail) {
            k = first[que[head]];
            while (k != -1) {
                if (dis[v[k]] > dis[u[k]] + w[k]) {
                    dis[v[k]] = dis[u[k]] + w[k];
                    if (book[v[k]] == 0) {
                        que[tail] = v[k];
                        tail++;
                        book[v[k]] = 1;
                    }
                }
                k = next[k];
            }

//            book[que[head]] = 0;
            head++;
        }

        for (i = 0; i < n; i++) {
            System.out.println(dis[i]);
            System.out.println("inf = " + inf);
        }
    }

}
