package Copy_Constructor_OOP3;

public class Student {
    Student(){}

    Student(Student orig){
        //shallow copy
        //this.batch = orig.batch;
        this.name = orig.name;
        //Deep copy
        this.batch = new Batch((orig.batch));


    }
    String name;
    Batch batch;
}
