package day19_LoopPratices;

public class FrequencyOfCharacters {
    public static void main(String[] args) {


        String str = "aabcccbbddaaccddd";
        String result = "";

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);// 'a'
            int count = 0;


            for (int i = 0; i < str.length(); i++) { // to find the frequency of each character
                char each = str.charAt(i); // each character of string
                if (ch == each) {
                    count++;
                }

                }
                if (result.contains(""+ch)){
                    continue;
                }
                result += ch;
                result += count;


            }

                System.out.println(result);
    }

}
