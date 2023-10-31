package TestDemo;

import cn.hutool.core.io.FileUtil;

import java.util.ArrayList;

public class testDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<>();
        list.add("寝室长");
        list.add("草泥马");
        list.add("傻逼");
        FileUtil.writeLines(list, "D:\\javaProject\\javaIdeaProjects\\IO流\\a.txt", "UTF-8", true);
    }
}
