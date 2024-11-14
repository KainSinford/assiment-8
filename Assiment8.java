package assiment.pkg8;

public class Assiment8 { //count the occ... đếm số lần xuất hiện
public static int countOccurrences(String str, char ch) {
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == ch) {
            count++;
        }
    }
    return count;
}

public static void main(String[] args) {
    String str = "hello world";
    char ch = 'o';
    System.out.println("Occurrences of '" + ch + "': " + countOccurrences(str, ch));
   }
}
    //giải thicchs:mã này lặp lại từng ký tự trong chuỗi và tăng bộ đếm mỗi khi nó khớp với 1 ký tự mục tiêu vàtrả về số đếm

