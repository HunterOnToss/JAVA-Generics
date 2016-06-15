package hunter.rae;

public class Main {

    public static void main(String[] args) {
        //Простой класс для хранения каких-либо данных, не важно каких
        final Tuple student1 = new Tuple(1, "Stas");
        final String name = (String) student1.getRight();
        System.out.println(name);
    }
    // Проблема!!!

    //Три пути влияющие на решения данной проблемы

    //simple
    //safe (static-typing)
    //size

    //python (simple, size small)
    //go для каждого нового типа пишут свой класс (StringTuple) (simple, safe, size big)
}
