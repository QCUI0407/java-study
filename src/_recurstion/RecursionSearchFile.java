package _recurstion;

import java.io.File;

public class RecursionSearchFile {
    public static void main(String[] args) {
        searchFile(new File("c:/"), "regedit.exe.mui");
    }
/**
 * 
 * @param dir 被搜索的源目录
 * @param fileName 被搜索的文件名
 */
    public static void searchFile (File dir, String fileName){
        //1.判断dir是否是目录
        if(dir != null && dir.isDirectory()){
            //2.search,提取当前目录下的一级对象
            File[] files = dir.listFiles(); // null []
            //3.判断是否存在一级文件对象， 存在才可以遍历
            if(files != null && files.length>0){
                for (File file : files) {
                    //4. 判断挡片遍历的一级文件对象 时文件 还是 目录
                    if(file.isFile()){
                        //5.是否是查询文件，是则输出
                        if (file.getName().contains(fileName)) {
                            System.out.println("find the file: " + file.getAbsolutePath());
                        }
                    }else{
                        ///6. 递归寻找，继续搜索
                        searchFile(file, fileName);
                    }
                }
            }
        }else{
            System.out.println("not a file");
        }
    }
}
