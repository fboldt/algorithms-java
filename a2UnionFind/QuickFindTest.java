public class QuickFindTest extends UnionFindTest{

    public QuickFindTest() {
        super();
    }

    @Override
    protected UnionFind algorithm(int n) {
        return new QuickFind(n);
    }
    
}
