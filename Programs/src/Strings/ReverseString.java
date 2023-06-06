package Strings;
/*
reverse a given string with preserving the position of spaces
 */
public class ReverseString {
    static String getReverse(String str){
        int startPos=0;int endPos=str.length()-1;
        char[] charSequence=new char[str.length()];

        while(startPos<=endPos){
            if(str.charAt(startPos)==' '){
                charSequence[startPos]=str.charAt(startPos);
                startPos++;
            }
            if(str.charAt(endPos)==' '){
                charSequence[endPos]=str.charAt(endPos);
                endPos--;
            }

            charSequence[endPos]=str.charAt(startPos);
            charSequence[startPos]=str.charAt(endPos);
            startPos++;endPos--;

        }
      return(new String(charSequence));
    }
    public static void main(String[] args) {

        System.out.println(ReverseString.getReverse("I Am Not String"));
    }
}
