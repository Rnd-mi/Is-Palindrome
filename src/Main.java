public class Main {

    public boolean isPalindrome(String s) {

        for (int i = 0, k = s.length() - 1; i < k; i++, k--) {

            if (s.charAt(i) != s.charAt(k)) {
                return false;
            }
        }
        return true;
    }
}
