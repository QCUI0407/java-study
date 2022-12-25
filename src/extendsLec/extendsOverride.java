package extendsLec;

//方法重写 override
/*
 * 旧手机：只能打电话，发短信
 * 新手机：打电话下支持视频， 发短信下支持发送语音和图片
 */

public class extendsOverride {
    public static void main(String[] args) {

        NewPhone iphone = new NewPhone();
        iphone.call();
    }    
}

/**
 * 新手机： 子类
 */
class NewPhone extends Phone {
    @Override
    public void call(){
      super.call(); //先用父类call功能
      System.out.println("facetime...");
    }

    public void sendMsg(){
        super.sendMsg();
        System.out.println("send voice msg~");
    }

}

/*旧手机： 父类 */
class Phone{

    public void call(){
        System.out.println("phone call~");
    }

    public void sendMsg(){
        System.out.println("send Msg~");
    }

}
