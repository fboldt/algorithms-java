import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public abstract class UnionFindTest {
    private UnionFind uf;
    private int n = 10;

    protected abstract UnionFind algorithm(int n);

    private int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    @Before
    public void setup() {
        uf = algorithm(n);
    }

    @Test
    public void test() {
        int p = getRandomNumber(1, n);
        int q = getRandomNumber(1, n);
        int r = getRandomNumber(1, n);
        assertFalse(uf.connected(p, q));
        uf.union(p, q);
        assertTrue(uf.connected(p, q));
        assertFalse(uf.connected(p, r));
        assertFalse(uf.connected(r, q));
        uf.union(r, q);
        assertTrue(uf.connected(p, r));
    }
}
