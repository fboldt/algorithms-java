public class QuickUnion implements UnionFind {
    private int[] id;

    /**
     * @param n Number of nodes.
     */
    public QuickUnion(int n) {
        id = new int[n];
        for (int i = 0; i < id.length; i++) {
            id[i] = i;
        }
    }

    private int root(int i) {
        while (i != id[i]) {
            i = id[i];
        }
        return i;
    }

    @Override
    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }

    @Override
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    @Override
    public int find(int p) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int count() {
        // TODO Auto-generated method stub
        return 0;
    }

}
