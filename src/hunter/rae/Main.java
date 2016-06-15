package hunter.rae;

public class Main {

    public static void main(String[] args) {
        Tuple2<Long, String> stringTuple = new Tuple2<>(12L, "Stas");
        System.out.println(stringTuple.getLeft() + 21L);
    }

}
