
package assiment.pkg8;

public class removextraspace {//xooasa khoảng trahwng thừa
    public static String removeExtraSpaces(String str) {
    return str.trim().replaceAll("\\s+", " ");
}

public static void main(String[] args) {
    String str = "   Hello    World   ";
    System.out.println("Without extra spaces: '" + removeExtraSpaces(str) + "'");
}

    
}
//giải thích:thao tác này sẽ xóa các khoảng trắng ở đầu và cuối và giảm nhiều khoảng trắng giữa các từ thành một khoảng trắng duy nhất