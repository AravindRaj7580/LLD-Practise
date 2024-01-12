package LLD_BackendDesignPattern_Factory;

import LLD_BackendDesignPattern_Factory.components.Menu.menu;
import LLD_BackendDesignPattern_Factory.components.button.Button;
import LLD_BackendDesignPattern_Factory.components.DropDown.dropDown;

public class Client {
    public static void main(String[] args){
//        Flutter flutter = new Flutter("android");
        Flutter flutter = new Flutter("IOS");
        flutter.setTheme();
//        UIFactory currentUIFac = flutter.createUIFactory("android");
        UIFactory currentUIFac = flutter.createUIFactory();
        menu curMenu = currentUIFac.createMenu();
        Button curButton = currentUIFac.createButton();
        dropDown curDrop = currentUIFac.createDropDown();
        curDrop.sayHi();


    }



}
