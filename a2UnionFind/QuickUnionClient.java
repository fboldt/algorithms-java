public class QuickUnionClient extends UnionFindClient {
    public static void main(String[] args) {
        QuickUnionClient client = new QuickUnionClient();
        client.exec();
    }

    @Override
    protected UnionFind algorithm(int n) {
        return new QuickUnion(n);
    }
    
}
