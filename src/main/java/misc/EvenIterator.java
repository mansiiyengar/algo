package misc;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Having iterator by numbers,
 * design an iterator that returns even numbers.
 *
 * @author ahalikov
 */
public class EvenIterator implements Iterator<Integer> {

    private Iterator<Integer> numbers;
    private Integer next;

    public EvenIterator(Iterator<Integer> numbers) {
        this.numbers = numbers;
        setNext();
    }

    @Override
    public boolean hasNext() {
        return next != null;
    }

    @Override
    public Integer next() {
        if (hasNext()) {
            Integer i = next;
            setNext();
            return i;
        } else {
            throw new NoSuchElementException();
        }
    }

    protected void setNext() {
        while (numbers.hasNext()) {
            Integer n = numbers.next();
            if (n % 2 == 0 && n != 0) {
                next = n;
                return;
            }
        }
        next = null;
    }
}
