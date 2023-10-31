package TestDemo;


import cn.hutool.core.io.FileUtil;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class testDemo2 {
    public static void main(String[] args) throws IOException {
        //1.记录网址
        String familyNameNet = "https://hanyu.baidu.com/shici/detail?from=kg1&highlight=&pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&srcid=51369";
        String boyNameNet = "http://www.haoming8.cn/baobao/10881.html";
        String girlNameNet = "http://www.haoming8.cn/baobao/7641.html";

        //2/爬取数据，把网址上的所有的数据拼接成一个字符串
        String familyNameStr = webCrawler(familyNameNet);
        String boyNameStr = webCrawler(boyNameNet);
        String girlNameStr = webCrawler(girlNameNet);

        //3.通过正则表达式，把其中符合要求的数据获取出来
        ArrayList<String> familyNameTempList = getData(familyNameStr, "(.{4})([，。])", 1);
        ArrayList<String> boyNameTempList = getData(boyNameStr, "([\\u4E00-\\u9FA5]{2})([、。])", 1);
        ArrayList<String> girlNameTempList = getData(girlNameStr, "(.. ){4}..", 0);

        //4.处理数据
        //familyNameTempList（姓氏）
        //处理方案：把每一个姓氏拆开并添加到一个新的集合当中
        ArrayList<String> familyNameList = new ArrayList<>();
        for (String s : familyNameTempList) {
            char[] chars = s.toCharArray();
            for (char Char : chars) {
                String value = String.valueOf(Char);
                familyNameList.add(value);
            }
        }

        //boyNameTempList（男生的名字）
        //处理方案：去除其中的重复元素
        HashSet<String> boyNameList = new HashSet<>(boyNameTempList);

        //girlNameStrTempList（女生的名字）
        //处理方案：把里面的每一个元素用空格进行切割，得到每一个女生的名字
        HashSet<String> girlNameList = new HashSet<>();
        for (String s : girlNameTempList) {
            String[] splits = s.split(" ");
            girlNameList.addAll(Arrays.asList(splits));
        }

        //5.生成数据
        //生成男生信息
        HashSet<String> boysTempList = getInfos(familyNameList, boyNameList, 50);
        ArrayList<String> boysList = getResult(boysTempList, '男');

        //生成女生信息
        HashSet<String> girlTempList = getInfos(familyNameList, girlNameList, 70);
        ArrayList<String> girlList = getResult(girlTempList, '女');

        //6.写出数据
        FileUtil.writeLines(boysList, "D:\\javaProject\\javaIdeaProjects\\IO流\\a.txt", "UTF-8");
        FileUtil.writeLines(girlList, "D:\\javaProject\\javaIdeaProjects\\IO流\\a.txt", "UTF-8", true);
    }

    /*
     * 作用：生成男生或女生的信息
     * 形参一：
     *       装着姓名的集合
     * 形参二：
     *       性别
     *
     * */
    private static ArrayList<String> getResult(HashSet<String> hashSet, Character character) {
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        for (String s : hashSet) {
            int age = r.nextInt(10) + 18;
            list.add(s + "-" + character + "-" + age);
        }
        return list;
    }

    /*
     *作用：获取男生或者女生的信息
     *形参一：
     *      装着姓氏的集合
     *形参二：
     *      装着名字的集合
     *形参三：
     *      需要生成的名字的数量
     *
     * */
    private static HashSet<String> getInfos(ArrayList<String> list, HashSet<String> hashSet, int count) {
        HashSet<String> hs = new HashSet<>();
        ArrayList<String> nameList = new ArrayList<>(hashSet);
        while (hs.size() != count) {
            Collections.shuffle(list);
            Collections.shuffle(nameList);
            hs.add(list.get(0) + nameList.get(0));
        }
        return hs;
    }

    /*
     * 作用：根据正则表达式获取字符串中的数据
     * 参数一：
     *       完整的字符串
     * 参数二：
     *       正则表达式
     * 参数三：
     *       索引
     *
     * */
    private static ArrayList<String> getData(String str, String regex, int index) {
        //1.创建集合存放数据
        ArrayList<String> list = new ArrayList<>();
        //2.按照正则表达式的规则，去获取数据
        Pattern pattern = Pattern.compile(regex);
        //按照pattern的规则，到str当中获取数据
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            list.add(matcher.group(index));
        }
        return list;
    }

    /*
     *作用：
     *  从网络中爬取数据，把数据拼接成字符串
     *形参：
     *  网址
     *返回值：
     *  爬取到的所有的数据
     *
     * */
    private static String webCrawler(String net) throws IOException {
        //1.定义StringBuilder拼接爬取到的数据
        StringBuilder sb = new StringBuilder();
        //2.创建一个URL对象
        URL url = new URL(net);
        //3.链接上这个网址
        //细节：保证网络是畅通的，而却这个网址可以链接上的                                    。
        URLConnection conn = url.openConnection();
        //4.读取数据
        InputStreamReader isr = new InputStreamReader(conn.getInputStream());
        int ch;
        while ((ch = isr.read()) != -1) {
            sb.append((char) ch);
        }
        isr.close();
        return sb.toString();
    }
}
