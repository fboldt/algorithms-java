public class QuickFind implements UnionFind {
    private int[] id;

    /**
     * @param n Number of nodes.
     */
    public QuickFind(int n) {
        id = new int[n];
        for (int i = 0; i < id.length; i++) {
            id[i] = i;
        }
    }

    @Override
    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pid) {
                id[i] = qid;
            }
        }

    }

    @Override
    public boolean connected(int p, int q) {
        return id[p] == id[q];
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
