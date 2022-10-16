public interface UnionFind {
    /**
     * Add connection between p and q.
     * 
     * @param p
     * @param q
     */
    void union(int p, int q);

    /**
     * Are p and q in the same component?
     * 
     * @param p
     * @param q
     * @return
     */
    boolean connected(int p, int q);

    /**
     * Component identifier for p(0 to n-1).
     * 
     * @param p
     * @return
     */
    int find(int p);

    /**
     * Number of components.
     * 
     * @return
     */
    int count();
}
