package StaticKeyWordOptionalOOP;

public class Student {
    public String ta;
    void doSomething(){
        this.ta = Roles.TA;
        System.out.print((this.ta));
    }
    public static void main(String[] args){
        Student s = new Student();
        s.doSomething();
    }
}
