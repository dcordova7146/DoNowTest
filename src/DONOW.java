public class DONOW {
    public static void main(String[] args){
        String str1 = "LoveJava";
        while (str1.length() > 0) {
            System.out.println(str1);
            str1 = str1.substring(1, str1.length() - 1);

        }
    }
}
