
package assiment.pkg8;

public class lowercaseandviceversa {// chữ thường và ngược lại
    public static String swapCase(String str) {
    StringBuilder swapped = new StringBuilder();
    for (char ch : str.toCharArray()) {
        if (Character.isUpperCase(ch)) {
            swapped.append(Character.toLowerCase(ch));
        } else if (Character.isLowerCase(ch)) {
            swapped.append(Character.toUpperCase(ch));
        } else {
            swapped.append(ch);
        }
    }
    return swapped.toString();
}

public static void main(String[] args) {
    String str = "Hello World";
    System.out.println("Swapped case: " + swapCase(str));
   }
}
//giải thíchp:mã này lặp lại từng ký tự,chuyển đổi chữ hoa thành chữ thường và ngược lại và đổi chữ hoa thành chữ thường