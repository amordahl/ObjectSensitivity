import java.util.function.Consumer;

public class Application {

    public static void main(String[] args) {
        Foo a1 = new Foo(new Integer(5));
        Foo a2 = new Foo(new String("5"));

        a1.doSomething();
    }
}
