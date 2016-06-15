package hunter.rae;

public class Main {

    public static void main(String[] args) {
        StringTuple st = new StringTuple("left", "right");
//        java 6
//        final Tuple<String> st2 = new Tuple<String>("left", "right");
        final Tuple<String> st2 = new Tuple<>("l", "r");
        System.out.println(st2.getLeft());
        //generic не работают с примитивами
        final Tuple<Integer> it = new Tuple<>(14, 28);
        System.out.println(it.getLeft() + 300);

        Tuple<SuperClass> tuple = new Tuple<>(new SuperClass(), new SuperClass());
        System.out.println(tuple.getLeft());
        //simple -
        //safe +
        //size +
    }

    private static class SuperClass {

        @Override
        public String toString() {
            return "Super";
        }
    }
}
