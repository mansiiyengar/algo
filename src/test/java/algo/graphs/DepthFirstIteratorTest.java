package algo.graphs;

import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

/**
 * Test {@link DepthFirstIterator}
 *
 * @author Artur Khalikov
 */
public class DepthFirstIteratorTest {

    private DiGraph dg1;

    @Before
    public void setUp() throws Exception {
        dg1 = new DiGraph(4);
        dg1.addEdge(1, 2);
        dg1.addEdge(2, 3);
        dg1.addEdge(2, 4);
        dg1.addEdge(3, 1);
        dg1.addEdge(3, 4);
    }

    @Test
    public void testNext() throws Exception {
        System.out.println("Test starting from 1");
        Iterator<Vertex> iterator = dg1.depthFirstIterator(new Vertex(1));
        print(iterator);

        System.out.println("Test starting from 2");
        iterator = dg1.depthFirstIterator(new Vertex(2));
        print(iterator);

        System.out.println("Test starting from 3");
        iterator = dg1.depthFirstIterator(new Vertex(3));
        print(iterator);

        System.out.println("Test starting from 4");
        iterator = dg1.depthFirstIterator(new Vertex(4));
        print(iterator);
    }

    private void print(Iterator<Vertex> iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
