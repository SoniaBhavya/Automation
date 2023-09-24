package programs;

public class equalAndequalIgnoreCase {
    public static void main(String[] args)
{
    String str="This is Auto";
    String str1="this is auto";

    System.out.println(str.equals(str1));
    System.out.println(str.equalsIgnoreCase(str1));

}
}
