package programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class removeDuplicatesWordsInString {
    public static void main(String[] args)
    {
        String str="Iam Sonia and Iam Automation";
       String[] str1= str.split(" ");
//insertion order preserved and avois duplicates
        LinkedHashSet lhs=new LinkedHashSet<>();
        for (String word:str1)
        {

            lhs.add(word);

        }
        System.out.println(lhs);



    }
}
