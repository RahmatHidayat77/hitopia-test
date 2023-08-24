public class Soal2 {
    public static void highestPalindrom(String str, Integer k) {


        if (isPalindrome(str)) {
            System.out.println("Yes");
        } else {
            System.out.println(-1);   
        }
    }

    public static boolean isPalindrome(String str) {
        int n = str.length();

        if (n == 0)
        return true;

        return isPalRec(str, 0, n - 1);
    }

    public static boolean isPalRec(String str, int s, int e) {
        if (s == e)
        return true;

        if ((str.charAt(s)) != (str.charAt(e)))
        return false;


        if (s < e + 1)
        return isPalRec(str, s + 1, e - 1);

        return true;
    }

    public static String makePalindrome(String s, int k) {
        int n = s.length();
        int replacements = 0;
        char[] arr = s.toCharArray();
        for (int i = 0, j = n - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
                if (arr[i] > arr[j]) {
                    arr[j] = arr[i];
                } else {
                    arr[i] = arr[j];
                }
                replacements++;
                if (replacements > k) {
                    return "-1";
                }
            }
        }
        for (int i = 0, j = n - 1; i <= j; i++, j--) {
            if (i == j && replacements < k) {
                arr[i] = '9';
            }
            if (arr[i] != '9') {
                if (replacements < k && (i == 0 || i == j)) {
                    arr[i] = arr[j] = '9';
                    replacements++;
                } else if (replacements <= k - 2) {
                    arr[i] = arr[j] = '9';
                    replacements += 2;
                }
            }
        }
        return new String(arr);
    }


    public static void main(String[] args) {
        // highestPalindrom("3943", 1);
        System.out.println(makePalindrome("3943", 1));
        System.out.println("--------------");
        System.out.println(makePalindrome("39436", 3));        
        System.out.println("--------------");
        System.out.println(makePalindrome("394383746", 6));   

    }
}
