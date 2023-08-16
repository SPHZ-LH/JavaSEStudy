import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test5 {
    public static void main(String[] args) {
        String str = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，" +
                "因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";
        Pattern p = Pattern.compile("((?i)java)(?=8|11|17)");
        Pattern p1 = Pattern.compile("((?i)java)(?!8|11|17)");
        Pattern p2 = Pattern.compile("((?i)java)(?:8|11|17)");
        Matcher matcher = p1.matcher(str);
        while(matcher.find()){
            String s = matcher.group();
            System.out.println(s);
        }
    }
}
