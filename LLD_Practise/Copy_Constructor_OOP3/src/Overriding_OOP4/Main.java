package Overriding_OOP4;

public class Main {
    public static void main(String[] args){
        B x = new B();
        x.doSomething("Hi");
        A a = new B();
        a.doSomething("bye");
        //what happens here A is the reference & Parent actually it has to call the A executes instead it is calling B executes
        //compiler thinks you are calling doSomething in A, but while it is running the case is different
        //because while runtime it will come to know it is from B() instance and it will execute B executes
        //that's why it is runtime polymorphism and doSomething in A was override by doSomething in B.
    }
}
