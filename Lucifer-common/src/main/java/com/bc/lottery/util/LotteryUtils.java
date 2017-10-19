package com.bc.lottery.util;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;

/**
 * Lottery相关工具计算类
 * Created by luis on 2017/4/13.
 */

public class LotteryUtils {

    /**
     * 相乘
     *
     * @param args
     * @return
     */
    public static long toMultiplyAll(int... args) {
        if (args == null) {
            return 0;
        }
        long result = 1;
        for (int i : args) {
            result *= i;
        }
        return result;
    }

    public static long toMultiplyAll(List<List<String>> args) {
        if (args == null || args.isEmpty()) {
            return 0;
        }
        long result = 1;
        for (List<String> i : args) {
            result *= i.size();
        }
        return result;
    }

    /**
     * 相加
     *
     * @param args
     * @return
     */
    private static long toPlusAll(int... args) {
        if (args == null) {
            return 0;
        }
        long result = 0;
        for (int i : args) {
            result += i;
        }
        return result;
    }

    public static long toPlusAll(List<List<String>> args) {
        if (args == null || args.isEmpty()) {
            return 0;
        }
        long result = 0;
        for (List<String> i : args) {
            result += i.size();
        }
        return result;
    }

    /**
     * 2列组合去重
     *
     * @param a    第一组需选的号码数
     * @param b    第二组需选的号码数
     * @param args
     * @return
     */
    public static long twoCombinationRemoveRepeat(int a, int b, List<List<String>> args) {
        if (a <= 0 || b <= 0) {
            return 0;
        }
        if (args == null || args.size() < 2) {
            return 0;
        }
        return twoCombinationRemoveRepeat(a, args.get(0).size(), b, args.get(1).size(), (int) LotteryUtils.intersectionOfSetNum(args.get(0), args.get(1)));
    }

    /**
     * 取交集元素个数
     *
     * @param a
     * @param b
     * @return
     */
    public static long intersectionOfSetNum(List<String> a, List<String> b) {
        if (a == null || a.isEmpty() || b == null || b.isEmpty()) {
            return 0;
        }
        List<String> temp = new ArrayList<>();
        temp.addAll(a);
        temp.retainAll(b);
        return temp.size();
    }

    public static long intersectionOfSetNum(List<String> a, List<String>... b) {
        if (a == null || a.isEmpty() || b == null || b.length == 0) {
            return 0;
        }
        List<String> temp = new ArrayList<>();
        temp.addAll(a);
        for (List<String> list : b) {
            temp.retainAll(list);
        }
        return temp.size();
    }

    /**
     * 组合去重
     * C(m,a)*C(n,b)-k*C(m-1,a-1)*C(n-1,b-1)
     *
     * @param a
     * @param b
     * @param m
     * @param n
     * @param k 重复数
     * @return
     */
    private static long twoCombinationRemoveRepeat(int a, int m, int b, int n, int k) {
        if (a <= 0 || b <= 0 || m <= 0 || n <= 0 || k < 0) {
            return 0;
        }
        return (combination(m, a) * combination(n, b)) - (k * combination(m - 1, a - 1) * combination(n - 1, b - 1));
    }

    /**
     * 计算组合数
     * C(n,r) = n!/(r!*(n-r)!)
     *
     * @param n
     * @param r
     * @return
     */
    public static long combination(int n, int r) {

        if (r < 0 || n < r) {
            return 0;
        }

        if (n == 0) {
            return 1;
        }

        return factorialLoop(n) / (factorialLoop(r) * factorialLoop(n - r));
    }

    /**
     * 循环实现阶乘算法
     *
     * @param n [0, 12] 用int型: (12, 20] 用long: (20, 用BigInteger
     * @return
     */
    private static long factorialLoop(int n) {
        // 阶乘对整数才有意义
        if (n < 0) {
            return 0;
        }

        // 0！=1，（0 的阶乘是存在的）
        if (n == 0) {
            return 1;
        }

        // 初始值必须为1才有意义
        long result = 1;
        for (int i = n; i > 0; i--) {
            result *= i;
        }

        return result;
    }

    /**
     * 大数计算组合数
     *
     * @param n
     * @param r
     * @return
     */
    public static long combinationBig(int n, int r) {
        if (n < 0 || r < 0) {
            return 0;
        }
        if (n == 0 || r == 0) {
            return 1;
        }
        if (r > n) {
            return 0;
        }
        if (r > n / 2) {
            r = n - r;
        }
        double result = 0;
        for (int i = n; i >= (n - r + 1); i--) {
            //下面的函数返回指定变量的自然对数：
            result += Math.log(i);
        }
        for (int i = r; i >= 1; i--) {
            result -= Math.log(i);
        }
        result = Math.exp(result);
        //方法可把一个数字舍入为最接近的整数。
        return Math.round(result);
    }

    /**
     * 判断字符串中是否存在重复字符
     *
     * @param iniString
     * @return true-不重复；false-重复
     */
    public static boolean checkDifferent(String iniString) {

        if (iniString.matches("^.*?(.+?)\\1.*?$")) {
            return true;
        }

        return false;
    }

    /**
     * 获取字符串中的重复字符
     *
     * @param iniString
     * @return
     */
    public static Set<String> getDupStr(String iniString) {

        Set<String> dupStrSet = new HashSet<>();

        String[] inStrArr = iniString.split("");
        for (String str1 : inStrArr) {
            int i = 0;//重复次数
            for (String str2 : inStrArr) {

                if (str1.equals(str2)) {
                    i++;
                }
            }
            if (i >= 2) {
                dupStrSet.add(str1);
            }
        }
        return dupStrSet;
    }

    /**
     * 获取字符串中的非重复字符
     *
     * @param iniString
     * @return
     */
    public static List<String> getUnDupStr(String iniString) {
        List<String> unDupStrList = new ArrayList<>();

        String[] inStrArr = iniString.split("");
        for (String str1 : inStrArr) {
            int i = 0;//重复次数
            for (String str2 : inStrArr) {

                if (str1.equals(str2)) {
                    i++;
                }
            }
            if (i == 1) {
                unDupStrList.add(str1);
            }
        }
        return unDupStrList;
    }

    /**
     * 获取指定重复次数的字符串
     *
     * @param iniString 需要计算的字符串
     * @param dupNum    重复次数
     * @return
     */
    public static Set<String> getDupStrByDupNum(String iniString, int dupNum) {
        Set<String> dupStrList = new HashSet<>();

        String[] inStrArr = iniString.split("");
        for (String str1 : inStrArr) {
            int i = 0;//重复次数
            for (String str2 : inStrArr) {

                if (str1.equals(str2)) {
                    i++;
                }
            }
            if (i == dupNum) {
                dupStrList.add(str1);
            }
        }
        return dupStrList;
    }

    /**
     * 三位数判断是否是顺子(顺序不计)
     *
     * @param iniString
     * @return
     */
    public static boolean checkShunzi(String iniString) {

        String[] strArr = iniString.split("");
        if (strArr.length != 3) {
            return false;
        }
        Set<String> set1 = new HashSet<>();
        set1.add("0");
        set1.add("1");
        set1.add("2");
        if (set1.containsAll(Arrays.asList(strArr))) {
            return true;
        }
        Set<String> set2 = new HashSet<>();
        set2.add("1");
        set2.add("2");
        set2.add("3");
        if (set2.containsAll(Arrays.asList(strArr))) {
            return true;
        }
        Set<String> set3 = new HashSet<>();
        set3.add("2");
        set3.add("3");
        set3.add("4");
        if (set3.containsAll(Arrays.asList(strArr))) {
            return true;
        }
        Set<String> set4 = new HashSet<>();
        set4.add("3");
        set4.add("4");
        set4.add("5");
        if (set4.containsAll(Arrays.asList(strArr))) {
            return true;
        }
        Set<String> set5 = new HashSet<>();
        set5.add("4");
        set5.add("5");
        set5.add("6");
        if (set5.containsAll(Arrays.asList(strArr))) {
            return true;
        }
        Set<String> set6 = new HashSet<>();
        set6.add("5");
        set6.add("6");
        set6.add("7");
        if (set6.containsAll(Arrays.asList(strArr))) {
            return true;
        }
        Set<String> set7 = new HashSet<>();
        set7.add("6");
        set7.add("7");
        set7.add("8");
        if (set7.containsAll(Arrays.asList(strArr))) {
            return true;
        }
        Set<String> set8 = new HashSet<>();
        set8.add("7");
        set8.add("8");
        set8.add("9");
        if (set8.containsAll(Arrays.asList(strArr))) {
            return true;
        }
        Set<String> set9 = new HashSet<>();
        set9.add("8");
        set9.add("9");
        set9.add("0");
        if (set9.containsAll(Arrays.asList(strArr))) {
            return true;
        }
        Set<String> set10 = new HashSet<>();
        set10.add("9");
        set10.add("0");
        set10.add("1");
        if (set10.containsAll(Arrays.asList(strArr))) {
            return true;
        }

        return false;
    }

    /**
     * 三位数判断是否是半个顺子(顺序不计)
     *
     * @param iniString
     * @return
     */
    public static boolean checkHalfShunzi(String iniString) {

        if (checkShunzi(iniString)) {
            return false;
        }
        String[] strArr = iniString.split("");
        if (strArr.length != 3) {
            return false;
        }
        if (Math.abs(Integer.parseInt(strArr[0]) - Integer.parseInt(strArr[1])) == 1 || Math.abs(Integer.parseInt(strArr[0]) - Integer.parseInt(strArr[1])) == 9
                || Math.abs(Integer.parseInt(strArr[1]) - Integer.parseInt(strArr[2])) == 1 || Math.abs(Integer.parseInt(strArr[1]) - Integer.parseInt(strArr[2])) == 9
                || Math.abs(Integer.parseInt(strArr[0]) - Integer.parseInt(strArr[2])) == 1 || Math.abs(Integer.parseInt(strArr[2]) - Integer.parseInt(strArr[1])) == 9) {
            return true;
        }
        return false;
    }


    /**
     * 获取指定最小重复次数的字符串
     *
     * @param iniString 需要计算的字符串
     * @param dupNum    重复次数
     * @return
     */
    public static Set<String> getDupStrByMixDupNum(String iniString, int dupNum) {
        Set<String> dupStrList = new HashSet<>();

        String[] inStrArr = iniString.split("");
        for (String str1 : inStrArr) {
            int i = 0;//重复次数
            for (String str2 : inStrArr) {

                if (str1.equals(str2)) {
                    i++;
                }
            }
            if (i >= dupNum) {
                dupStrList.add(str1);
            }
        }
        return dupStrList;
    }

    /**
     * 获取指定字符串各位数值的和
     *
     * @param iniString 需要计算的字符串
     * @return
     */
    public static int getStrSum(String iniString) {

        int strSum = 0;//字符串和值
        String[] inStrArr = iniString.split("");
        for (String str : inStrArr) {
            strSum += Integer.parseInt(str);
        }
        return strSum;
    }

    public static int getStrSum(List<String> iniStrList) {

        int strSum = 0;//字符串和值
        for (String str : iniStrList) {
            strSum += Integer.parseInt(str);
        }
        return strSum;
    }

    public static int getStrSum(String... iniStrArr) {

        int strSum = 0;//字符串和值
        for (String str : iniStrArr) {
            strSum += Integer.parseInt(str);
        }
        return strSum;
    }

    /**
     * 按指定长度截取传入的strList数据
     *
     * @param strList
     * @param length
     * @return 返回开奖号列表
     */
    public static List<String> getSubStrList(List<String> strList, int length) {

        List<String> resultList = new ArrayList<>();
        for (int i = 0; i < strList.size() / length; i++) {

            StringBuilder oneStr = new StringBuilder("");
            for (int j = 0; j < length; j++) {

                oneStr.append(strList.get(i * length + j));
            }
            resultList.add(oneStr.toString());
        }
        return resultList;
    }

    /**
     * 按指定长度截取传入的strList数据
     *
     * @param strList
     * @param length
     * @return 返回开奖号列表
     */
    public static List<List<String>> getStrListForSanxing(List<String> strList, int length) {

        List<List<String>> resultList = new ArrayList<>();

        for (int i = 0; i < strList.size() / length; i++) {
            List<String> strForEach = new ArrayList<>();
            for (int j = 0; j < length; j++) {

                strForEach.add(strList.get(i * length + j));
            }
            resultList.add(strForEach);
        }
        return resultList;
    }


    /**
     * 获取指定数字的大小单双
     *
     * @param aimNo 需要计算的数
     * @param maxNo 数范围的最大值（从0开始，如0-9，maxNo=9）
     * @return
     */
    public static List<String> getDaxiaodanshuangList(int aimNo, int maxNo) {

        List<String> resultList = new ArrayList<>();

        // 判断奇偶
        if (aimNo % 2 == 1) {
            resultList.add("单");
        } else {
            resultList.add("双");
        }
        // 判断大小
        if (aimNo <= maxNo / 2) {
            resultList.add("小");
        } else {
            resultList.add("大");
        }

        return resultList;
    }

    /**
     * 获取指定数字的大小单双
     *
     * @param aimNo 需要计算的数
     * @param maxNo 数范围的最大值（从0开始，如0-9，maxNo=9）
     * @param maxNo 中间值（如果等于中间值，则为和）
     * @return
     */
    public static List<String> getDaxiaodanshuangList(int aimNo, int maxNo, int ignoreNo) {

        List<String> resultList = new ArrayList<>();

        if (aimNo != ignoreNo) {
            // 判断奇偶
            if (aimNo % 2 == 1) {
                resultList.add("单");
            } else {
                resultList.add("双");
            }

            // 判断大小
            if (aimNo <= maxNo / 2) {
                resultList.add("小");
            } else {
                resultList.add("大");
            }
        }

        return resultList;
    }

    /**
     * 获取定单双 （格式为 x单x双）
     *
     * @param inStr
     * @return
     */
    public static String getDingDanShuangString(List<String> inStr) {

        if (inStr == null || inStr.size() == 0) {
            return "0单0双";
        }
        StringBuilder resultBuilder = new StringBuilder();

        int oddNum = 0;//奇数数量

        for (String str : inStr) {
            if (Integer.parseInt(str) % 2 == 1) {
                oddNum++;
            }
        }

        resultBuilder.append(oddNum).append("单").append(inStr.size() - oddNum).append("双");

        return resultBuilder.toString();
    }

    /**
     * 获取中位数字
     *
     * @param inStr
     * @return
     */
    public static String getCaiZhongWeiString(List<String> inStr) {

        if (inStr == null || inStr.size() == 0 || inStr.size() % 2 == 0) {
            return "";
        }
        StringBuilder resultBuilder = new StringBuilder();

        Collections.sort(inStr);

        return inStr.get((inStr.size() - 1) / 2);
    }

    /**
     * 获取龙虎和信息
     *
     * @param firstNo
     * @param lastNo
     * @return
     */
    public static List<String> getLongHuHeList(int firstNo, int lastNo) {

        List<String> resultList = new ArrayList<>();

        // 判断奇偶
        if (firstNo == lastNo) {
            resultList.add("和");
        } else if (firstNo > lastNo) {
            resultList.add("龙");
        } else {
            resultList.add("虎");
        }
        return resultList;
    }

    /**
     * 双面彩判断特殊玩法
     *
     * @param aimStr
     * @return
     */
    public static List<String> getDoubleTeShuWanFaList(String aimStr) {

        List<String> resultList = new ArrayList<>();
        String[] inStrArr = aimStr.split("");
        if (inStrArr.length != 3) {
            return resultList;
        }
        if (!getDupStrByDupNum(aimStr, 3).isEmpty()) {
            resultList.add("豹子");
        } else if (!getDupStrByDupNum(aimStr, 2).isEmpty()) {
            resultList.add("对子");
        } else if (checkShunzi(aimStr)) {
            resultList.add("顺子");
        } else if (checkHalfShunzi(aimStr)) {
            resultList.add("半顺");
        } else {
            resultList.add("杂六");
        }
        return resultList;
    }

    public static void main(String[] args) {

        System.out.println(combinationBig(21, 4));

        System.out.println(6 / 2);

        String str1 = "1";
        String str2 = "2";
        String str3 = "3";
        List<String> strList = new ArrayList<>();

        strList.add(str1);
        strList.add(str2);
        strList.add(str3);

        System.out.println(getDoubleTeShuWanFaList("123"));
        System.out.println(getDoubleTeShuWanFaList("124"));
        System.out.println(getDoubleTeShuWanFaList("324"));
        System.out.println(getDoubleTeShuWanFaList("666"));
        System.out.println(getDoubleTeShuWanFaList("665"));
        System.out.println(getDoubleTeShuWanFaList("368"));

        System.out.println(getLongHuHeList(1, 2));
        System.out.println(getLongHuHeList(4, 3));
        System.out.println(getLongHuHeList(5, 5));

        System.out.println(checkNumberDecimal("12"));
        System.out.println(checkNumberDecimal("12.2345"));


        List<String> sortList = new ArrayList<>();
        sortList.add("02");
        sortList.add("12");
        sortList.add("04");
        sortList.add("09");
        sortList.add("07");
        System.out.println(getCaiZhongWeiString(sortList));

    }

    private static String checkNumberDecimal(Object obj) {
        NumberFormat nf = new DecimalFormat("##0.00");
        return String.format((obj == null) ? "0.00" : nf.format(Float.parseFloat(obj.toString())));
    }
}
