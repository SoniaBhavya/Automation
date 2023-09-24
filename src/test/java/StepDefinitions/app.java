//package StepDefinitions;
//
//import org.apache.poi.ss.formula.functions.DCount;
//
//import java.util.Arrays;
//
//public class app {
//    public static void main(String[] args) {
//        String str = "This vivek This This This";
//        int count = 0;
//        String news = "";
//        String[] word = str.split(" ");
//        String[] arr_new = new String[word.length-1];
//        for (int i = 0; i < word.length; i++) {
//            for (int j = i + 1; j < word.length; j++) {
//                arr_new[i] =word[j];
//                if (word[i].equals(word[j])) {
//                    count++;
//                }else {
//
//                }
//            }
//        }
//        System.out.println("the word " + Arrays.toString(arr_new) +"  "+ count);
//
//
////        String str = "This vivek This This";
////        String str2="This";
////        int i=0;
////        int count=0;
////        String[] word = str.split(" ");
////
////        for ( i = 0; i < word.length; i++) {
////            if(str2.equals(word[i]))
////            {
////                count++;
////            }
////        }
////        System.out.println( str2+ "word is repeating "+ count);
//
//    }
//}
