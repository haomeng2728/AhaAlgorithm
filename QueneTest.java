package AhaAlgorithm;

public class QueneTest {
    int n = 10;
    int[] a = new int[10];
    int[] book = new int[10];

    public void dfs(int step) {
        if (step == n) {
            if(a[1]*100 +a[2]*10+a[3]+a[4]*100+a[5]*10+a[6] == a[7]*100+a[8]*10+a[9]){
                System.out.println(a[1]*100+"+" +a[2]*10+"+"+a[3]+"+" +a[4]*100+"+" +a[5]*10+"+" +a[6]+"="+a[7]*100+"+" +a[8]*10+"+" +a[9]);
            }
            return;
        }

        for (int i = 1; i <= n-1; i++) {
            if (book[i] == 0) {
                a[step] = i;
                book[i] = 1;
                dfs(step+1);
                book[i] = 0;
            }
        }
        return;
    }
    public static void main(String[] args) {
        QueneTest st = new QueneTest();
        st.dfs(1);
    }
}