package LLD_BackendDesignPattern_Factory;

public class UIFactoryFactory {
    public static UIFactory createUIFaccttory(String UIString){
        if(UIString.equals("android")){
            return new AndroidUIFactory();
        }else if(UIString.equals("IOS")){
            return new IOSUiFactory();
        }
        return null;

    }
}
