package Strings;

import java.util.HashMap;

/*
Given a string , you have to count the number of occurrences of each character in it.
 */
public class CharacterOccurrances {

    static void getCharOccurrances(String str){

        HashMap<Character,Integer> result=new HashMap<>();

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                continue;

            }
            else if(result.containsKey(str.charAt(i))){
                int val=result.get(str.charAt(i));
                result.put(str.charAt(i),++val);
            }
            else
            {
                int initialValue=1;
                result.put(str.charAt(i),initialValue);
            }
        }

        result.forEach((key,value)->System.out.println(key+"="+value));

    }
    public static void main(String[] args) {
        CharacterOccurrances.getCharOccurrances("Java J2EE Java JSP J2EE");
    }
}
