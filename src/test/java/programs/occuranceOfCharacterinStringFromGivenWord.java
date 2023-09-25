package programs;

public class occuranceOfCharacterinStringFromGivenWord {
    public static void main(String[] args)
    {
        String str="aabcccdddd";
        char ch='d';
       char[] chArray= str.toCharArray();
       int count=0;
       for(int i=0;i<chArray.length;i++)
       {
           if(ch==chArray[i])
           {
               count++;
           }
       }
        System.out.println(ch+" is repeating "+ count);
    }
}
