package AhaAlgorithm;

public class BreadthFirstSearch {
    public int removeDuplicates(int[] nums) {
        int[] t = new int[nums.length];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {

//                System.arraycopy(nums, 1, t, 0, t.length-1);
            }

        }
        for (int j = 0; j < t.length; j++) {
            System.out.print(t[j]+" ");
        }

        return t.length;
    }

    public static void main(String[] args) {
//        int[][] next = {{0,1},{1,0},{0,-1},{-1,0}};
//        NodeClass[] nc;
//        int[] a;
        int[] a = new int[]{1, 1, 2};
        BreadthFirstSearch bfs = new BreadthFirstSearch();
        bfs.removeDuplicates(a);


    }
}
