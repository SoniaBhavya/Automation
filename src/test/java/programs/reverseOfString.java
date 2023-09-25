package programs;

public class reverseOfString {
    //output: si sihT
    public static void main(String[] args)
    {
        String str="This is";
        char[] chArray=str.toCharArray();
        for(int i=chArray.length-1; i>=0;i--)

        {
             char c= str.charAt(i);
            System.out.print(c);
        }
    }
//
//    // output: is This
//    public static void main(String[] args)
//    {
//        String str="This is";
//        String y="";
//        String[] word=str.split(" ");
//        for(int i=word.length-1; i>=0;i--)
//
//        {
//           String w=word[i];
//         y= w+" ";
//            System.out.print(y);
//
//        }
//
//    }
}
