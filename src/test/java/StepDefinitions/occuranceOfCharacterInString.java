package StepDefinitions;

import java.util.HashMap;
import java.util.Map;

public class occuranceOfCharacterInString {
    public static void main(String[] args)
    {
        String str0="aaabccdd ee";
       String str= str0.replaceAll(" ","");
         char[] ch=str.toCharArray();
         Map<Character, Integer> hm=new HashMap<Character, Integer>();
         for(char c:ch)
         {
          if(hm.containsKey(c))
          {
              hm.put(c, hm.get(c)+1);
          }
          else
          {
              hm.put(c,1);
          }
         }
         for(Map.Entry<Character, Integer>entry:hm.entrySet()) {
             if (entry.getValue() >= 1)
             {

                 System.out.println(entry.getKey()+" : "+ entry.getValue());
             }
         }

    }
}
