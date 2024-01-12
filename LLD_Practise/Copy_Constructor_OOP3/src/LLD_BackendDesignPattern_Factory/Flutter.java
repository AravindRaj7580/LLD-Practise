package LLD_BackendDesignPattern_Factory;

public class Flutter {
    public String platform;
    public Flutter(String pl){
        this.platform = pl;
    }
    public void setTheme(){
        System.out.println("setting the theme for flutter");
    }
    public void setRefreshRate(){
        System.out.println("setting refresh rate for flutter");
    }

    public UIFactory createUIFactory(){
//        if(UIString.equals("android")){
//            return new AndroidUIFactory();
//        }else if(UIString.equals("IOS")){
//            return new IOSUiFactory();
//        }
//        return null;
        return UIFactoryFactory.createUIFaccttory(platform);
    }
}
