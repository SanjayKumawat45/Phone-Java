package Classes;

import Interfaces.Android;

public class SamsungPhone implements Android {
    private int ram;
    private int storage;


    protected int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    protected int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }


    public void boot(){

        System.out.println("Samsung");
        Android.android();

    }



    @Override
    public void printDetails() {
        System.out.println("Ram: "+getRam()+"GB");
        System.out.println("Storage: "+getStorage()+"GB");
    }

    @Override
    public void call() {
        System.out.println("calling");
    }

    @Override
    public void camera() {
        System.out.println("recording");

    }

    @Override
    public void internet() {
        System.out.println("Net is on");

    }
}
