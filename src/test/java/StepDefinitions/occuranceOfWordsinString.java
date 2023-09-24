package StepDefinitions;

import java.util.HashMap;
import java.util.Map;

public class occuranceOfWordsinString {



        public static void main(String[] args)
        {
            String str="Iam Sonia and Iam Sonia";

            String[] str1=str.split(" ");

        Map<String, Integer> hm=new HashMap<>();
        for(String word:str1)
        {
            if(hm.containsKey(word))
            {
                hm.put(word, hm.get(word)+1);
            }
            else
            {
                hm.put(word,1);
            }
        }
        for(Map.Entry<String, Integer> entry:hm.entrySet()) {
            if (entry.getValue() >= 1)
            {


                System.out.println(entry.getKey()+" : "+ entry.getValue());
            }
        }

    }
}



