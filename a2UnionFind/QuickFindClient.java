public class QuickFindClient extends Client{

    public static void main(String[] args) {
        QuickFindClient client = new QuickFindClient();
        client.exec();
    }

    @Override
    protected UnionFind algorithm(int n) {
        return new QuickFind(n);
    }
    
}
