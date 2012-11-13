
public class StringTest {
    public static void main(String[] args) {
        String str = "My name is khan";
//        String result = reverseString(str);
//        String result = reverseWords(str);
//        String result = reverseSequence(str);
        String result = iReverseSequence(str);

        System.out.println(result);
    }

    static String reverseString(String str) {
        char[] ch = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i=(ch.length-1);i>=0;i--) {
            sb.append(ch[i]);
        }
        return sb.toString();
    }

    static String reverseWords(String str) {
        String[] st = str.split("\\s");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i < st.length;i++) {
            sb.append(reverseString(st[i])+" ");
        }
        return sb.toString();
    }

    static String reverseSequence(String str) {
        String[] st = str.split("\\s");
        StringBuilder sb = new StringBuilder();
        for(int i=(st.length-1);i>=0;i--) {
            sb.append(st[i]+" ");
        }
        return sb.toString();
    }


    // Without using inbuilt java functions (for ex without using split())
    // I still used substr() though
    static String iReverseSequence(String str) {
        String word = "";
        int lastIndex = str.length();
        for(int i=(str.length()-1);i>=0;i--) {
            if(str.charAt(i) == ' ') {
                word += str.substring(i+1,lastIndex)+" ";
                lastIndex = i;
            }
        }
        word += str.substring(0,lastIndex);
        return word;
    }
}
