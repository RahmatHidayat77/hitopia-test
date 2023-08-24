import java.util.Deque;
import java.util.LinkedList;

public class Soal3 {

    public static Boolean balanceBracket(String str) {
        Deque<Character> deque = new LinkedList<>();
        str = str.replaceAll("\\s", "");
        System.out.println(str);
        for (char ch: str.toCharArray()) {
            if (ch == '{' || ch == '[' || ch == '(') {
                deque.addFirst(ch);
            } else {
                if (!deque.isEmpty()
                    && ((deque.peekFirst() == '{' && ch == '}')
                    || (deque.peekFirst() == '[' && ch == ']')
                    || (deque.peekFirst() == '(' && ch == ')'))) {
                    deque.removeFirst();
                } else {
                    return false;
                }
            }
        }
        return deque.isEmpty();
    }

    public static void main(String[] args) {  
        String str1 = "{[()]}";
        System.out.println(balanceBracket(str1));

        String str2 = "{[(])}";
        System.out.println(balanceBracket(str2));
        
        String str3 = "{(([])[ ])[]}";
        System.out.println(balanceBracket(str3));
     }  
}