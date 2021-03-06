package com.bc.lottery.draw.service.impl;

import com.babel.forseti_order.model.UserOrderPO;
import com.bc.lottery.entity.LotteryType;
import com.bc.lottery.entity.ShishicaiDoubleType;
import com.bc.lottery.entity.ShishicaiType;
import com.bc.lottery.util.LotteryUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * User: clion
 * Date: 2017/10/30
 * Time: 19:10
 **/
public class LotteryShishicaiDraw {


    /**
     * 时时彩传统盘开奖算法
     *
     * @param lotteryType
     * @param kj
     * @param lotteryOrderList
     * @return
     */
    public static List<UserOrderPO> getBoundsInfoOfShishicai(LotteryType lotteryType, String kj, List<UserOrderPO> lotteryOrderList) {

        kj = getRealShiShiCaiKj(kj.replace(",", "").replace("|", ""), lotteryType);
        String[] kjArr = kj.split("");
        for (UserOrderPO lotteryOrder : lotteryOrderList) {

            List<List<String>> betNumbers = lotteryOrder.getBetContentProc();

            int size = betNumbers.size();
            int firstPrizeNum = 0; // 一等奖次数
            int secondPrizeNum = 0;// 二等奖次数
            int thirdPrizeNum = 0; // 三等奖次数
            int forthPrizeNum = 0; // 四等奖次数
            int fifthPrizeNum = 0; // 五等奖次数

            Set<String> kjStrList = new HashSet<>();
            ShishicaiType shishicaiType = (ShishicaiType) lotteryType;
            switch (shishicaiType) {

                // 五星直选复式
                case WU_XING_ZHI_XUAN_FU_SHI:
                    if (size == 5) {
                        //判断中间号码是否包含在所选的各组号码中
                        if (betNumbers.get(0).contains(kjArr[0])
                                && betNumbers.get(1).contains(kjArr[1])
                                && betNumbers.get(2).contains(kjArr[2])
                                && betNumbers.get(3).contains(kjArr[3])
                                && betNumbers.get(4).contains(kjArr[4])) {
                            firstPrizeNum = 1;
                        }
                        lotteryOrder.setFirstPrizeNum(firstPrizeNum);
                    }
                    continue;

                    // 五星直选单式
                case WU_XING_ZHI_XUAN_DAN_SHI:
                    if (size == 1) {
                        List<String> betNumberList = getBetNumbers(lotteryType, betNumbers);
                        for (String betNumber : betNumberList) {
                            if (betNumber != null && betNumber.equals(kj)) {
                                firstPrizeNum++;
                            }
                        }
                        lotteryOrder.setFirstPrizeNum(firstPrizeNum);
                    }
                    continue;

                case WU_XING_ZHI_XUAN_ZU_HE:
                    if (size == 5) {
                        // 判断是否中五等奖
                        if (betNumbers.get(4).contains(kjArr[4])) {
                            fifthPrizeNum++;
                            // 判断是否中四等奖
                            if (betNumbers.get(3).contains(kjArr[3])) {
                                forthPrizeNum++;
                                // 判断是否中三等奖
                                if (betNumbers.get(2).contains(kjArr[2])) {
                                    thirdPrizeNum++;
                                    // 判断是否中二等奖
                                    if (betNumbers.get(1).contains(kjArr[1])) {
                                        secondPrizeNum++;
                                        // 判断是否中一等奖
                                        if (betNumbers.get(0).contains(kjArr[0])) {
                                            firstPrizeNum++;
                                        }
                                    }
                                }
                            }
                        }

                        lotteryOrder.setFirstPrizeNum(firstPrizeNum);
                        lotteryOrder.setSecondPrizeNum(secondPrizeNum);
                        lotteryOrder.setThirdPrizeNum(thirdPrizeNum);
                        lotteryOrder.setForthPrizeNum(forthPrizeNum);
                        lotteryOrder.setFifthPrizeNum(fifthPrizeNum);
                    }
                    continue;

                case ZU_XUAN_120:
                    if (size == 1 && LotteryUtils.checkIsZu120(kj)) {

                        //获取中奖号中的非重复字符
                        List<String> unDupStrList = LotteryUtils.getUnDupStr(kj);
                        if (betNumbers.get(0).containsAll(unDupStrList)) {

                            firstPrizeNum = 1;
                        }
                        lotteryOrder.setFirstPrizeNum(firstPrizeNum);
                    }
                    continue;

                case ZU_XUAN_60:
                    if (size == 2 && LotteryUtils.checkIsZu60(kj)) {

                        //获取中奖号中的重复字符
                        Set<String> dupStrList = LotteryUtils.getDupStr(kj);
                        if (betNumbers.get(0).containsAll(dupStrList)) {

                            //判断中奖号中的非重复字符是否全部选中
                            if (betNumbers.get(1).containsAll(LotteryUtils.getUnDupStr(kj))) {
                                firstPrizeNum = 1;
                            }
                        }
                        lotteryOrder.setFirstPrizeNum(firstPrizeNum);
                    }
                    continue;

                case ZU_XUAN_30:
                    if (size == 2 && LotteryUtils.checkIsZu30(kj)) {

                        //获取中奖号中的重复字符
                        Set<String> dupStrList = LotteryUtils.getDupStr(kj);
                        if (betNumbers.get(0).containsAll(dupStrList)) {

                            //判断中奖号中的非重复字符是否全部选中
                            if (betNumbers.get(1).contains(LotteryUtils.getUnDupStr(kj).get(0))) {
                                firstPrizeNum = 1;
                            }
                        }
                        lotteryOrder.setFirstPrizeNum(firstPrizeNum);
                    }
                    continue;

                case ZU_XUAN_20:
                    if (size == 2 && LotteryUtils.checkIsZu20(kj)) {

                        //获取中奖号中的重复字符
                        Set<String> dupStrList = LotteryUtils.getDupStr(kj);
                        if (betNumbers.get(0).containsAll(dupStrList)) {

                            //判断中奖号中的非重复字符是否全部选中
                            if (betNumbers.get(1).containsAll(LotteryUtils.getUnDupStr(kj))) {
                                firstPrizeNum = 1;
                            }
                        }
                        lotteryOrder.setFirstPrizeNum(firstPrizeNum);
                    }
                    continue;

                case ZU_XUAN_10:
                    if (size == 2 && LotteryUtils.checkIsZu10(kj)) {

                        //获取中奖号中的重复3次的字符
                        Set<String> dupStrList = LotteryUtils.getDupStrByDupNum(kj, 3);
                        if (betNumbers.get(0).containsAll(dupStrList)) {

                            //判断中奖号中的非重复字符是否全部选中
                            if (betNumbers.get(1).containsAll(LotteryUtils.getDupStrByDupNum(kj, 2))) {
                                firstPrizeNum = 1;
                            }
                        }
                        lotteryOrder.setFirstPrizeNum(firstPrizeNum);
                    }
                    continue;
                case ZU_XUAN_5:
                    if (size == 2 && LotteryUtils.checkIsZu5(kj)) {

                        //获取中奖号中的重复字符
                        Set<String> dupStrList = LotteryUtils.getDupStr(kj);
                        if (betNumbers.get(0).containsAll(dupStrList)) {

                            //判断中奖号中的非重复字符是否全部选中
                            if (betNumbers.get(1).contains(LotteryUtils.getUnDupStr(kj).get(0))) {
                                firstPrizeNum = 1;
                            }
                        }
                        lotteryOrder.setFirstPrizeNum(firstPrizeNum);
                    }
                    continue;

                    // 四星玩法
                    //四星直选复式
                case SI_XING_ZHI_XUAN_FU_SHI:

                    if (size == 4) {
                        //判断中间号码是否包含在所选的各组号码中
                        if (betNumbers.get(0).contains(kjArr[0])
                                && betNumbers.get(1).contains(kjArr[1])
                                && betNumbers.get(2).contains(kjArr[2])
                                && betNumbers.get(3).contains(kjArr[3])) {
                            firstPrizeNum = 1;
                        }
                        lotteryOrder.setFirstPrizeNum(firstPrizeNum);
                    }
                    continue;

                    // 四星直选单式
                case SI_XING_ZHI_XUAN_DAN_SHI:
                    if (size == 1) {
                        List<String> betNumberList = getBetNumbers(lotteryType, betNumbers);
                        for (String betNumber : betNumberList) {
                            if (betNumber != null && betNumber.equals(kj)) {
                                firstPrizeNum++;
                            }
                        }
                        lotteryOrder.setFirstPrizeNum(firstPrizeNum);
                    }
                    continue;

                case SI_XING_ZHI_XUAN_ZU_HE:
                    if (size == 4) {
                        // 判断是否中四等奖
                        if (betNumbers.get(3).contains(kjArr[3])) {
                            forthPrizeNum++;
                            // 判断是否中三等奖
                            if (betNumbers.get(2).contains(kjArr[2])) {
                                thirdPrizeNum++;
                                // 判断是否中二等奖
                                if (betNumbers.get(1).contains(kjArr[1])) {
                                    secondPrizeNum++;
                                    // 判断是否中一等奖
                                    if (betNumbers.get(0).contains(kjArr[0])) {
                                        firstPrizeNum++;
                                    }
                                }
                            }
                        }

                        lotteryOrder.setFirstPrizeNum(firstPrizeNum);
                        lotteryOrder.setSecondPrizeNum(secondPrizeNum);
                        lotteryOrder.setThirdPrizeNum(thirdPrizeNum);
                        lotteryOrder.setForthPrizeNum(forthPrizeNum);
                    }
                    continue;

                case ZU_XUAN_24:
                    if (size == 1 && LotteryUtils.checkIsZu24(kj)) {

                        //获取中奖号中的非重复字符
                        List<String> unDupStrList = LotteryUtils.getUnDupStr(kj);
                        if (betNumbers.get(0).containsAll(unDupStrList)) {

                            firstPrizeNum = 1;
                        }
                        lotteryOrder.setFirstPrizeNum(firstPrizeNum);
                    }
                    continue;

                case ZU_XUAN_12:
                    if (size == 2 && LotteryUtils.checkIsZu12(kj)) {

                        //获取中奖号中的重复字符
                        Set<String> dupStrList = LotteryUtils.getDupStr(kj);
                        if (betNumbers.get(0).containsAll(dupStrList)) {

                            //判断中奖号中的非重复字符是否全部选中
                            if (betNumbers.get(1).containsAll(LotteryUtils.getUnDupStr(kj))) {
                                firstPrizeNum = 1;
                            }
                        }
                        lotteryOrder.setFirstPrizeNum(firstPrizeNum);
                    }
                    continue;

                case ZU_XUAN_6:
                    if (size == 1 && LotteryUtils.checkIsZu6(kj)) {

                        //获取中奖号中的重复字符
                        Set<String> dupStrList = LotteryUtils.getDupStr(kj);
                        if (betNumbers.get(0).containsAll(dupStrList)) {
                            firstPrizeNum = 1;
                        }
                        lotteryOrder.setFirstPrizeNum(firstPrizeNum);
                    }
                    continue;

                case ZU_XUAN_4:
                    if (size == 2 && LotteryUtils.checkIsZu4(kj)) {

                        //获取中奖号中的重复字符
                        Set<String> dupStrList = LotteryUtils.getDupStr(kj);
                        if (betNumbers.get(0).containsAll(dupStrList)) {

                            //判断中奖号中的非重复字符是否全部选中
                            if (betNumbers.get(1).containsAll(LotteryUtils.getUnDupStr(kj))) {
                                firstPrizeNum = 1;
                            }
                        }
                        lotteryOrder.setFirstPrizeNum(firstPrizeNum);
                    }
                    continue;

                    // 三星玩法
                    //三星复式
                case QIAN_SAN_FU_SHI:
                case ZHONG_SAN_FU_SHI:
                case HOU_SAN_FU_SHI:

                    if (size == 3) {
                        //判断中奖号码是否包含在所选的各组号码中
                        if (betNumbers.get(0).contains(kjArr[0])
                                && betNumbers.get(1).contains(kjArr[1])
                                && betNumbers.get(2).contains(kjArr[2])) {
                            firstPrizeNum = 1;
                        }
                        lotteryOrder.setFirstPrizeNum(firstPrizeNum);
                    }
                    continue;

                    // 三星单式
                case QIAN_SAN_DAN_SHI:
                case ZHONG_SAN_DAN_SHI:
                case HOU_SAN_DAN_SHI:
                    if (size == 1) {
                        List<String> betNumberList = getBetNumbers(lotteryType, betNumbers);
                        for (String betNumber : betNumberList) {
                            if (betNumber != null && betNumber.equals(kj)) {
                                firstPrizeNum++;
                            }
                        }
                        lotteryOrder.setFirstPrizeNum(firstPrizeNum);
                    }
                    continue;

                    // 三星直选和值
                case QIAN_SAN_ZHI_XUAN_HE_ZHI:
                case ZHONG_SAN_ZHI_XUAN_HE_ZHI:
                case HOU_SAN_ZHI_XUAN_HE_ZHI:
                    if (size == 1) {
                        //判断中奖号码是否包含在所选的各组号码中
                        if (betNumbers.get(0).contains(String.valueOf(LotteryUtils.getStrSum(kj)))) {
                            firstPrizeNum = 1;
                        }
                        lotteryOrder.setFirstPrizeNum(firstPrizeNum);
                    }
                    continue;

                    //三星组三
                case QIAN_SAN_ZU_SAN:
                case ZHONG_SAN_ZU_SAN:
                case HOU_SAN_ZU_SAN:
                    if (size == 1 && LotteryUtils.checkIsZu3(kj)) {

                        //获取中奖号中的重复字符
                        Set<String> dupStrList = LotteryUtils.getDupStr(kj);
                        //获取中奖号中的非重复字符
                        List<String> unDupStrList = LotteryUtils.getUnDupStr(kj);
                        if (betNumbers.get(0).containsAll(dupStrList) && betNumbers.get(0).containsAll(unDupStrList)) {
                            firstPrizeNum = 1;
                        }
                        lotteryOrder.setFirstPrizeNum(firstPrizeNum);
                    }
                    continue;

                    //三星组六
                case QIAN_SAN_ZU_LIU:
                case ZHONG_SAN_ZU_LIU:
                case HOU_SAN_ZU_LIU:
                    if (size == 1 && LotteryUtils.checkIsSanxingZu6(kj)) {

                        //判断中奖号中的非重复字符是否全部选中
                        if (betNumbers.get(0).containsAll(LotteryUtils.getUnDupStr(kj))) {
                            firstPrizeNum = 1;
                        }

                        lotteryOrder.setFirstPrizeNum(firstPrizeNum);
                    }
                    continue;

                    // 三星组选和值
                case QIAN_SAN_ZU_XUAN_HE_ZHI:
                case ZHONG_SAN_ZU_XUAN_HE_ZHI:
                case HOU_SAN_ZU_XUAN_HE_ZHI:
                    if (size == 1 && LotteryUtils.checkIsSanxingZuHe(kj)) {
                        //判断中奖号码是否包含在所选的各组号码中
                        if (betNumbers.get(0).contains(String.valueOf(LotteryUtils.getStrSum(kj)))) {

                            //判断是否中组三一等奖
                            if (LotteryUtils.checkIsZu3(kj)) {
                                firstPrizeNum = 1;
                            }
                            //判断是否中三星组六一等奖
                            else if (LotteryUtils.checkIsSanxingZu6(kj)) {
                                secondPrizeNum = 1;
                            }
                        }
                        lotteryOrder.setFirstPrizeNum(firstPrizeNum);
                        lotteryOrder.setSecondPrizeNum(secondPrizeNum);
                    }
                    continue;

                    // 三星混合组选
                case QIAN_SAN_HUN_HE_ZU_XUAN:
                case ZHONG_SAN_HUN_HE_ZU_XUAN:
                case HOU_SAN_HUN_HE_ZU_XUAN:
                    // 获取注单号码
                    if (size == 1) {
                        List<List<String>> betNumberList = getSanxingBetNumbers(betNumbers);

                        if (LotteryUtils.checkIsZu3(kj)) {
                            for (List<String> betNumber : betNumberList) {
                                StringBuilder orderNumber = new StringBuilder();
                                for (String bet : betNumber) {
                                    orderNumber.append(bet);
                                }
                                if (betNumber.size() != 3 || !LotteryUtils.checkIsZu3(orderNumber.toString())) {
                                    continue;
                                }
                                // 判断是否中组三一等奖(判断重复位和非重复位分别是否相等)
                                if (LotteryUtils.getDupStrByDupNum(betNumber.toString(), 2).containsAll(LotteryUtils.getDupStr(kj))
                                        && betNumber.containsAll(LotteryUtils.getUnDupStr(kj))) {
                                    firstPrizeNum++;
                                }
                            }
                        } else if (LotteryUtils.checkIsSanxingZu6(kj)) {
                            for (List<String> betNumber : betNumberList) {

                                // 判断是否中组三一等奖(判断重复位和非重复位分别是否相等)
                                if (betNumber.containsAll(LotteryUtils.getUnDupStr(kj))) {
                                    secondPrizeNum++;
                                }
                            }
                        }

                        lotteryOrder.setFirstPrizeNum(firstPrizeNum);
                        lotteryOrder.setSecondPrizeNum(secondPrizeNum);
                    }
                    continue;

                    // 二星
                    //二星直选复式
                case QIAN_ER_ZHI_XUAN_FU_SHI:
                case HOU_ER_ZHI_XUAN_FU_SHI:

                    if (size == 2) {
                        //判断中奖号码是否包含在所选的各组号码中
                        if (betNumbers.get(0).contains(kjArr[0])
                                && betNumbers.get(1).contains(kjArr[1])
                                ) {
                            firstPrizeNum = 1;
                        }
                        lotteryOrder.setFirstPrizeNum(firstPrizeNum);
                    }
                    continue;

                    // 二星直选单式
                case QIAN_ER_ZHI_XUAN_DAN_SHI:
                case HOU_ER_ZHI_XUAN_DAN_SHI:

                    if (size == 1) {
                        List<String> betNumberList = getBetNumbers(lotteryType, betNumbers);
                        for (String betNumber : betNumberList) {
                            if (betNumber != null && betNumber.equals(kj)) {
                                firstPrizeNum++;
                            }
                        }
                        lotteryOrder.setFirstPrizeNum(firstPrizeNum);
                    }

                    continue;

                    //二星组选复式
                case QIAN_ER_ZU_XUAN_FU_SHI:
                case HOU_ER_ZU_XUAN_FU_SHI:
                    if (size == 1 && LotteryUtils.checkIsErxingFuShi(kj)) {

                        //获取中奖号中的非重复字符
                        List<String> unDupStrList = LotteryUtils.getUnDupStr(kj);
                        if (betNumbers.get(0).containsAll(unDupStrList)) {
                            firstPrizeNum = 1;
                        }
                        lotteryOrder.setFirstPrizeNum(firstPrizeNum);
                    }

                    continue;

                    //二星组合单式
                case QIAN_ER_ZU_XUAN_DAN_SHI:
                case HOU_ER_ZU_XUAN_DAN_SHI:
                    if (size == 1 && LotteryUtils.checkIsErxingFuShi(kj)) {
                        String anotherKj = kjArr[1] + kjArr[0];
                        List<String> betNumberList = getBetNumbers(lotteryType, betNumbers);
                        for (String betNumber : betNumberList) {
                            if (betNumber != null && (betNumber.equals(kj) || betNumber.equals(anotherKj))) {
                                firstPrizeNum++;
                            }
                        }
                        lotteryOrder.setFirstPrizeNum(firstPrizeNum);
                    }
                    continue;

                    // 二星直选和值
                case QIAN_ER_ZHI_XUAN_HE_ZHI:
                case HOU_ER_ZHI_XUAN_HE_ZHI:
                    if (size == 1) {
                        //判断中奖号码是否包含在所选的各组号码中
                        if (betNumbers.get(0).contains(String.valueOf(LotteryUtils.getStrSum(kj)))) {
                            firstPrizeNum = 1;
                        }
                        lotteryOrder.setFirstPrizeNum(firstPrizeNum);
                    }
                    continue;

                    // 二星组选和值
                case QIAN_ER_ZU_XUAN_HE_ZHI:
                case HOU_ER_ZU_XUAN_HE_ZHI:
                    if (size == 1 && LotteryUtils.checkIsErxingFuShi(kj)) {
                        //判断中奖号码是否包含在所选的各组号码中
                        if (betNumbers.get(0).contains(String.valueOf(LotteryUtils.getStrSum(kj)))) {
                            firstPrizeNum = 1;
                        }
                        lotteryOrder.setFirstPrizeNum(firstPrizeNum);
                    }
                    continue;

                    //一星定位胆
                case YI_XING_DING_WEI_DAN:

                    for (int i = 0; i < betNumbers.size(); i++) {
                        if (betNumbers.get(i) != null && betNumbers.get(i).size() > 0 && betNumbers.get(i).contains(kjArr[i])) {
                            firstPrizeNum++;
                        }
                    }

                    lotteryOrder.setFirstPrizeNum(firstPrizeNum);
                    continue;

                    //一码不定胆
                case QIAN_SAN_YI_MA:
                case HOU_SAN_YI_MA:

                    if (size == 1) {
                        //TODO 是否需要优化
                        //获取中奖号中的重复字符
                        Set<String> dupStrList = LotteryUtils.getDupStr(kj);
                        //获取中奖号中的非重复字符
                        List<String> unDupStrList = LotteryUtils.getUnDupStr(kj);
                        for (String betNumber : betNumbers.get(0)) {
                            if (dupStrList.contains(betNumber) || unDupStrList.contains(betNumber)) {
                                firstPrizeNum++;
                            }
                        }
                        lotteryOrder.setFirstPrizeNum(firstPrizeNum);
                    }
                    continue;

                    // 二码不定胆
                case QIAN_SAN_ER_MA:
                case HOU_SAN_ER_MA:

                    //先判断是不是豹子号
                    if (size == 1 && LotteryUtils.getDupStrByDupNum(kj, 3).size() == 0) {

                        int betNum = 0; // 中奖号码数
                        for (String betNumber : betNumbers.get(0)) {
                            if (kj.contains(betNumber)) {
                                betNum++;
                            }
                        }
                        if (betNum >= 2) {
                            firstPrizeNum = (int) LotteryUtils.combination(betNum, 2);
                        }
                    }
                    lotteryOrder.setFirstPrizeNum(firstPrizeNum);
                    continue;

                    //前二码大小单双
                case QIAN_ER_DA_XIAO_DAN_SHUANG:
                    if (betNumbers.size() == 2) {

                        int firstBetNum = 0;
                        int secondBetNum = 0;
                        //获取中奖号的第一个号码的大小单双
                        List<String> firstBetList = LotteryUtils.getDaxiaodanshuangList(Integer.parseInt(kjArr[0]), 9);
                        //获取中奖号的第二个号码的大小单双
                        List<String> secondBetList = LotteryUtils.getDaxiaodanshuangList(Integer.parseInt(kjArr[1]), 9);

                        for (String kjNo : firstBetList) {
                            if (betNumbers.get(0).contains(kjNo)) {
                                firstBetNum++;
                            }
                        }
                        for (String kjNo : secondBetList) {
                            if (betNumbers.get(1).contains(kjNo)) {
                                secondBetNum++;
                            }
                        }
                        lotteryOrder.setFirstPrizeNum(firstBetNum * secondBetNum);
                    }
                    continue;

                    //后二码大小单双
                case HOU_ER_DA_XIAO_DAN_SHUANG:

                    if (betNumbers.size() == 2) {

                        int firstBetNum = 0;
                        int secondBetNum = 0;
                        //获取中奖号的第一个号码的大小单双
                        List<String> firstBetList = LotteryUtils.getDaxiaodanshuangList(Integer.parseInt(kjArr[3]), 9);
                        //获取中奖号的第二个号码的大小单双
                        List<String> secondBetList = LotteryUtils.getDaxiaodanshuangList(Integer.parseInt(kjArr[4]), 9);

                        for (String kjNo : firstBetList) {
                            if (betNumbers.get(0).contains(kjNo)) {
                                firstBetNum++;
                            }
                        }
                        for (String kjNo : secondBetList) {
                            if (betNumbers.get(1).contains(kjNo)) {
                                secondBetNum++;
                            }
                        }
                        lotteryOrder.setFirstPrizeNum(firstBetNum * secondBetNum);
                    }
                    continue;

                    //总和大小单双
                case ZONG_HE_DA_XIAO_DAN_SHUANG:

                    if (betNumbers.size() == 1) {

                        //获取中奖号的第一个号码的大小单双
                        List<String> firstBetList = LotteryUtils.getDaxiaodanshuangList(LotteryUtils.getStrSum(kj), 45);

                        for (String betNumber : betNumbers.get(0)) {
                            if (firstBetList.contains(betNumber)) {
                                firstPrizeNum++;
                            }
                        }

                        lotteryOrder.setFirstPrizeNum(firstPrizeNum);
                    }
                    continue;

                    //一帆风顺
                case YI_FAN_FENG_SHUN:

                    for (String betNumber : betNumbers.get(0)) {
                        if (kj.contains(betNumber)) {
                            firstPrizeNum++;
                        }
                    }
                    lotteryOrder.setFirstPrizeNum(firstPrizeNum);
                    continue;

                    //好事成双
                case HAO_SHI_CHENG_SHUANG:

                    kjStrList = LotteryUtils.getDupStrByMixDupNum(kj, 2);
                    if (kjStrList.size() == 0) {
                        continue;
                    }

                    for (String betNumber : betNumbers.get(0)) {
                        if (kjStrList.contains(betNumber)) {
                            firstPrizeNum++;
                        }
                    }
                    lotteryOrder.setFirstPrizeNum(firstPrizeNum);
                    continue;

                    //三星报喜
                case SAN_XING_BAO_XI:

                    kjStrList = LotteryUtils.getDupStrByMixDupNum(kj, 3);
                    if (kjStrList.size() == 0) {
                        continue;
                    }
                    for (String betNumber : betNumbers.get(0)) {
                        if (kjStrList.contains(betNumber)) {
                            firstPrizeNum++;
                        }
                    }
                    lotteryOrder.setFirstPrizeNum(firstPrizeNum);
                    continue;
                    //四季发财
                case SI_JI_FA_CAI:

                    kjStrList = LotteryUtils.getDupStrByMixDupNum(kj, 4);
                    if (kjStrList.size() == 0) {
                        continue;
                    }
                    for (String betNumber : betNumbers.get(0)) {
                        if (kjStrList.contains(betNumber)) {
                            firstPrizeNum++;
                        }
                    }
                    lotteryOrder.setFirstPrizeNum(firstPrizeNum);
                    continue;
            }
        }
        return lotteryOrderList;
    }

    /**
     * 获取双面时时彩的中奖玩法idlist
     *
     * @param str
     * @return
     */
    public static List<Long> getShishicaiDoubleBetPlayIds(String str) {

        List<Long> resultList = new ArrayList<>();
        for (ShishicaiDoubleType shishicaiDoubleType : ShishicaiDoubleType.values()) {

            String kj = getRealShiShiCaiKj(str.replace(",", "").replace("|", ""), shishicaiDoubleType);
            String[] kjArr = kj.split("");
            //获取总和的大小单双
            List<String> firstBetList = LotteryUtils.getDaxiaodanshuangList(LotteryUtils.getStrSum(kj), 45);

            //获取单球的大小单双
            List<String> singleBetList = LotteryUtils.getDaxiaodanshuangList(LotteryUtils.getStrSum(kj), 9);

            //获取中奖号的龙虎和信息
            List<String> longhuBetList = new ArrayList<>();
            if (kjArr.length == 5) {
                longhuBetList = LotteryUtils.getLongHuHeList(Integer.parseInt(kjArr[0]), Integer.parseInt(kjArr[4]));
            }

            //获取中奖号码的的特殊玩法值
            List<String> specialBetList = new ArrayList<>();
            if (kjArr.length == 3) {
                specialBetList = LotteryUtils.getDoubleTeShuWanFaList(kj);
            }

            switch (shishicaiDoubleType) {

                //总和大小单双
                case ZONG_HE_DA:
                    if (firstBetList.contains("大")) {
                        resultList.add(shishicaiDoubleType.value());
                    }
                    continue;

                case ZONG_HE_XIAO:
                    if (firstBetList.contains("小")) {
                        resultList.add(shishicaiDoubleType.value());
                    }
                    continue;

                case ZONG_HE_DAN:
                    if (firstBetList.contains("单")) {
                        resultList.add(shishicaiDoubleType.value());
                    }
                    continue;
                case ZONG_HE_SHUANG:
                    if (firstBetList.contains("双")) {
                        resultList.add(shishicaiDoubleType.value());
                    }
                    continue;

                    //总和龙虎和
                case ZONG_HE_LONG:
                    if (longhuBetList.contains("龙")) {
                        resultList.add(shishicaiDoubleType.value());
                    }
                    continue;
                case ZONG_HE_HU:
                    if (longhuBetList.contains("虎")) {
                        resultList.add(shishicaiDoubleType.value());
                    }
                    continue;
                case ZONG_HE_HE:
                    if (longhuBetList.contains("和")) {
                        resultList.add(shishicaiDoubleType.value());
                    }
                    continue;

                    //单球大小单双
                case YI_QIU_DA:
                case ER_QIU_DA:
                case SAN_QIU_DA:
                case SI_QIU_DA:
                case WU_QIU_DA:
                    if (singleBetList.contains("大")) {

                        resultList.add(shishicaiDoubleType.value());
                    }
                    continue;

                case YI_QIU_XIAO:
                case ER_QIU_XIAO:
                case SAN_QIU_XIAO:
                case SI_QIU_XIAO:
                case WU_QIU_XIAO:
                    if (singleBetList.contains("小")) {
                        resultList.add(shishicaiDoubleType.value());
                    }
                    continue;

                case YI_QIU_DAN:
                case ER_QIU_DAN:
                case SAN_QIU_DAN:
                case SI_QIU_DAN:
                case WU_QIU_DAN:
                    if (singleBetList.contains("单")) {
                        resultList.add(shishicaiDoubleType.value());
                    }
                    continue;

                case YI_QIU_SHUANG:
                case ER_QIU_SHUANG:
                case SAN_QIU_SHUANG:
                case SI_QIU_SHUANG:
                case WU_QIU_SHUANG:
                    if (singleBetList.contains("双")) {
                        resultList.add(shishicaiDoubleType.value());
                    }
                    continue;

                   /* // 单球定位模式
                case YI_QIU_DING_WEI_DAN_0:
                case ER_QIU_DING_WEI_DAN_0:
                case SAN_QIU_DING_WEI_DAN_0:
                case SI_QIU_DING_WEI_DAN_0:
                case WU_QIU_DING_WEI_DAN_0:
                    if (kj.contains("0")) {
                        resultList.add(shishicaiDoubleType.value());
                    }
                    continue;

                case YI_QIU_DING_WEI_DAN_1:
                case ER_QIU_DING_WEI_DAN_1:
                case SAN_QIU_DING_WEI_DAN_1:
                case SI_QIU_DING_WEI_DAN_1:
                case WU_QIU_DING_WEI_DAN_1:
                    if (kj.contains("1")) {
                        resultList.add(shishicaiDoubleType.value());
                    }
                    continue;

                case YI_QIU_DING_WEI_DAN_2:
                case ER_QIU_DING_WEI_DAN_2:
                case SAN_QIU_DING_WEI_DAN_2:
                case SI_QIU_DING_WEI_DAN_2:
                case WU_QIU_DING_WEI_DAN_2:
                    if (kj.contains("2")) {
                        resultList.add(shishicaiDoubleType.value());
                    }
                    continue;

                case YI_QIU_DING_WEI_DAN_3:
                case ER_QIU_DING_WEI_DAN_3:
                case SAN_QIU_DING_WEI_DAN_3:
                case SI_QIU_DING_WEI_DAN_3:
                case WU_QIU_DING_WEI_DAN_3:
                    if (kj.contains("3")) {
                        resultList.add(shishicaiDoubleType.value());
                    }
                    continue;

                case YI_QIU_DING_WEI_DAN_4:
                case ER_QIU_DING_WEI_DAN_4:
                case SAN_QIU_DING_WEI_DAN_4:
                case SI_QIU_DING_WEI_DAN_4:
                case WU_QIU_DING_WEI_DAN_4:
                    if (kj.contains("4")) {
                        resultList.add(shishicaiDoubleType.value());
                    }
                    continue;

                case YI_QIU_DING_WEI_DAN_5:
                case ER_QIU_DING_WEI_DAN_5:
                case SAN_QIU_DING_WEI_DAN_5:
                case SI_QIU_DING_WEI_DAN_5:
                case WU_QIU_DING_WEI_DAN_5:
                    if (kj.contains("5")) {
                        resultList.add(shishicaiDoubleType.value());
                    }
                    continue;

                case YI_QIU_DING_WEI_DAN_6:
                case ER_QIU_DING_WEI_DAN_6:
                case SAN_QIU_DING_WEI_DAN_6:
                case SI_QIU_DING_WEI_DAN_6:
                case WU_QIU_DING_WEI_DAN_6:
                    if (kj.contains("6")) {
                        resultList.add(shishicaiDoubleType.value());
                    }
                    continue;

                case YI_QIU_DING_WEI_DAN_7:
                case ER_QIU_DING_WEI_DAN_7:
                case SAN_QIU_DING_WEI_DAN_7:
                case SI_QIU_DING_WEI_DAN_7:
                case WU_QIU_DING_WEI_DAN_7:
                    if (kj.contains("7")) {
                        resultList.add(shishicaiDoubleType.value());
                    }
                    continue;

                case YI_QIU_DING_WEI_DAN_8:
                case ER_QIU_DING_WEI_DAN_8:
                case SAN_QIU_DING_WEI_DAN_8:
                case SI_QIU_DING_WEI_DAN_8:
                case WU_QIU_DING_WEI_DAN_8:
                    if (kj.contains("8")) {
                        resultList.add(shishicaiDoubleType.value());
                    }
                    continue;

                case YI_QIU_DING_WEI_DAN_9:
                case ER_QIU_DING_WEI_DAN_9:
                case SAN_QIU_DING_WEI_DAN_9:
                case SI_QIU_DING_WEI_DAN_9:
                case WU_QIU_DING_WEI_DAN_9:
                    if (kj.contains("9")) {
                        resultList.add(shishicaiDoubleType.value());
                    }
                    continue;*/
                    // 特殊玩法模式
                case QIAN_SAN_BAO_ZI:
                case ZHONG_SAN_BAO_ZI:
                case HOU_SAN_BAO_ZI:
                    if (specialBetList.contains("豹子")) {
                        resultList.add(shishicaiDoubleType.value());
                    }
                    continue;

                case QIAN_SAN_SHUN_ZI:
                case ZHONG_SAN_SHUN_ZI:
                case HOU_SAN_SHUN_ZI:
                    if (specialBetList.contains("顺子")) {
                        resultList.add(shishicaiDoubleType.value());
                    }
                    continue;
                case QIAN_SAN_DUI_ZI:
                case ZHONG_SAN_DUI_ZI:
                case HOU_SAN_DUI_ZI:
                    if (specialBetList.contains("对子")) {
                        resultList.add(shishicaiDoubleType.value());
                    }
                    continue;
                case QIAN_SAN_BAN_SHUN:
                case ZHONG_SAN_BAN_SHUN:
                case HOU_SAN_BAN_SHUN:
                    if (specialBetList.contains("半顺")) {
                        resultList.add(shishicaiDoubleType.value());
                    }
                    continue;
                case QIAN_SAN_ZA_LIU:
                case ZHONG_SAN_ZA_LIU:
                case HOU_SAN_ZA_LIU:
                    if (specialBetList.contains("杂六")) {
                        resultList.add(shishicaiDoubleType.value());
                    }
                    continue;
            }
        }
        return resultList;
    }

    /**
     * 时时彩双面盘开奖算法
     *
     * @param lotteryType
     * @param kj
     * @param lotteryOrderList
     * @return
     */
    public static List<UserOrderPO> getBoundsInfoOfShishicaiDouble(LotteryType lotteryType, String kj, List<UserOrderPO> lotteryOrderList) {

        kj = getRealShiShiCaiKj(kj.replace(",", "").replace("|", ""), lotteryType);
        String[] kjArr = kj.split("");
        for (UserOrderPO lotteryOrder : lotteryOrderList) {

            List<List<String>> betNumbers = lotteryOrder.getBetContentProc();

            int size = betNumbers.size();
            int firstPrizeNum = 0; // 一等奖次数

            ShishicaiDoubleType shishicaiType = (ShishicaiDoubleType) lotteryType;
            switch (shishicaiType) {

                //总和大小单双
                case ZONG_HE_DA:
                    if (betNumbers.size() == 1) {
                        //获取总和的大小单双
                        List<String> firstBetList = LotteryUtils.getDaxiaodanshuangList(LotteryUtils.getStrSum(kj), 45);

                        if (firstBetList.contains("大")) {
                            firstPrizeNum++;
                        }
                        lotteryOrder.setFirstPrizeNum(firstPrizeNum);
                    }
                    continue;
                case ZONG_HE_XIAO:
                    if (betNumbers.size() == 1) {
                        //获取总和的大小单双
                        List<String> firstBetList = LotteryUtils.getDaxiaodanshuangList(LotteryUtils.getStrSum(kj), 45);

                        if (firstBetList.contains("小")) {
                            firstPrizeNum++;
                        }
                        lotteryOrder.setFirstPrizeNum(firstPrizeNum);
                    }
                    continue;
                case ZONG_HE_DAN:
                    if (betNumbers.size() == 1) {
                        //获取总和的大小单双
                        List<String> firstBetList = LotteryUtils.getDaxiaodanshuangList(LotteryUtils.getStrSum(kj), 45);

                        if (firstBetList.contains("单")) {
                            firstPrizeNum++;
                        }
                        lotteryOrder.setFirstPrizeNum(firstPrizeNum);
                    }
                    continue;
                case ZONG_HE_SHUANG:

                    if (betNumbers.size() == 1) {
                        //获取总和的大小单双
                        List<String> firstBetList = LotteryUtils.getDaxiaodanshuangList(LotteryUtils.getStrSum(kj), 45);

                        if (firstBetList.contains("双")) {
                            firstPrizeNum++;
                        }
                        lotteryOrder.setFirstPrizeNum(firstPrizeNum);
                    }
                    continue;

                    //总和龙虎和
                case ZONG_HE_LONG:
                case ZONG_HE_HU:
                case ZONG_HE_HE:

                    if (betNumbers.size() == 1 && kjArr.length == 5) {

                        //获取中奖号的龙虎和信息
                        List<String> firstBetList = LotteryUtils.getLongHuHeList(Integer.parseInt(kjArr[0]), Integer.parseInt(kjArr[4]));

                        for (String betNumber : betNumbers.get(0)) {
                            if (firstBetList.contains(betNumber)) {
                                firstPrizeNum++;
                            }
                        }

                        lotteryOrder.setFirstPrizeNum(firstPrizeNum);
                    }
                    continue;

                    //单球大小单双
                case YI_QIU_DA:
                case YI_QIU_XIAO:
                case YI_QIU_DAN:
                case YI_QIU_SHUANG:

                case ER_QIU_DA:
                case ER_QIU_XIAO:
                case ER_QIU_DAN:
                case ER_QIU_SHUANG:

                case SAN_QIU_DA:
                case SAN_QIU_XIAO:
                case SAN_QIU_DAN:
                case SAN_QIU_SHUANG:

                case SI_QIU_DA:
                case SI_QIU_XIAO:
                case SI_QIU_DAN:
                case SI_QIU_SHUANG:

                case WU_QIU_DA:
                case WU_QIU_XIAO:
                case WU_QIU_DAN:
                case WU_QIU_SHUANG:

                    if (betNumbers.size() == 1) {

                        //获取中奖号的大小单双
                        List<String> firstBetList = LotteryUtils.getDaxiaodanshuangList(LotteryUtils.getStrSum(kj), 9);

                        for (String betNumber : betNumbers.get(0)) {
                            if (firstBetList.contains(betNumber)) {
                                firstPrizeNum++;
                            }
                        }

                        lotteryOrder.setFirstPrizeNum(firstPrizeNum);
                    }
                    continue;

                    // 单球定位模式
                case YI_QIU_DING_WEI_DAN_0:
                case YI_QIU_DING_WEI_DAN_1:
                case YI_QIU_DING_WEI_DAN_2:
                case YI_QIU_DING_WEI_DAN_3:
                case YI_QIU_DING_WEI_DAN_4:
                case YI_QIU_DING_WEI_DAN_5:
                case YI_QIU_DING_WEI_DAN_6:
                case YI_QIU_DING_WEI_DAN_7:
                case YI_QIU_DING_WEI_DAN_8:
                case YI_QIU_DING_WEI_DAN_9:

                case ER_QIU_DING_WEI_DAN_0:
                case ER_QIU_DING_WEI_DAN_1:
                case ER_QIU_DING_WEI_DAN_2:
                case ER_QIU_DING_WEI_DAN_3:
                case ER_QIU_DING_WEI_DAN_4:
                case ER_QIU_DING_WEI_DAN_5:
                case ER_QIU_DING_WEI_DAN_6:
                case ER_QIU_DING_WEI_DAN_7:
                case ER_QIU_DING_WEI_DAN_8:
                case ER_QIU_DING_WEI_DAN_9:

                case SAN_QIU_DING_WEI_DAN_0:
                case SAN_QIU_DING_WEI_DAN_1:
                case SAN_QIU_DING_WEI_DAN_2:
                case SAN_QIU_DING_WEI_DAN_3:
                case SAN_QIU_DING_WEI_DAN_4:
                case SAN_QIU_DING_WEI_DAN_5:
                case SAN_QIU_DING_WEI_DAN_6:
                case SAN_QIU_DING_WEI_DAN_7:
                case SAN_QIU_DING_WEI_DAN_8:
                case SAN_QIU_DING_WEI_DAN_9:

                case SI_QIU_DING_WEI_DAN_0:
                case SI_QIU_DING_WEI_DAN_1:
                case SI_QIU_DING_WEI_DAN_2:
                case SI_QIU_DING_WEI_DAN_3:
                case SI_QIU_DING_WEI_DAN_4:
                case SI_QIU_DING_WEI_DAN_5:
                case SI_QIU_DING_WEI_DAN_6:
                case SI_QIU_DING_WEI_DAN_7:
                case SI_QIU_DING_WEI_DAN_8:
                case SI_QIU_DING_WEI_DAN_9:

                case WU_QIU_DING_WEI_DAN_0:
                case WU_QIU_DING_WEI_DAN_1:
                case WU_QIU_DING_WEI_DAN_2:
                case WU_QIU_DING_WEI_DAN_3:
                case WU_QIU_DING_WEI_DAN_4:
                case WU_QIU_DING_WEI_DAN_5:
                case WU_QIU_DING_WEI_DAN_6:
                case WU_QIU_DING_WEI_DAN_7:
                case WU_QIU_DING_WEI_DAN_8:
                case WU_QIU_DING_WEI_DAN_9:

                    if (size == 1) {
                        //判断中间号码是否包含在所选的各组号码中
                        for (String betNumber : betNumbers.get(0)) {
                            if (kj.contains(betNumber) || kj.equals(betNumber)) {
                                firstPrizeNum++;
                            }
                        }
                        lotteryOrder.setFirstPrizeNum(firstPrizeNum);
                    }
                    continue;

                    // 特殊玩法模式
                case QIAN_SAN_BAO_ZI:
                case QIAN_SAN_SHUN_ZI:
                case QIAN_SAN_DUI_ZI:
                case QIAN_SAN_BAN_SHUN:
                case QIAN_SAN_ZA_LIU:

                case ZHONG_SAN_BAO_ZI:
                case ZHONG_SAN_SHUN_ZI:
                case ZHONG_SAN_DUI_ZI:
                case ZHONG_SAN_BAN_SHUN:
                case ZHONG_SAN_ZA_LIU:

                case HOU_SAN_BAO_ZI:
                case HOU_SAN_SHUN_ZI:
                case HOU_SAN_DUI_ZI:
                case HOU_SAN_BAN_SHUN:
                case HOU_SAN_ZA_LIU:

                    if (size == 1) {
                        //获取中奖号码的的特殊玩法值
                        List<String> firstBetList = LotteryUtils.getDoubleTeShuWanFaList(kj);
                        for (String betNumber : betNumbers.get(0)) {
                            if (firstBetList.contains(betNumber)) {
                                firstPrizeNum++;
                            }
                        }
                        lotteryOrder.setFirstPrizeNum(firstPrizeNum);
                    }
                    continue;
            }
        }
        return lotteryOrderList;
    }

    /**
     * 截取时时彩开奖号码
     *
     * @param kj
     * @param lotteryType
     * @return
     */

    private static String getRealShiShiCaiKj(String kj, LotteryType lotteryType) {

        String realLotteryKj = kj;
        if (lotteryType instanceof ShishicaiType) {
            ShishicaiType shishicaiType = (ShishicaiType) lotteryType;

            switch (shishicaiType) {

                // 截取四星中奖号
                case SI_XING_ZHI_XUAN_ZU_HE:
                case SI_XING_ZHI_XUAN_DAN_SHI:
                case SI_XING_ZHI_XUAN_FU_SHI:
                case ZU_XUAN_24:
                case ZU_XUAN_12:
                case ZU_XUAN_6:
                case ZU_XUAN_4:
                    realLotteryKj = kj.substring(1, 5);
                    break;

                // 截取三星号码
                case QIAN_SAN_DAN_SHI:
                case QIAN_SAN_FU_SHI:
                case QIAN_SAN_HUN_HE_ZU_XUAN:
                case QIAN_SAN_ZHI_XUAN_HE_ZHI:
                case QIAN_SAN_ZU_LIU:
                case QIAN_SAN_ZU_SAN:
                case QIAN_SAN_ZU_XUAN_HE_ZHI:
                    realLotteryKj = kj.substring(0, 3);
                    break;
                case ZHONG_SAN_DAN_SHI:
                case ZHONG_SAN_FU_SHI:
                case ZHONG_SAN_HUN_HE_ZU_XUAN:
                case ZHONG_SAN_ZHI_XUAN_HE_ZHI:
                case ZHONG_SAN_ZU_LIU:
                case ZHONG_SAN_ZU_SAN:
                case ZHONG_SAN_ZU_XUAN_HE_ZHI:
                    realLotteryKj = kj.substring(1, 4);
                    break;
                case HOU_SAN_DAN_SHI:
                case HOU_SAN_FU_SHI:
                case HOU_SAN_HUN_HE_ZU_XUAN:
                case HOU_SAN_ZHI_XUAN_HE_ZHI:
                case HOU_SAN_ZU_LIU:
                case HOU_SAN_ZU_SAN:
                case HOU_SAN_ZU_XUAN_HE_ZHI:
                    realLotteryKj = kj.substring(2, 5);
                    break;

                // 二星号码
                case QIAN_ER_ZHI_XUAN_DAN_SHI:
                case QIAN_ER_ZHI_XUAN_FU_SHI:
                case QIAN_ER_ZHI_XUAN_HE_ZHI:
                case QIAN_ER_ZU_XUAN_DAN_SHI:
                case QIAN_ER_ZU_XUAN_FU_SHI:
                case QIAN_ER_ZU_XUAN_HE_ZHI:
                    realLotteryKj = kj.substring(0, 2);
                    break;
                case HOU_ER_ZHI_XUAN_DAN_SHI:
                case HOU_ER_ZHI_XUAN_FU_SHI:
                case HOU_ER_ZHI_XUAN_HE_ZHI:
                case HOU_ER_ZU_XUAN_DAN_SHI:
                case HOU_ER_ZU_XUAN_FU_SHI:
                case HOU_ER_ZU_XUAN_HE_ZHI:
                    realLotteryKj = kj.substring(3, 5);
                    break;

                case QIAN_SAN_YI_MA:
                case QIAN_SAN_ER_MA:

                    realLotteryKj = kj.substring(0, 3);
                    break;
                case HOU_SAN_YI_MA:
                case HOU_SAN_ER_MA:
                    realLotteryKj = kj.substring(2, 5);
                    break;
            }
        } else if (lotteryType instanceof ShishicaiDoubleType) {

            ShishicaiDoubleType shishicaiDoubleType = (ShishicaiDoubleType) lotteryType;

            switch (shishicaiDoubleType) {

                // 截取总和
                case ZONG_HE_DA:
                case ZONG_HE_XIAO:
                case ZONG_HE_DAN:
                case ZONG_HE_SHUANG:
                case ZONG_HE_LONG:
                case ZONG_HE_HU:
                case ZONG_HE_HE:
                    realLotteryKj = kj.substring(0, 5);
                    break;

                // 截取三星号码
                case QIAN_SAN_BAO_ZI:
                case QIAN_SAN_SHUN_ZI:
                case QIAN_SAN_DUI_ZI:
                case QIAN_SAN_BAN_SHUN:
                case QIAN_SAN_ZA_LIU:
                    realLotteryKj = kj.substring(0, 3);
                    break;
                case ZHONG_SAN_BAO_ZI:
                case ZHONG_SAN_SHUN_ZI:
                case ZHONG_SAN_DUI_ZI:
                case ZHONG_SAN_BAN_SHUN:
                case ZHONG_SAN_ZA_LIU:
                    realLotteryKj = kj.substring(1, 4);
                    break;
                case HOU_SAN_BAO_ZI:
                case HOU_SAN_SHUN_ZI:
                case HOU_SAN_DUI_ZI:
                case HOU_SAN_BAN_SHUN:
                case HOU_SAN_ZA_LIU:
                    realLotteryKj = kj.substring(2, 5);
                    break;

                // 一球号码
                case YI_QIU_DA:
                case YI_QIU_XIAO:
                case YI_QIU_DAN:
                case YI_QIU_SHUANG:
                case YI_QIU_DING_WEI_DAN_0:
                case YI_QIU_DING_WEI_DAN_1:
                case YI_QIU_DING_WEI_DAN_2:
                case YI_QIU_DING_WEI_DAN_3:
                case YI_QIU_DING_WEI_DAN_4:
                case YI_QIU_DING_WEI_DAN_5:
                case YI_QIU_DING_WEI_DAN_6:
                case YI_QIU_DING_WEI_DAN_7:
                case YI_QIU_DING_WEI_DAN_8:
                case YI_QIU_DING_WEI_DAN_9:
                    realLotteryKj = kj.substring(0, 1);
                    break;

                // 二球号码
                case ER_QIU_DA:
                case ER_QIU_XIAO:
                case ER_QIU_DAN:
                case ER_QIU_SHUANG:
                case ER_QIU_DING_WEI_DAN_0:
                case ER_QIU_DING_WEI_DAN_1:
                case ER_QIU_DING_WEI_DAN_2:
                case ER_QIU_DING_WEI_DAN_3:
                case ER_QIU_DING_WEI_DAN_4:
                case ER_QIU_DING_WEI_DAN_5:
                case ER_QIU_DING_WEI_DAN_6:
                case ER_QIU_DING_WEI_DAN_7:
                case ER_QIU_DING_WEI_DAN_8:
                case ER_QIU_DING_WEI_DAN_9:
                    realLotteryKj = kj.substring(1, 2);
                    break;

                // 三球号码
                case SAN_QIU_DA:
                case SAN_QIU_XIAO:
                case SAN_QIU_DAN:
                case SAN_QIU_SHUANG:
                case SAN_QIU_DING_WEI_DAN_0:
                case SAN_QIU_DING_WEI_DAN_1:
                case SAN_QIU_DING_WEI_DAN_2:
                case SAN_QIU_DING_WEI_DAN_3:
                case SAN_QIU_DING_WEI_DAN_4:
                case SAN_QIU_DING_WEI_DAN_5:
                case SAN_QIU_DING_WEI_DAN_6:
                case SAN_QIU_DING_WEI_DAN_7:
                case SAN_QIU_DING_WEI_DAN_8:
                case SAN_QIU_DING_WEI_DAN_9:
                    realLotteryKj = kj.substring(2, 3);
                    break;

                // 四球号码
                case SI_QIU_DA:
                case SI_QIU_XIAO:
                case SI_QIU_DAN:
                case SI_QIU_SHUANG:
                case SI_QIU_DING_WEI_DAN_0:
                case SI_QIU_DING_WEI_DAN_1:
                case SI_QIU_DING_WEI_DAN_2:
                case SI_QIU_DING_WEI_DAN_3:
                case SI_QIU_DING_WEI_DAN_4:
                case SI_QIU_DING_WEI_DAN_5:
                case SI_QIU_DING_WEI_DAN_6:
                case SI_QIU_DING_WEI_DAN_7:
                case SI_QIU_DING_WEI_DAN_8:
                case SI_QIU_DING_WEI_DAN_9:
                    realLotteryKj = kj.substring(3, 4);
                    break;

                // 五球号码
                case WU_QIU_DA:
                case WU_QIU_XIAO:
                case WU_QIU_DAN:
                case WU_QIU_SHUANG:
                case WU_QIU_DING_WEI_DAN_0:
                case WU_QIU_DING_WEI_DAN_1:
                case WU_QIU_DING_WEI_DAN_2:
                case WU_QIU_DING_WEI_DAN_3:
                case WU_QIU_DING_WEI_DAN_4:
                case WU_QIU_DING_WEI_DAN_5:
                case WU_QIU_DING_WEI_DAN_6:
                case WU_QIU_DING_WEI_DAN_7:
                case WU_QIU_DING_WEI_DAN_8:
                case WU_QIU_DING_WEI_DAN_9:
                    realLotteryKj = kj.substring(4, 5);
                    break;
            }
        }
        return realLotteryKj;
    }

    /**
     * 获取注单号码列表  --支持类型 (五星直选单式,四星直选单式,三星直选单式)
     *
     * @param lotteryType
     * @param betNumbers
     * @return
     */
    private static List<String> getBetNumbers(LotteryType lotteryType, List<List<String>> betNumbers) {

        if (lotteryType instanceof ShishicaiType) {

            // 如果类型属于五星
            ShishicaiType shishicaiType = (ShishicaiType) lotteryType;
            switch (shishicaiType) {

                // 五星直选单式
                case WU_XING_ZHI_XUAN_DAN_SHI:
                    return LotteryUtils.getSubStrList(betNumbers.get(0), 5);

                // 四星直选单式
                case SI_XING_ZHI_XUAN_DAN_SHI:
                    return LotteryUtils.getSubStrList(betNumbers.get(0), 4);

                // 三星直选单式
                case QIAN_SAN_DAN_SHI:
                case ZHONG_SAN_DAN_SHI:
                case HOU_SAN_DAN_SHI:

                    // 三星混合组选
                case QIAN_SAN_HUN_HE_ZU_XUAN:
                case ZHONG_SAN_HUN_HE_ZU_XUAN:
                case HOU_SAN_HUN_HE_ZU_XUAN:
                    return LotteryUtils.getSubStrList(betNumbers.get(0), 3);

                // 二星直选单式
                case QIAN_ER_ZHI_XUAN_DAN_SHI:
                case HOU_ER_ZHI_XUAN_DAN_SHI:
                    // 二星混合组选
                case QIAN_ER_ZU_XUAN_DAN_SHI:
                case HOU_ER_ZU_XUAN_DAN_SHI:
                    return LotteryUtils.getSubStrList(betNumbers.get(0), 2);
            }
        }
        return new ArrayList<String>();
    }

    /**
     * 获取注单号码列表  --支持类型 (三星混合组选)
     *
     * @param betNumbers
     * @return
     */
    private static List<List<String>> getSanxingBetNumbers(List<List<String>> betNumbers) {

        return LotteryUtils.getStrListForSanxing(betNumbers.get(0), 3);
    }
}
