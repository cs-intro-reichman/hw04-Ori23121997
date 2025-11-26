public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String newStr = "";
        for (int i = 0 ; i<str.length();i++){
            if (((int)str.charAt(i) < 123 && (int)str.charAt(i) > 96) || (int)str.charAt(i)>31 && 
         (int)str.charAt(i) < 65) {
                newStr = newStr+str.charAt(i);
            }else if ((int)str.charAt(i) < 91 && (int)str.charAt(i) > 64) {
                int j = (int)str.charAt(i)+32;
                newStr = newStr + (char)j;

            }
        }
        return newStr;
    }


  public static boolean contains(String str1, String str2) {
        if (str2.length() == 0) {
            return true;
        }
        for (int i = 0; i <= str1.length() - str2.length(); i++) {
            if (str1.charAt(i) == str2.charAt(0)) {
                
                boolean match = true;
                for (int j = 1; j < str2.length(); j++) {
                    if (str1.charAt(i + j) != str2.charAt(j)) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    return true;
                }
            }
        }
        return false;
    }
}