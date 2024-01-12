package InterFaceOptionalOOP;

public class MyClass implements A {
    @Override
    public void definition(){
       System.out.println("this is interface");
    }

    @Override
    public void doSomething() {
        System.out.println("doing something");
    }

    @Override
    public void name() {
        System.out.println("Interface name");
    }

    public void myClassSampleFunc(){
        System.out.println("nothing");
    }

    public static void main(String[] args) {
        MyClass c = new MyClass();
        c.myClassSampleFunc();
        A x = new MyClass();
        //can't do x.myClassSampleFunc();
        x.name();


    }

}


