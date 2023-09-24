package programs;

public class occuranceOfWordsinStringFromGivenWord {
    public static void main(String[] args)
    {
        String str="This is Automation. this Is Testing";
        String str1="this";

       String[] word= str.split(" ");
        int count=0;
       for(int i=0;i<word.length;i++)
       {

           if (str1.equalsIgnoreCase(word[i]))
           {
               count++;

           }

           }
        System.out.println(str1+" repeates "+count+ " times ");
       }
    }

