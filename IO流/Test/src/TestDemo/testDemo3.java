package TestDemo;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.ReUtil;
import cn.hutool.http.HttpUtil;

import java.util.*;

public class testDemo3 {
    public static void main(String[] args) {
        //1.记录网址
        String familyNameNet = "https://hanyu.baidu.com/shici/detail?from=kg1&highlight=&pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&srcid=51369";
        String boyNameNet = "http://www.haoming8.cn/baobao/10881.html";
        String girlNameNet = "http://www.haoming8.cn/baobao/7641.html";

        //2.爬取数据，把网上的数据链接成一个字符串
        String familyNameStr = HttpUtil.get(familyNameNet);
        String boyNameStr = HttpUtil.get(boyNameNet);
        String girlNameStr = HttpUtil.get(girlNameNet);

        //3.利用正则表达式，筛选数据
        List<String> familyNameTempList = ReUtil.findAll("(.{4})([，。])", familyNameStr, 1);
        List<String> boyNameTempList = ReUtil.findAll("([\\u4E00-\\u9FA5]{2})([、。])", boyNameStr, 1);
        List<String> girlNameTempList = ReUtil.findAll("(.. ){4}..", girlNameStr, 0);

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
}
