package hunter.rae;

/**
 * Created by hunter on 15.06.16.
 */
public class Tuple<T> {

    private final T left;
    private final T right;

    public Tuple(final T left, final T right) {
        this.left = left;
        this.right = right;
    }

    public T getRight() {
        return right;
    }

    public T getLeft() {
        return left;
    }
}
