package polymorphic_exe.exercise;

public class Computer {

    /*
     * 提供一个安装入口： 行为
     */
    public void installUSB(USB usb){
        usb.connect();
        //独有功能
        if(usb instanceof Mouse){
            Mouse m = (Mouse) usb;
            m.click();
        }else if(usb instanceof Keyboard){
            Keyboard k = (Keyboard) usb;
            k.type();
        }

        usb.unconnect();
    }
    
}
