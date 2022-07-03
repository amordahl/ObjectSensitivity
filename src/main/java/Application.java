import java.util.function.Consumer;

public class Application {

    public static void main(String[] args) {
        A a1 = new A<String>(System.out::println);
        A a2 = new A<String>(Application::doNothing);
        Application.caller(a1);
    }

    public static void doNothing(String s) {
        return;
    }

    public static void caller(A a) {
        a.foo("Hello, world!");
    }
}
