package LLD_BackendDesignPattern_Factory.components.button;

public class IOSButton implements Button{
    @Override
    public void sayHi() {
        System.out.println("Hi i'm ios Button");

    }
}
