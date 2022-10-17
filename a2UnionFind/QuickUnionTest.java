public class QuickUnionTest extends UnionFindTest {

    public QuickUnionTest() {
        super();
    }

    @Override
    protected UnionFind algorithm(int n) {
        return new QuickUnion(n);
    }
    
}
