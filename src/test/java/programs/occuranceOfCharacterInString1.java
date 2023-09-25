package programs;

import java.util.HashMap;
import java.util.Map;

public class occuranceOfCharacterInString1 {
    public static void main(String[] args)

    {
        String str="aaaabcc";// if their is words in sentence, firstly split n take it
        char[] ch=str.toCharArray();
        int count=0;
        Map<Character,Integer> hm=new HashMap<>();
        for(int i=0; i<ch.length; i++)
        {
            count=0;
            for(int j=0; j<ch.length; j++)
            {
                if(ch[i]==ch[j])
                {
                    count++;
                }
            }
            hm.put(ch[i],count);
        }
        System.out.println(hm);

    }
}
