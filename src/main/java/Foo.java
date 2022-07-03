import java.util.function.Consumer;

public class Foo {

    Object myObject;

    public Foo(Object o) {
        this.myObject = o;
    }
    public String doSomething() {
        return myObject.toString();
    }
}
