package AbstractOptionalOOP;

public class childOfPitBull extends pitBull {

    @Override
    void walk() {
        System.out.println("Abtract printed");
    }

    void childOf() {
        System.out.println("pitBull child");
    }
    public static void main(String[] args){
        childOfPitBull c = new childOfPitBull();
        Dog d = new childOfPitBull();
        //d.childOf() cannot do these because compiler will only understand Dog d reference not childOfPitBull() instance
        //but it will use childOfPitBull walk() only as it is overriding
    }
}

