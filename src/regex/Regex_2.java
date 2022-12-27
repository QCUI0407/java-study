package regex;

public class Regex_2 {
    public static void main(String[] args) {
        String names = "@@dsfsdfji888$$sdfjsdnfkjs##sdfklnsfd";
        String[] arrs = names.split("\\w+");
        for (int i = 0; i < arrs.length; i++) {
            System.out.println(arrs[i]);
        }

        String names2 = names.replaceAll("\\w+", "^^^");
        System.out.println(names2);
    }
}
