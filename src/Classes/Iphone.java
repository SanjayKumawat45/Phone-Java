package Classes;

import Interfaces.IOS;

public class Iphone implements IOS {

    public void boot(){
        System.out.println("Apple");
        IOS.ios();
    }

    @Override
    public void call() {
        System.out.println("calling");
    }

    @Override
    public void camera() {
        System.out.println("Recording");

    }

    @Override
    public void whatsApp() {
        System.out.println("messaging");

    }
}
