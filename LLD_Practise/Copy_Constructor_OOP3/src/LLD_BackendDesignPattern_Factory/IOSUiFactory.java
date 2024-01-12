package LLD_BackendDesignPattern_Factory;

import LLD_BackendDesignPattern_Factory.components.DropDown.IOSDropDown;
import LLD_BackendDesignPattern_Factory.components.Menu.IOSMenu;
import LLD_BackendDesignPattern_Factory.components.button.IOSButton;

public class IOSUiFactory implements UIFactory{
    @Override
    public IOSButton createButton() {
        return new IOSButton();
    }

    @Override
    public IOSMenu createMenu() {
        return new IOSMenu();
    }

    @Override
    public IOSDropDown createDropDown() {
        return new IOSDropDown();
    }
}
