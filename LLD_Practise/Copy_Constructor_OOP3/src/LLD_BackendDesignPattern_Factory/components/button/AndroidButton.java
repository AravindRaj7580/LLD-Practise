package LLD_BackendDesignPattern_Factory.components.button;

public class AndroidButton implements Button{
    @Override
    public void sayHi() {
        System.out.println("Hi i'm android button");
    }
}
