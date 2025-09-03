import Classes.Iphone;
import Classes.SamsungPhone;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SamsungPhone s22 = new SamsungPhone();
        s22.setRam(12);
        s22.setStorage(256);

        Iphone iphone17 = new Iphone();

        iphone17.boot();
        iphone17.call();
        iphone17.camera();
        iphone17.whatsApp();



//
//        s22.boot();
//        s22.printDetails();
//        s22.call();
//        s22.camera();
//        s22.internet();


    }
}