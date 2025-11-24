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

    /** If str1 contains str2, returns true; otherwise returns false. */
    /*to get the first char of str2
    then check if str1 include this char
    if not false
    if yes we going to next char on str2
    this time we check from the last char we found to next one if the next */
  public static boolean contains(String str1, String str2) {
    if (str2.length() == 0) {
        return true;
    }
    if (str1.length() < str2.length()) {
        return false;
    }

    // 1. לולאה שרצה על str1 (רק עד המקום שיש בו מספיק מקום ל-str2)
    for (int i = 0; i <= str1.length() - str2.length(); i++) {
        
        // נניח שיש התאמה, וננסה להוכיח שלא
        boolean match = true;
        
        // 2. לולאה שבודקת את str2 מול המיקום הנוכחי ב-str1
        for (int j = 0; j < str2.length(); j++) {
            if (str1.charAt(i + j) != str2.charAt(j)) {
                match = false;
                break; // ברגע שיש תו אחד לא תואם (כמו רווח), עוצרים את הבדיקה הזו
            }
        }
        
        // אם סיימנו את הלולאה הפנימית וה-match נשאר true, מצאנו!
        if (match) {
            return true;
        }
    }
    
    return false;
}
}