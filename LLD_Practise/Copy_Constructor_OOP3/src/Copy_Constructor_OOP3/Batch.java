package Copy_Constructor_OOP3;

public class Batch {

    int id;
    Batch(){}
    Batch(Batch orig){
        this.id = orig.id;
    }
}
