public class test8 {
    public static void main(String[] args) {
        //a123a  a123b
        String str ="(.)\\d+\\1";
        System.out.println("a123a".matches(str));
        System.out.println("a123b".matches(str));
        //abc123abc   b456b  abc123abd

        String regex1 ="(.+).+\\1";
        System.out.println("abc123abc".matches(regex1));
        System.out.println("b456b".matches(regex1));
        System.out.println("abc123abd".matches(regex1));

        //aaa123aaa  aaa123aab

        String regex2="((.)\\2*)\\w+\\1";
        System.out.println("aaa123aaa".matches(regex2));
        System.out.println("aaa123aab".matches(regex2));
    }
}
