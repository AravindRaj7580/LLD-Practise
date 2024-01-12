package LLD_BackendDesignPattern_Factory;

import LLD_BackendDesignPattern_Factory.components.DropDown.AndroidDropDown;
import LLD_BackendDesignPattern_Factory.components.Menu.AndroidMenu;
import LLD_BackendDesignPattern_Factory.components.button.AndroidButton;

public class AndroidUIFactory implements UIFactory{
    @Override
    public AndroidButton createButton() {
        return new AndroidButton();
    }

    @Override
    public AndroidMenu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public AndroidDropDown createDropDown() {
        return new AndroidDropDown();
    }
}
