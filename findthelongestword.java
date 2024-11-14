
package assiment.pkg8;

public class findthelongestword {//tìm từu dài nhất
    public static String findLongestWord(String str) {
    String[] words = splitWords(str);
    String longest = "";
    for (String word : words) {
        if (word.length() > longest.length()) {
            longest = word;
        }
    }
    return longest;
}

public static void main(String[] args) {
    String str = "I love programming";
    System.out.println("Longest word: " + findLongestWord(str));
}

    
}
