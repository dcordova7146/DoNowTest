public class DONOW2 {
    public static void main(String[] args){
        String str2 = "What?";
        for(int i = 0; i < str2.length(); i++){
            System.out.println(str2);
            str2 = str2.substring(str2.length() - 1) + str2.substring(0,str2.length() - 1);
        }
    }
}
