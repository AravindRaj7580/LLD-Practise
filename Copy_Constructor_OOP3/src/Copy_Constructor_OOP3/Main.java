package Copy_Constructor_OOP3;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Ujjwal";
        s.batch = new Batch();
        s.batch.id = 10;

        Student copy = new Student(s);
        copy.batch.id = 20;
        System.out.print(s.batch.id);

    }
}