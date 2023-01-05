package file_io_api.io_charset;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //默认(UTF-8)
        //编码
        String name = "abc123";
        byte[] bytes = name.getBytes();
        System.out.println(bytes.length);
        System.out.println(Arrays.toString(bytes));

        //解码
        String rs = new String(bytes);
        System.out.println(rs);

    }
}
