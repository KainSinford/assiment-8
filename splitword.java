
package assiment.pkg8;
import java.util.Arrays;
public class splitword { //tách các từ trong 1 chuỗi
    public static String[] splitWords(String str) {
    return str.trim().split("\\s+");
}
    

public static void main(String[] args) {
    String str = "Java is fun";
    String[] words = splitWords(str);
    System.out.println("Words: " + Arrays.toString(words));
   }
}
//giải thích:mã này sử dụng splitphương pháp chia chuỗi theo khoảng trắng vàtạo ra một mảng các từ.