package Strings;

public class stringObsession {

    public static int maxStringRemoved(String mainStr, String[] substrings, int count) {
        return removeString(mainStr, substrings, count);
    }

    public static int removeString(String mainStr, String[] substrings, int count) {
        int maxCount = count;
       
       
        for (int i = 0; i < substrings.length; i++) {
            String subStr = substrings[i];
            if (mainStr.contains(subStr)) {
                String newStr = mainStr.replaceFirst(subStr, "");
                maxCount = Math.max(maxCount, removeString(newStr, substrings, count + 1));
            }
        }
        
        return maxCount;
    }

    public static void main(String[] args) {
        String mainStr = "abcabcabc";
        String[] substrings = {"abc", "bc"};
        System.out.println(maxStringRemoved(mainStr, substrings, 0));
    }
}
