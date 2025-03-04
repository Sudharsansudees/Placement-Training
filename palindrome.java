class Method {
    public static boolean isPalindromeUsingStringBuilder(String str) {
        StringBuilder reversed = new StringBuilder(str);
        reversed.reverse();
        return str.equals(reversed.toString());
    }

    public static boolean isPalindromeUsingCharArray(String str) {
        char[] reverse = new char[str.length()];
        int j = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse[j++] = str.charAt(i);
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != reverse[i]) {
                return false;
            }
        }
        return true;
    }
}

class Palindrome extends Method {
    public static void main(String[] args) {
        String str = "racecar";

        if (isPalindromeUsingStringBuilder(str)) {
            System.out.println(str + " is a Palindrome ( using StringBuilder).");
        } else {
            System.out.println(str + " is not a Palindrome (using StringBuilder).");
        }

        if (isPalindromeUsingCharArray(str)) {
            System.out.println(str + " is a Palindrome ( using Char Array).");
        } else {
            System.out.println(str + " is not a Palindrome ( using Char Array).");
        }
    }
}
