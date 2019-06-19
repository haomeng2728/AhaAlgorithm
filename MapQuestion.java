package AhaAlgorithm;

public class MapQuestion {
    int[][] a = {{0,1,0,0,1},{0,0,0,0,1},{0,1,0,0,0},{0,1,1,0,0},{1,0,0,0,0}};
    int[][] book = new int[4][4];
    int n=5,m=5,p=3,q=3,min=9999999;
    public void dfs(int x, int y, int step) {
        int[][] next = {{0,1},{1,0},{0,-1},{-1,0}};
        int tx, ty;
        if (x==p && y ==q) {
            if (min > step) {
                min = step;
            }
            return;
        }
        for (int t = 0; t <= 3; t++) {
            tx = x + next[t][0];
            ty = y + next[t][1];
            if (tx < 0 || tx >= n-1 || ty < 0 || ty >= m-1) {
                continue;
            }
            if (a[tx][ty] == 0 && book[tx][ty] == 0) {
                book[tx][ty] = 1;
                dfs(tx, ty, step+1);
                book[tx][ty] = 0;
            }
        }
        return;


    }

    public static void main(String[] args) {
        int start_x=0, start_y=0;
        MapQuestion mq = new MapQuestion();
        mq.book[start_x][start_y ] = 1;
        mq.dfs(start_x,start_y,0);
        System.out.println(mq.min);
    }
}
