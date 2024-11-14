
package assiment.pkg8;

public class reseverseexer { // đảo ngược chiều
    public static String reverseString(String str) {
    return new StringBuilder(str).reverse().toString();
}

public static void main(String[] args) {
    String str = "hello";
    System.out.println("Reversed string: " + reverseString(str));
  }
}
//giải thích:hàm này dùng (StringBuilder)để đảo ngược chuỗi vàtrả về phiên bản đã đảo ngược