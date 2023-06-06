package Strings;
/*
find longest substring without repeating characters in the given string
For example, if “javaconceptoftheday” is the input string, then the longest substring without repeating or duplicate
characters is “oftheday” and its length is 8.
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LongestNonRepeatingString {

    static void result(String str){
        List<String> result=new ArrayList<>();
        int mainPointer=0; boolean flag=true;
        int initialPointer=mainPointer;
        while(mainPointer<str.length()){

            for(int movingPointer=initialPointer;movingPointer <mainPointer;movingPointer++){

                if(str.charAt(movingPointer)==str.charAt(mainPointer))
                {
                    flag=false; break;
                }
            }
            if(flag && mainPointer==str.length()-1)
            {
                result.add(str.substring(initialPointer));
            }

            if(!flag)
            {
                result.add(str.substring(initialPointer,mainPointer));

                mainPointer=++initialPointer;
                flag=true;
            }
            else
                mainPointer++;
        }

        result.stream().forEach(System.out::println);
    }
    public static void main(String[] args) {
 LongestNonRepeatingString.result("javaconceptoftheday");

    }
}
