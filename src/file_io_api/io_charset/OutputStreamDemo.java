package file_io_api.io_charset;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamDemo {
    public static void main(String[] args) throws Exception {
    //   String filePath = "C:\\Users\\cuiqi\\OneDrive\\Desktop\\java-study\\src\\out.txt";
        String filePath = "src//out.txt";

        File file = new File(filePath);
        System.out.println("---------"+file);

        System.out.println(file.isFile());

        System.out.println(file.exists());

        //1.创建一个文件文件输出管道与目标文件接通
        OutputStream os = new FileOutputStream(file);
        //2.写数据
        os.write('c');
        os.write('c');

        os.write('u');
        os.write('i');
        os.write('1');
        //写数据必须刷新数据
        os.flush();
        os.close();//释放资源包含了刷新，关闭后流不可以再使用


    }
}
