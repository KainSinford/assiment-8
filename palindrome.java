
package assiment.pkg8;

import static assiment.pkg8.reseverseexer.reverseString;

public class palindrome { //xuôi ngược đều giống nhau
    public static boolean isPalindrome(String str) {
    String reversed = reverseString(str);
    return str.equals(reversed);
}

public static void main(String[] args) {
    String str = "madam";
    System.out.println("Is palindrome: " + isPalindrome(str));
  }

}
//giải thích: mã này đảo ngược chuỗi để kiểm tra xem phiên bản đảo ngược có giống với bản gốckhông