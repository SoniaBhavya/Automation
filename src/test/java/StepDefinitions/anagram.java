package StepDefinitions;

import java.util.Arrays;
import java.util.Locale;

public class anagram {
    public static void main(String[] args)
    {
        String str1="Race to";
        String str2="Care ot";
       str1= str1.replaceAll(" ","");
      str2=str2.replaceAll(" ","");

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        if(str1.length()==str2.length())
        {
            char[] charArray1=str1.toCharArray();
            char[] charArray2=str2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            Boolean result=Arrays.equals(charArray1, charArray2);
            if(result)
            {
                System.out.println(str1 + str2 + "are anagram");
            }
            else
            {
                System.out.println(str1 + str2 + "are not anagram");
            }
        }
        else
        {
            System.out.println(str1 + str2 + "are not anagram");
        }

    }
}
