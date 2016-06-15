package hunter.rae;

/**
 * Created by hunter on 15.06.16.
 */
public class SimpleTriple<T> extends Tuple3<T, T> {
    private final T middle;

    public SimpleTriple(final T left, final T middle, final T right) {
        super(left,right);
        this.middle = middle;
    }

    public T getMiddle() {
        return middle;
    }
}
