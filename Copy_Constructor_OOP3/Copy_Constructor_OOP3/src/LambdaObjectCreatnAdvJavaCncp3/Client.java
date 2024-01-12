package LambdaObjectCreatnAdvJavaCncp3;

public class Client {
    public static void main(String[] args){
//        MathOpr m = new AddOprtr();
//        MathOpr m = (one, two) -> {
//            return one + two;
//        };
        MathOpr m = (one, two) -> one + two;
        System.out.println(m.operate(2,7));
    }
}
