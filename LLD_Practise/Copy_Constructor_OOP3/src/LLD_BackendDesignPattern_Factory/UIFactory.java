package LLD_BackendDesignPattern_Factory;

import LLD_BackendDesignPattern_Factory.components.DropDown.dropDown;
import LLD_BackendDesignPattern_Factory.components.Menu.menu;
import LLD_BackendDesignPattern_Factory.components.button.Button;

public interface UIFactory {
    Button createButton();
    menu createMenu();
    dropDown createDropDown();
}
