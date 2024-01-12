package DiffReferenceAndDiffInstanceInheritance_OOP4;

public class Main {
    public static void main(String[] args){
        Animal x = new Dog();
        //x.Bark won't work
        //also this is possible only in inheritance concept
        //Animal is refernce & Parent class and Dog is instance & child class
        //compiler will only consider Animal in this case not Dog() instance only considers Animal reference
        x.isWater();;
        x.isAnimal();

        //Dog y = new Animal();
        //above line will give us error as we cannot have child class as reference and parent as instance
        //compiler thinks that in future you might try to access y.isLand which is an function in Animal parent class

    }
}
