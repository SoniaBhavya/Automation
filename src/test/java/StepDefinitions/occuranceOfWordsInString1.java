package StepDefinitions;

import java.util.HashMap;
import java.util.Map;

public class occuranceOfWordsInString1 {
    public  static void main(String[] args)
    {
        String str="Iam Sonia and Iam Sonia";
       String[] word=str.split(" ");

        int count=0;
        Map<String, Integer> hm=new HashMap<>();
        for(int i=0; i<word.length; i++)
        {
           // count=0;
            for(int j=i; j<word.length; j++)
            {
                if(word[i]==word[j])
                {
                    count++;
                }
            }
            hm.put(word[i],count);
        }
        System.out.println(hm);

    }
}
