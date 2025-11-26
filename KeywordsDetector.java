public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    //* if keyword is in sentence print sentence
    // conatin(keyword[i] , sentene[j])
    // if true printz
    // j++
    // if false */
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        for (int i = 0;i<sentences.length;i++) {
            String curnnetSentence = sentences[i].toLowerCase();
            for (int j = 0 ; j<keywords.length;j++){
                String curnnetKeyword = keywords[j].toLowerCase();
                if (contains(curnnetSentence, curnnetKeyword)) {
                    System.out.println(sentences[i]);
                }
            
            }
        }
            }

            public static boolean contains(String str1, String str2) {
        int i =0;
        int j = 0;
        String res = "";
        if (str1.length()<str2.length()) {
            return false;
        }
        while (i<str2.length()) {
            while (j<str1.length()) {
                if (str2.charAt(i) != str1.charAt(j)) {
                    j++;
                }else {
                    res = res + str2.charAt(i);
                    i++;
                    j++;
                }if (res.length()== str2.length()) {
                    return true;
                }
                }i++;
                
            }
            
            
        
        return false;
    }
        }

