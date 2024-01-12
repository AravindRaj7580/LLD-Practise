package AbstractOptionalOOP;

public abstract class pitBull extends Dog{
     void hello(){
         System.out.println("Say hello");
     }

     //why this class is abstract eventhough it is not having any abstract methos is due to it is not having any explanation for abtract method walk() in Dog
    //again why walk() in Dog has to be defined in pitBull because pitBull is inheriting Dog class so either it has to have definition for all the abtract methods in parent class or it is also considered as abstract
    void bye(){
        System.out.println("Say bye");
    }

}
