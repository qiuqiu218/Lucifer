package com.bc.lottery.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * 六合彩双面盘
 * Created by clion on 2017/9/13.
 */
public enum LotteryMark6DoubleType implements LotteryType {

    // 特码A
    TE_MA_A_1(1012101L, "特码A1"),
    TE_MA_A_2(1012102L, "特码A2"),
    TE_MA_A_3(1012103L, "特码A3"),
    TE_MA_A_4(1012104L, "特码A4"),
    TE_MA_A_5(1012105L, "特码A5"),
    TE_MA_A_6(1012106L, "特码A6"),
    TE_MA_A_7(1012107L, "特码A7"),
    TE_MA_A_8(1012108L, "特码A8"),
    TE_MA_A_9(1012109L, "特码A9"),
    TE_MA_A_10(1012110L, "特码A10"),

    TE_MA_A_11(1012111L, "特码A11"),
    TE_MA_A_12(1012112L, "特码A12"),
    TE_MA_A_13(1012113L, "特码A13"),
    TE_MA_A_14(1012114L, "特码A14"),
    TE_MA_A_15(1012115L, "特码A15"),
    TE_MA_A_16(1012116L, "特码A16"),
    TE_MA_A_17(1012117L, "特码A17"),
    TE_MA_A_18(1012118L, "特码A18"),
    TE_MA_A_19(1012119L, "特码A19"),
    TE_MA_A_20(1012120L, "特码A20"),

    TE_MA_A_21(1012121L, "特码A21"),
    TE_MA_A_22(1012122L, "特码A22"),
    TE_MA_A_23(1012123L, "特码A23"),
    TE_MA_A_24(1012124L, "特码A24"),
    TE_MA_A_25(1012125L, "特码A25"),
    TE_MA_A_26(1012126L, "特码A26"),
    TE_MA_A_27(1012127L, "特码A27"),
    TE_MA_A_28(1012128L, "特码A28"),
    TE_MA_A_29(1012129L, "特码A29"),
    TE_MA_A_30(1012130L, "特码A30"),

    TE_MA_A_31(1012131L, "特码A31"),
    TE_MA_A_32(1012132L, "特码A32"),
    TE_MA_A_33(1012133L, "特码A33"),
    TE_MA_A_34(1012134L, "特码A34"),
    TE_MA_A_35(1012135L, "特码A35"),
    TE_MA_A_36(1012136L, "特码A36"),
    TE_MA_A_37(1012137L, "特码A37"),
    TE_MA_A_38(1012138L, "特码A38"),
    TE_MA_A_39(1012139L, "特码A39"),
    TE_MA_A_40(1012140L, "特码A40"),

    TE_MA_A_41(1012141L, "特码A41"),
    TE_MA_A_42(1012142L, "特码A42"),
    TE_MA_A_43(1012143L, "特码A43"),
    TE_MA_A_44(1012144L, "特码A44"),
    TE_MA_A_45(1012145L, "特码A45"),
    TE_MA_A_46(1012146L, "特码A46"),
    TE_MA_A_47(1012147L, "特码A47"),
    TE_MA_A_48(1012148L, "特码A48"),
    TE_MA_A_49(1012149L, "特码A49"),

    // 特码A
    TE_MA_A_DA(1012201L, "特码A-大"),
    TE_MA_A_XIAO(1012202L, "特码A-小"),
    TE_MA_A_DAN(1012203L, "特码A-单"),
    TE_MA_A_SHUANG(1012204L, "特码A-双"),
    TE_MA_A_HONG(1012205L, "特码A-红波"),
    TE_MA_A_LAN(1012206L, "特码A-蓝波"),
    TE_MA_A_LV(1012207L, "特码A-绿波"),
    TE_MA_B_1(1011101L, "特码B1"),
    TE_MA_B_2(1011102L, "特码B2"),
    TE_MA_B_3(1011103L, "特码B3"),
    TE_MA_B_4(1011104L, "特码B4"),
    TE_MA_B_5(1011105L, "特码B5"),
    TE_MA_B_6(1011106L, "特码B6"),
    TE_MA_B_7(1011107L, "特码B7"),
    TE_MA_B_8(1011108L, "特码B8"),
    TE_MA_B_9(1011109L, "特码B9"),
    TE_MA_B_10(1011110L, "特码B10"),

    TE_MA_B_11(1011111L, "特码B11"),
    TE_MA_B_12(1011112L, "特码B12"),
    TE_MA_B_13(1011113L, "特码B13"),
    TE_MA_B_14(1011114L, "特码B14"),
    TE_MA_B_15(1011115L, "特码B15"),
    TE_MA_B_16(1011116L, "特码B16"),
    TE_MA_B_17(1011117L, "特码B17"),
    TE_MA_B_18(1011118L, "特码B18"),
    TE_MA_B_19(1011119L, "特码B19"),
    TE_MA_B_20(1011120L, "特码B20"),

    TE_MA_B_21(1011121L, "特码B21"),
    TE_MA_B_22(1011122L, "特码B22"),
    TE_MA_B_23(1011123L, "特码B23"),
    TE_MA_B_24(1011124L, "特码B24"),
    TE_MA_B_25(1011125L, "特码B25"),
    TE_MA_B_26(1011126L, "特码B26"),
    TE_MA_B_27(1011127L, "特码B27"),
    TE_MA_B_28(1011128L, "特码B28"),
    TE_MA_B_29(1011129L, "特码B29"),
    TE_MA_B_30(1011130L, "特码B30"),

    TE_MA_B_31(1011131L, "特码B31"),
    TE_MA_B_32(1011132L, "特码B32"),
    TE_MA_B_33(1011133L, "特码B33"),
    TE_MA_B_34(1011134L, "特码B34"),
    TE_MA_B_35(1011135L, "特码B35"),
    TE_MA_B_36(1011136L, "特码B36"),
    TE_MA_B_37(1011137L, "特码B37"),
    TE_MA_B_38(1011138L, "特码B38"),
    TE_MA_B_39(1011139L, "特码B39"),
    TE_MA_B_40(1011140L, "特码B40"),

    TE_MA_B_41(1011141L, "特码B41"),
    TE_MA_B_42(1011142L, "特码B42"),
    TE_MA_B_43(1011143L, "特码B43"),
    TE_MA_B_44(1011144L, "特码B44"),
    TE_MA_B_45(1011145L, "特码B45"),
    TE_MA_B_46(1011146L, "特码B46"),
    TE_MA_B_47(1011147L, "特码B47"),
    TE_MA_B_48(1011148L, "特码B48"),
    TE_MA_B_49(1011149L, "特码B49"),

    // 特码B
    TE_MA_B_DA(1011201L, "特码B-大"),
    TE_MA_B_XIAO(1011202L, "特码B-小"),
    TE_MA_B_DAN(1011203L, "特码B-单"),
    TE_MA_B_SHUANG(1011204L, "特码B-双"),
    TE_MA_B_HONG(1011205L, "特码B-红波"),
    TE_MA_B_LAN(1011206L, "特码B-蓝波"),
    TE_MA_B_LV(1011207L, "特码B-绿波"),

    // 两面
    TE_MA_DA(1021101L, "特大"),
    TE_MA_XIAO(1021102L, "特小"),
    TE_MA_DAN(1021103L, "特单"),
    TE_MA_SHUANG(1021104L, "特双"),
    TE_MA_HE_DA(1021105L, "特合大"),
    TE_MA_HE_XIAO(1021106L, "特合小"),
    TE_MA_HE_DAN(1021107L, "特合单"),
    TE_MA_HE_SHUANG(1021108L, "特合双"),

    TE_TIAN_XIAO(1021109L, "特天肖"),
    TE_DI_XIAO(1021110L, "特地肖"),
    TE_QIAN_XIAO(1021111L, "特前肖"),
    TE_HOU_XIAO(1021112L, "特后肖"),
    TE_JIA_XIAO(1021113L, "特家肖"),
    TE_YE_XIAO(1021114L, "特野肖"),

    TE_MA_WEI_DA(1021115L, "特尾大"),
    TE_MA_WEI_XIAO(1021116L, "特尾小"),
    TE_MA_DA_DAN(1021117L, "特大单"),
    TE_MA_DA_SHUANG(1021118L, "特大双"),
    TE_MA_XIAO_DAN(1021119L, "特小单"),
    TE_MA_XIAO_SHUANG(1021120L, "特小双"),

    ZONG_HE_DA(1021201L, "总和大"),
    ZONG_HE_XIAO(1021202L, "总和小"),
    ZONG_HE_DAN(1021203L, "总和单"),
    ZONG_HE_SHUANG(1021204L, "总和双"),

    // 正码
    ZHENG_MA_1(1031101L, "正码1"),
    ZHENG_MA_2(1031102L, "正码2"),
    ZHENG_MA_3(1031103L, "正码3"),
    ZHENG_MA_4(1031104L, "正码4"),
    ZHENG_MA_5(1031105L, "正码5"),
    ZHENG_MA_6(1031106L, "正码6"),
    ZHENG_MA_7(1031107L, "正码7"),
    ZHENG_MA_8(1031108L, "正码8"),
    ZHENG_MA_9(1031109L, "正码9"),
    ZHENG_MA_10(1031110L, "正码10"),

    ZHENG_MA_11(1031111L, "正码11"),
    ZHENG_MA_12(1031112L, "正码12"),
    ZHENG_MA_13(1031113L, "正码13"),
    ZHENG_MA_14(1031114L, "正码14"),
    ZHENG_MA_15(1031115L, "正码15"),
    ZHENG_MA_16(1031116L, "正码16"),
    ZHENG_MA_17(1031117L, "正码17"),
    ZHENG_MA_18(1031118L, "正码18"),
    ZHENG_MA_19(1031119L, "正码19"),
    ZHENG_MA_20(1031120L, "正码20"),

    ZHENG_MA_21(1031121L, "正码21"),
    ZHENG_MA_22(1031122L, "正码22"),
    ZHENG_MA_23(1031123L, "正码23"),
    ZHENG_MA_24(1031124L, "正码24"),
    ZHENG_MA_25(1031125L, "正码25"),
    ZHENG_MA_26(1031126L, "正码26"),
    ZHENG_MA_27(1031127L, "正码27"),
    ZHENG_MA_28(1031128L, "正码28"),
    ZHENG_MA_29(1031129L, "正码29"),
    ZHENG_MA_30(1031130L, "正码30"),

    ZHENG_MA_31(1031131L, "正码31"),
    ZHENG_MA_32(1031132L, "正码32"),
    ZHENG_MA_33(1031133L, "正码33"),
    ZHENG_MA_34(1031134L, "正码34"),
    ZHENG_MA_35(1031135L, "正码35"),
    ZHENG_MA_36(1031136L, "正码36"),
    ZHENG_MA_37(1031137L, "正码37"),
    ZHENG_MA_38(1031138L, "正码38"),
    ZHENG_MA_39(1031139L, "正码39"),
    ZHENG_MA_40(1031140L, "正码40"),

    ZHENG_MA_41(1031141L, "正码41"),
    ZHENG_MA_42(1031142L, "正码42"),
    ZHENG_MA_43(1031143L, "正码43"),
    ZHENG_MA_44(1031144L, "正码44"),
    ZHENG_MA_45(1031145L, "正码45"),
    ZHENG_MA_46(1031146L, "正码46"),
    ZHENG_MA_47(1031147L, "正码47"),
    ZHENG_MA_48(1031148L, "正码48"),
    ZHENG_MA_49(1031149L, "正码49"),

    ZHENG_MA_ZONG_DA(1031201L, "正码总和大"),
    ZHENG_MA_ZONG_XIAO(1031202L, "正码总和小"),
    ZHENG_MA_ZONG_DAN(1031203L, "正码总和单"),
    ZHENG_MA_ZONG_SHUANG(1031204L, "正码总和双"),

    ZHENG_YI_MA_DA(1041101L, "正一码大"),
    ZHENG_YI_MA_XIAO(1041102L, "正一码小"),
    ZHENG_YI_MA_DAN(1041103L, "正一码单"),
    ZHENG_YI_MA_SHUANG(1041104L, "正一码双"),
    ZHENG_YI_HE_DA(1041105L, "正一合大"),
    ZHENG_YI_HE_XIAO(1041106L, "正一合小"),
    ZHENG_YI_HE_DAN(1041107L, "正一合单"),
    ZHENG_YI_HE_SHUANG(1041108L, "正一合双"),
    ZHENG_YI_WEI_DA(1041109L, "正一尾大"),
    ZHENG_YI_WEI_XIAO(1041110L, "正一尾小"),
    ZHENG_YI_HONG(1041111L, "正一红波"),
    ZHENG_YI_LAN(1041112L, "正一蓝波"),
    ZHENG_YI_LV(1041113L, "正一绿波"),

    ZHENG_ER_MA_DA(1042101L, "正二码大"),
    ZHENG_ER_MA_XIAO(1042102L, "正二码小"),
    ZHENG_ER_MA_DAN(1042103L, "正二码单"),
    ZHENG_ER_MA_SHUANG(1042104L, "正二码双"),
    ZHENG_ER_HE_DA(1042105L, "正二合大"),
    ZHENG_ER_HE_XIAO(1042106L, "正二合小"),
    ZHENG_ER_HE_DAN(1042107L, "正二合单"),
    ZHENG_ER_HE_SHUANG(1042108L, "正二合双"),
    ZHENG_ER_WEI_DA(1042109L, "正二尾大"),
    ZHENG_ER_WEI_XIAO(1042110L, "正二尾小"),
    ZHENG_ER_HONG(1042111L, "正二红波"),
    ZHENG_ER_LAN(1042112L, "正二蓝波"),
    ZHENG_ER_LV(1042113L, "正二绿波"),

    ZHENG_SAN_MA_DA(1043101L, "正三码大"),
    ZHENG_SAN_MA_XIAO(1043102L, "正三码小"),
    ZHENG_SAN_MA_DAN(1043103L, "正三码单"),
    ZHENG_SAN_MA_SHUANG(1043104L, "正三码双"),
    ZHENG_SAN_HE_DA(1043105L, "正三合大"),
    ZHENG_SAN_HE_XIAO(1043106L, "正三合小"),
    ZHENG_SAN_HE_DAN(1043107L, "正三合单"),
    ZHENG_SAN_HE_SHUANG(1043108L, "正三合双"),
    ZHENG_SAN_WEI_DA(1043109L, "正三尾大"),
    ZHENG_SAN_WEI_XIAO(1043110L, "正三尾小"),
    ZHENG_SAN_HONG(1043111L, "正三红波"),
    ZHENG_SAN_LAN(1043112L, "正三蓝波"),
    ZHENG_SAN_LV(1043113L, "正三绿波"),

    ZHENG_SI_MA_DA(1044101L, "正四码大"),
    ZHENG_SI_MA_XIAO(1044102L, "正四码小"),
    ZHENG_SI_MA_DAN(1044103L, "正四码单"),
    ZHENG_SI_MA_SHUANG(1044104L, "正四码双"),
    ZHENG_SI_HE_DA(1044105L, "正四合大"),
    ZHENG_SI_HE_XIAO(1044106L, "正四合小"),
    ZHENG_SI_HE_DAN(1044107L, "正四合单"),
    ZHENG_SI_HE_SHUANG(1044108L, "正四合双"),
    ZHENG_SI_WEI_DA(1044109L, "正四尾大"),
    ZHENG_SI_WEI_XIAO(1044110L, "正四尾小"),
    ZHENG_SI_HONG(1044111L, "正四红波"),
    ZHENG_SI_LAN(1044112L, "正四蓝波"),
    ZHENG_SI_LV(1044113L, "正四绿波"),

    ZHENG_WU_MA_DA(1045101L, "正五码大"),
    ZHENG_WU_MA_XIAO(1045102L, "正五码小"),
    ZHENG_WU_MA_DAN(1045103L, "正五码单"),
    ZHENG_WU_MA_SHUANG(1045104L, "正五码双"),
    ZHENG_WU_HE_DA(1045105L, "正五合大"),
    ZHENG_WU_HE_XIAO(1045106L, "正五合小"),
    ZHENG_WU_HE_DAN(1045107L, "正五合单"),
    ZHENG_WU_HE_SHUANG(1045108L, "正五合双"),
    ZHENG_WU_WEI_DA(1045109L, "正五尾大"),
    ZHENG_WU_WEI_XIAO(1045110L, "正五尾小"),
    ZHENG_WU_HONG(1045111L, "正五红波"),
    ZHENG_WU_LAN(1045112L, "正五蓝波"),
    ZHENG_WU_LV(1045113L, "正五绿波"),

    ZHENG_LIU_MA_DA(1046101L, "正六码大"),
    ZHENG_LIU_MA_XIAO(1046102L, "正六码小"),
    ZHENG_LIU_MA_DAN(1046103L, "正六码单"),
    ZHENG_LIU_MA_SHUANG(1046104L, "正六码双"),
    ZHENG_LIU_HE_DA(1046105L, "正六合大"),
    ZHENG_LIU_HE_XIAO(1046106L, "正六合小"),
    ZHENG_LIU_HE_DAN(1046107L, "正六合单"),
    ZHENG_LIU_HE_SHUANG(1046108L, "正六合双"),
    ZHENG_LIU_WEI_DA(1046109L, "正六尾大"),
    ZHENG_LIU_WEI_XIAO(1046110L, "正六尾小"),
    ZHENG_LIU_HONG(1046111L, "正六红波"),
    ZHENG_LIU_LAN(1046112L, "正六蓝波"),
    ZHENG_LIU_LV(1046113L, "正六绿波"),

    // 正一特
    ZHENG_YI_TE_1(1051101L, "正一特1"),
    ZHENG_YI_TE_2(1051102L, "正一特2"),
    ZHENG_YI_TE_3(1051103L, "正一特3"),
    ZHENG_YI_TE_4(1051104L, "正一特4"),
    ZHENG_YI_TE_5(1051105L, "正一特5"),
    ZHENG_YI_TE_6(1051106L, "正一特6"),
    ZHENG_YI_TE_7(1051107L, "正一特7"),
    ZHENG_YI_TE_8(1051108L, "正一特8"),
    ZHENG_YI_TE_9(1051109L, "正一特9"),
    ZHENG_YI_TE_10(1051110L, "正一特10"),

    ZHENG_YI_TE_11(1051111L, "正一特11"),
    ZHENG_YI_TE_12(1051112L, "正一特12"),
    ZHENG_YI_TE_13(1051113L, "正一特13"),
    ZHENG_YI_TE_14(1051114L, "正一特14"),
    ZHENG_YI_TE_15(1051115L, "正一特15"),
    ZHENG_YI_TE_16(1051116L, "正一特16"),
    ZHENG_YI_TE_17(1051117L, "正一特17"),
    ZHENG_YI_TE_18(1051118L, "正一特18"),
    ZHENG_YI_TE_19(1051119L, "正一特19"),
    ZHENG_YI_TE_20(1051120L, "正一特20"),

    ZHENG_YI_TE_21(1051121L, "正一特21"),
    ZHENG_YI_TE_22(1051122L, "正一特22"),
    ZHENG_YI_TE_23(1051123L, "正一特23"),
    ZHENG_YI_TE_24(1051124L, "正一特24"),
    ZHENG_YI_TE_25(1051125L, "正一特25"),
    ZHENG_YI_TE_26(1051126L, "正一特26"),
    ZHENG_YI_TE_27(1051127L, "正一特27"),
    ZHENG_YI_TE_28(1051128L, "正一特28"),
    ZHENG_YI_TE_29(1051129L, "正一特29"),
    ZHENG_YI_TE_30(1051130L, "正一特30"),

    ZHENG_YI_TE_31(1051131L, "正一特31"),
    ZHENG_YI_TE_32(1051132L, "正一特32"),
    ZHENG_YI_TE_33(1051133L, "正一特33"),
    ZHENG_YI_TE_34(1051134L, "正一特34"),
    ZHENG_YI_TE_35(1051135L, "正一特35"),
    ZHENG_YI_TE_36(1051136L, "正一特36"),
    ZHENG_YI_TE_37(1051137L, "正一特37"),
    ZHENG_YI_TE_38(1051138L, "正一特38"),
    ZHENG_YI_TE_39(1051139L, "正一特39"),
    ZHENG_YI_TE_40(1051140L, "正一特40"),

    ZHENG_YI_TE_41(1051141L, "正一特41"),
    ZHENG_YI_TE_42(1051142L, "正一特42"),
    ZHENG_YI_TE_43(1051143L, "正一特43"),
    ZHENG_YI_TE_44(1051144L, "正一特44"),
    ZHENG_YI_TE_45(1051145L, "正一特45"),
    ZHENG_YI_TE_46(1051146L, "正一特46"),
    ZHENG_YI_TE_47(1051147L, "正一特47"),
    ZHENG_YI_TE_48(1051148L, "正一特48"),
    ZHENG_YI_TE_49(1051149L, "正一特49"),

    ZHENG_YI_LIANG_MIAN_DA(1051201L, "正一两面大"),
    ZHENG_YI_LIANG_MIAN_XIAO(1051202L, "正一两面小"),
    ZHENG_YI_LIANG_MIAN_DAN(1051203L, "正一两面单"),
    ZHENG_YI_LIANG_MIAN_SHUANG(1051204L, "正一两面双"),
    ZHENG_YI_LIANG_MIAN_HE_DA(1051205L, "正一两面合大"),
    ZHENG_YI_LIANG_MIAN_HE_XIAO(1051206L, "正一两面合小"),
    ZHENG_YI_LIANG_MIAN_HE_DAN(1051207L, "正一两面合单"),
    ZHENG_YI_LIANG_MIAN_HE_SHUANG(1051208L, "正一两面合双"),
    ZHENG_YI_LIANG_MIAN_WEI_DA(1051209L, "正一两面尾大"),
    ZHENG_YI_LIANG_MIAN_WEI_XIAO(1051210L, "正一两面尾小"),
    ZHENG_YI_LIANG_MIAN_HONG(1051211L, "正一两面红波"),
    ZHENG_YI_LIANG_MIAN_LAN(1051212L, "正一两面蓝波"),
    ZHENG_YI_LIANG_MIAN_LV(1051213L, "正一两面绿波"),

    // 正二特
    ZHENG_ER_TE_1(1052101L, "正二特1"),
    ZHENG_ER_TE_2(1052102L, "正二特2"),
    ZHENG_ER_TE_3(1052103L, "正二特3"),
    ZHENG_ER_TE_4(1052104L, "正二特4"),
    ZHENG_ER_TE_5(1052105L, "正二特5"),
    ZHENG_ER_TE_6(1052106L, "正二特6"),
    ZHENG_ER_TE_7(1052107L, "正二特7"),
    ZHENG_ER_TE_8(1052108L, "正二特8"),
    ZHENG_ER_TE_9(1052109L, "正二特9"),
    ZHENG_ER_TE_10(1052110L, "正二特10"),

    ZHENG_ER_TE_11(1052111L, "正二特11"),
    ZHENG_ER_TE_12(1052112L, "正二特12"),
    ZHENG_ER_TE_13(1052113L, "正二特13"),
    ZHENG_ER_TE_14(1052114L, "正二特14"),
    ZHENG_ER_TE_15(1052115L, "正二特15"),
    ZHENG_ER_TE_16(1052116L, "正二特16"),
    ZHENG_ER_TE_17(1052117L, "正二特17"),
    ZHENG_ER_TE_18(1052118L, "正二特18"),
    ZHENG_ER_TE_19(1052119L, "正二特19"),
    ZHENG_ER_TE_20(1052120L, "正二特20"),

    ZHENG_ER_TE_21(1052121L, "正二特21"),
    ZHENG_ER_TE_22(1052122L, "正二特22"),
    ZHENG_ER_TE_23(1052123L, "正二特23"),
    ZHENG_ER_TE_24(1052124L, "正二特24"),
    ZHENG_ER_TE_25(1052125L, "正二特25"),
    ZHENG_ER_TE_26(1052126L, "正二特26"),
    ZHENG_ER_TE_27(1052127L, "正二特27"),
    ZHENG_ER_TE_28(1052128L, "正二特28"),
    ZHENG_ER_TE_29(1052129L, "正二特29"),
    ZHENG_ER_TE_30(1052130L, "正二特30"),

    ZHENG_ER_TE_31(1052131L, "正二特31"),
    ZHENG_ER_TE_32(1052132L, "正二特32"),
    ZHENG_ER_TE_33(1052133L, "正二特33"),
    ZHENG_ER_TE_34(1052134L, "正二特34"),
    ZHENG_ER_TE_35(1052135L, "正二特35"),
    ZHENG_ER_TE_36(1052136L, "正二特36"),
    ZHENG_ER_TE_37(1052137L, "正二特37"),
    ZHENG_ER_TE_38(1052138L, "正二特38"),
    ZHENG_ER_TE_39(1052139L, "正二特39"),
    ZHENG_ER_TE_40(1052140L, "正二特40"),

    ZHENG_ER_TE_41(1052141L, "正二特41"),
    ZHENG_ER_TE_42(1052142L, "正二特42"),
    ZHENG_ER_TE_43(1052143L, "正二特43"),
    ZHENG_ER_TE_44(1052144L, "正二特44"),
    ZHENG_ER_TE_45(1052145L, "正二特45"),
    ZHENG_ER_TE_46(1052146L, "正二特46"),
    ZHENG_ER_TE_47(1052147L, "正二特47"),
    ZHENG_ER_TE_48(1052148L, "正二特48"),
    ZHENG_ER_TE_49(1052149L, "正二特49"),

    ZHENG_ER_LIANG_MIAN_DA(1052201L, "正二两面大"),
    ZHENG_ER_LIANG_MIAN_XIAO(1052202L, "正二两面小"),
    ZHENG_ER_LIANG_MIAN_DAN(1052203L, "正二两面单"),
    ZHENG_ER_LIANG_MIAN_SHUANG(1052204L, "正二两面双"),
    ZHENG_ER_LIANG_MIAN_HE_DA(1052205L, "正二两面合大"),
    ZHENG_ER_LIANG_MIAN_HE_XIAO(1052206L, "正二两面合小"),
    ZHENG_ER_LIANG_MIAN_HE_DAN(1052207L, "正二两面合单"),
    ZHENG_ER_LIANG_MIAN_HE_SHUANG(1052208L, "正二两面合双"),
    ZHENG_ER_LIANG_MIAN_WEI_DA(1052209L, "正二两面尾大"),
    ZHENG_ER_LIANG_MIAN_WEI_XIAO(1052210L, "正二两面尾小"),
    ZHENG_ER_LIANG_MIAN_HONG(1052211L, "正二两面红波"),
    ZHENG_ER_LIANG_MIAN_LAN(1052212L, "正二两面蓝波"),
    ZHENG_ER_LIANG_MIAN_LV(1052213L, "正二两面绿波"),

    // 正三特
    ZHENG_SAN_TE_1(1053101L, "正三特1"),
    ZHENG_SAN_TE_2(1053102L, "正三特2"),
    ZHENG_SAN_TE_3(1053103L, "正三特3"),
    ZHENG_SAN_TE_4(1053104L, "正三特4"),
    ZHENG_SAN_TE_5(1053105L, "正三特5"),
    ZHENG_SAN_TE_6(1053106L, "正三特6"),
    ZHENG_SAN_TE_7(1053107L, "正三特7"),
    ZHENG_SAN_TE_8(1053108L, "正三特8"),
    ZHENG_SAN_TE_9(1053109L, "正三特9"),
    ZHENG_SAN_TE_10(1053110L, "正三特10"),

    ZHENG_SAN_TE_11(1053111L, "正三特11"),
    ZHENG_SAN_TE_12(1053112L, "正三特12"),
    ZHENG_SAN_TE_13(1053113L, "正三特13"),
    ZHENG_SAN_TE_14(1053114L, "正三特14"),
    ZHENG_SAN_TE_15(1053115L, "正三特15"),
    ZHENG_SAN_TE_16(1053116L, "正三特16"),
    ZHENG_SAN_TE_17(1053117L, "正三特17"),
    ZHENG_SAN_TE_18(1053118L, "正三特18"),
    ZHENG_SAN_TE_19(1053119L, "正三特19"),
    ZHENG_SAN_TE_20(1053120L, "正三特20"),

    ZHENG_SAN_TE_21(1053121L, "正三特21"),
    ZHENG_SAN_TE_22(1053122L, "正三特22"),
    ZHENG_SAN_TE_23(1053123L, "正三特23"),
    ZHENG_SAN_TE_24(1053124L, "正三特24"),
    ZHENG_SAN_TE_25(1053125L, "正三特25"),
    ZHENG_SAN_TE_26(1053126L, "正三特26"),
    ZHENG_SAN_TE_27(1053127L, "正三特27"),
    ZHENG_SAN_TE_28(1053128L, "正三特28"),
    ZHENG_SAN_TE_29(1053129L, "正三特29"),
    ZHENG_SAN_TE_30(1053130L, "正三特30"),

    ZHENG_SAN_TE_31(1053131L, "正三特31"),
    ZHENG_SAN_TE_32(1053132L, "正三特32"),
    ZHENG_SAN_TE_33(1053133L, "正三特33"),
    ZHENG_SAN_TE_34(1053134L, "正三特34"),
    ZHENG_SAN_TE_35(1053135L, "正三特35"),
    ZHENG_SAN_TE_36(1053136L, "正三特36"),
    ZHENG_SAN_TE_37(1053137L, "正三特37"),
    ZHENG_SAN_TE_38(1053138L, "正三特38"),
    ZHENG_SAN_TE_39(1053139L, "正三特39"),
    ZHENG_SAN_TE_40(1053140L, "正三特40"),

    ZHENG_SAN_TE_41(1053141L, "正三特41"),
    ZHENG_SAN_TE_42(1053142L, "正三特42"),
    ZHENG_SAN_TE_43(1053143L, "正三特43"),
    ZHENG_SAN_TE_44(1053144L, "正三特44"),
    ZHENG_SAN_TE_45(1053145L, "正三特45"),
    ZHENG_SAN_TE_46(1053146L, "正三特46"),
    ZHENG_SAN_TE_47(1053147L, "正三特47"),
    ZHENG_SAN_TE_48(1053148L, "正三特48"),
    ZHENG_SAN_TE_49(1053149L, "正三特49"),

    ZHENG_SAN_LIANG_MIAN_DA(1053201L, "正三两面大"),
    ZHENG_SAN_LIANG_MIAN_XIAO(1053202L, "正三两面小"),
    ZHENG_SAN_LIANG_MIAN_DAN(1053203L, "正三两面单"),
    ZHENG_SAN_LIANG_MIAN_SHUANG(1053204L, "正三两面双"),
    ZHENG_SAN_LIANG_MIAN_HE_DA(1053205L, "正三两面合大"),
    ZHENG_SAN_LIANG_MIAN_HE_XIAO(1053206L, "正三两面合小"),
    ZHENG_SAN_LIANG_MIAN_HE_DAN(1053207L, "正三两面合单"),
    ZHENG_SAN_LIANG_MIAN_HE_SHUANG(1053208L, "正三两面合双"),
    ZHENG_SAN_LIANG_MIAN_WEI_DA(1053209L, "正三两面尾大"),
    ZHENG_SAN_LIANG_MIAN_WEI_XIAO(1053210L, "正三两面尾小"),
    ZHENG_SAN_LIANG_MIAN_HONG(1053211L, "正三两面红波"),
    ZHENG_SAN_LIANG_MIAN_LAN(1053212L, "正三两面蓝波"),
    ZHENG_SAN_LIANG_MIAN_LV(1053213L, "正三两面绿波"),

    // 正四特
    ZHENG_SI_TE_1(1054101L, "正四特1"),
    ZHENG_SI_TE_2(1054102L, "正四特2"),
    ZHENG_SI_TE_3(1054103L, "正四特3"),
    ZHENG_SI_TE_4(1054104L, "正四特4"),
    ZHENG_SI_TE_5(1054105L, "正四特5"),
    ZHENG_SI_TE_6(1054106L, "正四特6"),
    ZHENG_SI_TE_7(1054107L, "正四特7"),
    ZHENG_SI_TE_8(1054108L, "正四特8"),
    ZHENG_SI_TE_9(1054109L, "正四特9"),
    ZHENG_SI_TE_10(1054110L, "正四特10"),

    ZHENG_SI_TE_11(1054111L, "正四特11"),
    ZHENG_SI_TE_12(1054112L, "正四特12"),
    ZHENG_SI_TE_13(1054113L, "正四特13"),
    ZHENG_SI_TE_14(1054114L, "正四特14"),
    ZHENG_SI_TE_15(1054115L, "正四特15"),
    ZHENG_SI_TE_16(1054116L, "正四特16"),
    ZHENG_SI_TE_17(1054117L, "正四特17"),
    ZHENG_SI_TE_18(1054118L, "正四特18"),
    ZHENG_SI_TE_19(1054119L, "正四特19"),
    ZHENG_SI_TE_20(1054120L, "正四特20"),

    ZHENG_SI_TE_21(1054121L, "正四特21"),
    ZHENG_SI_TE_22(1054122L, "正四特22"),
    ZHENG_SI_TE_23(1054123L, "正四特23"),
    ZHENG_SI_TE_24(1054124L, "正四特24"),
    ZHENG_SI_TE_25(1054125L, "正四特25"),
    ZHENG_SI_TE_26(1054126L, "正四特26"),
    ZHENG_SI_TE_27(1054127L, "正四特27"),
    ZHENG_SI_TE_28(1054128L, "正四特28"),
    ZHENG_SI_TE_29(1054129L, "正四特29"),
    ZHENG_SI_TE_30(1054130L, "正四特30"),

    ZHENG_SI_TE_31(1054131L, "正四特31"),
    ZHENG_SI_TE_32(1054132L, "正四特32"),
    ZHENG_SI_TE_33(1054133L, "正四特33"),
    ZHENG_SI_TE_34(1054134L, "正四特34"),
    ZHENG_SI_TE_35(1054135L, "正四特35"),
    ZHENG_SI_TE_36(1054136L, "正四特36"),
    ZHENG_SI_TE_37(1054137L, "正四特37"),
    ZHENG_SI_TE_38(1054138L, "正四特38"),
    ZHENG_SI_TE_39(1054139L, "正四特39"),
    ZHENG_SI_TE_40(1054140L, "正四特40"),

    ZHENG_SI_TE_41(1054141L, "正四特41"),
    ZHENG_SI_TE_42(1054142L, "正四特42"),
    ZHENG_SI_TE_43(1054143L, "正四特43"),
    ZHENG_SI_TE_44(1054144L, "正四特44"),
    ZHENG_SI_TE_45(1054145L, "正四特45"),
    ZHENG_SI_TE_46(1054146L, "正四特46"),
    ZHENG_SI_TE_47(1054147L, "正四特47"),
    ZHENG_SI_TE_48(1054148L, "正四特48"),
    ZHENG_SI_TE_49(1054149L, "正四特49"),

    ZHENG_SI_LIANG_MIAN_DA(1054201L, "正四两面大"),
    ZHENG_SI_LIANG_MIAN_XIAO(1054202L, "正四两面小"),
    ZHENG_SI_LIANG_MIAN_DAN(1054203L, "正四两面单"),
    ZHENG_SI_LIANG_MIAN_SHUANG(1054204L, "正四两面双"),
    ZHENG_SI_LIANG_MIAN_HE_DA(1054205L, "正四两面合大"),
    ZHENG_SI_LIANG_MIAN_HE_XIAO(1054206L, "正四两面合小"),
    ZHENG_SI_LIANG_MIAN_HE_DAN(1054207L, "正四两面合单"),
    ZHENG_SI_LIANG_MIAN_HE_SHUANG(1054208L, "正四两面合双"),
    ZHENG_SI_LIANG_MIAN_WEI_DA(1054209L, "正四两面尾大"),
    ZHENG_SI_LIANG_MIAN_WEI_XIAO(1054210L, "正四两面尾小"),
    ZHENG_SI_LIANG_MIAN_HONG(1054211L, "正四两面红波"),
    ZHENG_SI_LIANG_MIAN_LAN(1054212L, "正四两面蓝波"),
    ZHENG_SI_LIANG_MIAN_LV(1054213L, "正四两面绿波"),

    // 正五特
    ZHENG_WU_TE_1(1055101L, "正五特1"),
    ZHENG_WU_TE_2(1055102L, "正五特2"),
    ZHENG_WU_TE_3(1055103L, "正五特3"),
    ZHENG_WU_TE_4(1055104L, "正五特4"),
    ZHENG_WU_TE_5(1055105L, "正五特5"),
    ZHENG_WU_TE_6(1055106L, "正五特6"),
    ZHENG_WU_TE_7(1055107L, "正五特7"),
    ZHENG_WU_TE_8(1055108L, "正五特8"),
    ZHENG_WU_TE_9(1055109L, "正五特9"),
    ZHENG_WU_TE_10(1055110L, "正五特10"),

    ZHENG_WU_TE_11(1055111L, "正五特11"),
    ZHENG_WU_TE_12(1055112L, "正五特12"),
    ZHENG_WU_TE_13(1055113L, "正五特13"),
    ZHENG_WU_TE_14(1055114L, "正五特14"),
    ZHENG_WU_TE_15(1055115L, "正五特15"),
    ZHENG_WU_TE_16(1055116L, "正五特16"),
    ZHENG_WU_TE_17(1055117L, "正五特17"),
    ZHENG_WU_TE_18(1055118L, "正五特18"),
    ZHENG_WU_TE_19(1055119L, "正五特19"),
    ZHENG_WU_TE_20(1055120L, "正五特20"),

    ZHENG_WU_TE_21(1055121L, "正五特21"),
    ZHENG_WU_TE_22(1055122L, "正五特22"),
    ZHENG_WU_TE_23(1055123L, "正五特23"),
    ZHENG_WU_TE_24(1055124L, "正五特24"),
    ZHENG_WU_TE_25(1055125L, "正五特25"),
    ZHENG_WU_TE_26(1055126L, "正五特26"),
    ZHENG_WU_TE_27(1055127L, "正五特27"),
    ZHENG_WU_TE_28(1055128L, "正五特28"),
    ZHENG_WU_TE_29(1055129L, "正五特29"),
    ZHENG_WU_TE_30(1055130L, "正五特30"),

    ZHENG_WU_TE_31(1055131L, "正五特31"),
    ZHENG_WU_TE_32(1055132L, "正五特32"),
    ZHENG_WU_TE_33(1055133L, "正五特33"),
    ZHENG_WU_TE_34(1055134L, "正五特34"),
    ZHENG_WU_TE_35(1055135L, "正五特35"),
    ZHENG_WU_TE_36(1055136L, "正五特36"),
    ZHENG_WU_TE_37(1055137L, "正五特37"),
    ZHENG_WU_TE_38(1055138L, "正五特38"),
    ZHENG_WU_TE_39(1055139L, "正五特39"),
    ZHENG_WU_TE_40(1055140L, "正五特40"),

    ZHENG_WU_TE_41(1055141L, "正五特41"),
    ZHENG_WU_TE_42(1055142L, "正五特42"),
    ZHENG_WU_TE_43(1055143L, "正五特43"),
    ZHENG_WU_TE_44(1055144L, "正五特44"),
    ZHENG_WU_TE_45(1055145L, "正五特45"),
    ZHENG_WU_TE_46(1055146L, "正五特46"),
    ZHENG_WU_TE_47(1055147L, "正五特47"),
    ZHENG_WU_TE_48(1055148L, "正五特48"),
    ZHENG_WU_TE_49(1055149L, "正五特49"),

    ZHENG_WU_LIANG_MIAN_DA(1055201L, "正五两面大"),
    ZHENG_WU_LIANG_MIAN_XIAO(1055202L, "正五两面小"),
    ZHENG_WU_LIANG_MIAN_DAN(1055203L, "正五两面单"),
    ZHENG_WU_LIANG_MIAN_SHUANG(1055204L, "正五两面双"),
    ZHENG_WU_LIANG_MIAN_HE_DA(1055205L, "正五两面合大"),
    ZHENG_WU_LIANG_MIAN_HE_XIAO(1055206L, "正五两面合小"),
    ZHENG_WU_LIANG_MIAN_HE_DAN(1055207L, "正五两面合单"),
    ZHENG_WU_LIANG_MIAN_HE_SHUANG(1055208L, "正五两面合双"),
    ZHENG_WU_LIANG_MIAN_WEI_DA(1055209L, "正五两面尾大"),
    ZHENG_WU_LIANG_MIAN_WEI_XIAO(1055210L, "正五两面尾小"),
    ZHENG_WU_LIANG_MIAN_HONG(1055211L, "正五两面红波"),
    ZHENG_WU_LIANG_MIAN_LAN(1055212L, "正五两面蓝波"),
    ZHENG_WU_LIANG_MIAN_LV(1055213L, "正五两面绿波"),

    // 正六特
    ZHENG_LIU_TE_1(1056101L, "正六特1"),
    ZHENG_LIU_TE_2(1056102L, "正六特2"),
    ZHENG_LIU_TE_3(1056103L, "正六特3"),
    ZHENG_LIU_TE_4(1056104L, "正六特4"),
    ZHENG_LIU_TE_5(1056105L, "正六特5"),
    ZHENG_LIU_TE_6(1056106L, "正六特6"),
    ZHENG_LIU_TE_7(1056107L, "正六特7"),
    ZHENG_LIU_TE_8(1056108L, "正六特8"),
    ZHENG_LIU_TE_9(1056109L, "正六特9"),
    ZHENG_LIU_TE_10(1056110L, "正六特10"),

    ZHENG_LIU_TE_11(1056111L, "正六特11"),
    ZHENG_LIU_TE_12(1056112L, "正六特12"),
    ZHENG_LIU_TE_13(1056113L, "正六特13"),
    ZHENG_LIU_TE_14(1056114L, "正六特14"),
    ZHENG_LIU_TE_15(1056115L, "正六特15"),
    ZHENG_LIU_TE_16(1056116L, "正六特16"),
    ZHENG_LIU_TE_17(1056117L, "正六特17"),
    ZHENG_LIU_TE_18(1056118L, "正六特18"),
    ZHENG_LIU_TE_19(1056119L, "正六特19"),
    ZHENG_LIU_TE_20(1056120L, "正六特20"),

    ZHENG_LIU_TE_21(1056121L, "正六特21"),
    ZHENG_LIU_TE_22(1056122L, "正六特22"),
    ZHENG_LIU_TE_23(1056123L, "正六特23"),
    ZHENG_LIU_TE_24(1056124L, "正六特24"),
    ZHENG_LIU_TE_25(1056125L, "正六特25"),
    ZHENG_LIU_TE_26(1056126L, "正六特26"),
    ZHENG_LIU_TE_27(1056127L, "正六特27"),
    ZHENG_LIU_TE_28(1056128L, "正六特28"),
    ZHENG_LIU_TE_29(1056129L, "正六特29"),
    ZHENG_LIU_TE_30(1056130L, "正六特30"),

    ZHENG_LIU_TE_31(1056131L, "正六特31"),
    ZHENG_LIU_TE_32(1056132L, "正六特32"),
    ZHENG_LIU_TE_33(1056133L, "正六特33"),
    ZHENG_LIU_TE_34(1056134L, "正六特34"),
    ZHENG_LIU_TE_35(1056135L, "正六特35"),
    ZHENG_LIU_TE_36(1056136L, "正六特36"),
    ZHENG_LIU_TE_37(1056137L, "正六特37"),
    ZHENG_LIU_TE_38(1056138L, "正六特38"),
    ZHENG_LIU_TE_39(1056139L, "正六特39"),
    ZHENG_LIU_TE_40(1056140L, "正六特40"),

    ZHENG_LIU_TE_41(1056141L, "正六特41"),
    ZHENG_LIU_TE_42(1056142L, "正六特42"),
    ZHENG_LIU_TE_43(1056143L, "正六特43"),
    ZHENG_LIU_TE_44(1056144L, "正六特44"),
    ZHENG_LIU_TE_45(1056145L, "正六特45"),
    ZHENG_LIU_TE_46(1056146L, "正六特46"),
    ZHENG_LIU_TE_47(1056147L, "正六特47"),
    ZHENG_LIU_TE_48(1056148L, "正六特48"),
    ZHENG_LIU_TE_49(1056149L, "正六特49"),

    ZHENG_LIU_LIANG_MIAN_DA(1056201L, "正六两面大"),
    ZHENG_LIU_LIANG_MIAN_XIAO(1056202L, "正六两面小"),
    ZHENG_LIU_LIANG_MIAN_DAN(1056203L, "正六两面单"),
    ZHENG_LIU_LIANG_MIAN_SHUANG(1056204L, "正六两面双"),
    ZHENG_LIU_LIANG_MIAN_HE_DA(1056205L, "正六两面合大"),
    ZHENG_LIU_LIANG_MIAN_HE_XIAO(1056206L, "正六两面合小"),
    ZHENG_LIU_LIANG_MIAN_HE_DAN(1056207L, "正六两面合单"),
    ZHENG_LIU_LIANG_MIAN_HE_SHUANG(1056208L, "正六两面合双"),
    ZHENG_LIU_LIANG_MIAN_WEI_DA(1056209L, "正六两面尾大"),
    ZHENG_LIU_LIANG_MIAN_WEI_XIAO(1056210L, "正六两面尾小"),
    ZHENG_LIU_LIANG_MIAN_HONG(1056211L, "正六两面红波"),
    ZHENG_LIU_LIANG_MIAN_LAN(1056212L, "正六两面蓝波"),
    ZHENG_LIU_LIANG_MIAN_LV(1056213L, "正六两面绿波"),

    // 连码
    LIAN_MA_SAN_QUAN_ZHONG(1061101L, "连码三全中"),
    LIAN_MA_SAN_ZHONG_ER(1062101L, "连码三中二中二"),
    LIAN_MA_SAN_ZHONG_SAN(1062102L, "连码三中二中三"),
    LIAN_MA_ER_QUAN_ZHONG(1063101L, "连码二全中"),
    LIAN_MA_ER_ZHONG_ER(1064101L, "连码二中特中二"),
    LIAN_MA_ER_ZHONG_TE(1064102L, "连码二中特中特"),
    LIAN_MA_TE_CHUAN(1065101L, "连码特串"),
    LIAN_MA_SI_QUAN_ZHONG(1066101L, "连码四全中"),

    //特码色波
    TE_MA_HONG_BO(1071101L, "特码红波"),
    TE_MA_LAN_BO(1071102L, "特码蓝波"),
    TE_MA_LV_BO(1071103L, "特码绿波"),

    //七色波
    QI_SE_HONG_BO(1071201L, "七色红波"),
    QI_SE_LAN_BO(1071202L, "七色蓝波"),
    QI_SE_LV_BO(1071203L, "七色绿波"),
    QI_SE_HE_JU(1071204L, "七色和局"),

    TE_MA_HONG_DAN(1071301L, "红单"),
    TE_MA_HONG_SHUANG(1071302L, "红双"),
    TE_MA_HONG_DA(1071303L, "红大"),
    TE_MA_HONG_XIAO(1071304L, "红小"),
    TE_MA_HONG_DA_DAN(1071305L, "红大单"),
    TE_MA_HONG_DA_SHUANG(1071306L, "红大双"),
    TE_MA_HONG_XIAO_DAN(1071307L, "红小单"),
    TE_MA_HONG_XIAO_SHUANG(1071308L, "红小双"),

    TE_MA_LAN_DAN(1071401L, "蓝单"),
    TE_MA_LAN_SHUANG(1071402L, "蓝双"),
    TE_MA_LAN_DA(1071403L, "蓝大"),
    TE_MA_LAN_XIAO(1071404L, "蓝小"),
    TE_MA_LAN_DA_DAN(1071405L, "蓝大单"),
    TE_MA_LAN_DA_SHUANG(1071406L, "蓝大双"),
    TE_MA_LAN_XIAO_DAN(1071407L, "蓝小单"),
    TE_MA_LAN_XIAO_SHUANG(1071408L, "蓝小双"),

    TE_MA_LV_DAN(1071501L, "绿单"),
    TE_MA_LV_SHUANG(1071502L, "绿双"),
    TE_MA_LV_DA(1071503L, "绿大"),
    TE_MA_LV_XIAO(1071504L, "绿小"),
    TE_MA_LV_DA_DAN(1071505L, "绿大单"),
    TE_MA_LV_DA_SHUANG(1071506L, "绿大双"),
    TE_MA_LV_XIAO_DAN(1071507L, "绿小单"),
    TE_MA_LV_XIAO_SHUANG(1071508L, "绿小双"),

    TE_MA_TOU_0(1081101L, "特码-0头"),
    TE_MA_TOU_1(1081102L, "特码-1头"),
    TE_MA_TOU_2(1081103L, "特码-2头"),
    TE_MA_TOU_3(1081104L, "特码-3头"),
    TE_MA_TOU_4(1081105L, "特码-4头"),

    TE_MA_WEI_0(1081201L, "特码-0尾"),
    TE_MA_WEI_1(1081202L, "特码-1尾"),
    TE_MA_WEI_2(1081203L, "特码-2尾"),
    TE_MA_WEI_3(1081204L, "特码-3尾"),
    TE_MA_WEI_4(1081205L, "特码-4尾"),
    TE_MA_WEI_5(1081206L, "特码-5尾"),
    TE_MA_WEI_6(1081207L, "特码-6尾"),
    TE_MA_WEI_7(1081208L, "特码-7尾"),
    TE_MA_WEI_8(1081209L, "特码-8尾"),
    TE_MA_WEI_9(1081210L, "特码-9尾"),

    // 总肖
    ZONG_ER_XIAO(1091101L, "总肖-2肖"),
    ZONG_SAN_XIAO(1091102L, "总肖-3肖"),
    ZONG_SI_XIAO(1091103L, "总肖-4肖"),
    ZONG_WU_XIAO(1091104L, "总肖-5肖"),
    ZONG_LIU_XIAO(1091105L, "总肖-6肖"),
    ZONG_QI_XIAO(1091106L, "总肖-7肖"),
    ZONG_DAN_XIAO(1091107L, "总肖-单"),
    ZONG_SHUANG_XIAO(1091108L, "总肖-双"),

    // 平特一肖
    PING_TE_YI_XIAO_SHU(1101101L, "平特一肖-鼠"),
    PING_TE_YI_XIAO_NIU(1101102L, "平特一肖-牛"),
    PING_TE_YI_XIAO_HU(1101103L, "平特一肖-虎"),
    PING_TE_YI_XIAO_TU(1101104L, "平特一肖-兔"),
    PING_TE_YI_XIAO_LONG(1101105L, "平特一肖-龙"),
    PING_TE_YI_XIAO_SHE(1101106L, "平特一肖-蛇"),
    PING_TE_YI_XIAO_MA(1101107L, "平特一肖-马"),
    PING_TE_YI_XIAO_YANG(1101108L, "平特一肖-羊"),
    PING_TE_YI_XIAO_HOU(1101109L, "平特一肖-猴"),
    PING_TE_YI_XIAO_JI(1101110L, "平特一肖-鸡"),
    PING_TE_YI_XIAO_GOU(1101111L, "平特一肖-狗"),
    PING_TE_YI_XIAO_ZHU(1101112L, "平特一肖-猪"),

    // 平特尾数
    PING_TE_WEI_SHU_0(1101201L, "平特尾数-0尾"),
    PING_TE_WEI_SHU_1(1101202L, "平特尾数-1尾"),
    PING_TE_WEI_SHU_2(1101203L, "平特尾数-2尾"),
    PING_TE_WEI_SHU_3(1101204L, "平特尾数-3尾"),
    PING_TE_WEI_SHU_4(1101205L, "平特尾数-4尾"),
    PING_TE_WEI_SHU_5(1101206L, "平特尾数-5尾"),
    PING_TE_WEI_SHU_6(1101207L, "平特尾数-6尾"),
    PING_TE_WEI_SHU_7(1101208L, "平特尾数-7尾"),
    PING_TE_WEI_SHU_8(1101209L, "平特尾数-8尾"),
    PING_TE_WEI_SHU_9(1101210L, "平特尾数-9尾"),

    // 连肖连尾
    ER_LIAN_XIAO(1111190L, "二连肖"),
    SAN_LIAN_XIAO(1111290L, "三连肖"),
    SI_LIAN_XIAO(1111390L, "四连肖"),
    WU_LIAN_XIAO(1111490L, "五连肖"),

    ER_LIAN_XIAO_BEN_MING(1111101L, "二连肖-本命"),
    SAN_LIAN_XIAO_BEN_MING(1111201L, "三连肖-本命"),
    SI_LIAN_XIAO_BEN_MING(1111301L, "四连肖-本命"),
    WU_LIAN_XIAO_BEN_MING(1111401L, "五连肖-本命"),

    ER_LIAN_XIAO_FEI_BEN_MING(1111102L, "二连肖-非本命"),
    SAN_LIAN_XIAO_FEI_BEN_MING(1111202L, "三连肖-非本命"),
    SI_LIAN_XIAO_FEI_BEN_MING(1111302L, "四连肖-非本命"),
    WU_LIAN_XIAO_FEI_BEN_MING(1111402L, "五连肖-非本命"),

    //特肖
    TE_XIAO_SHU(1121101L, "特肖-鼠"),
    TE_XIAO_NIU(1121102L, "特肖-牛"),
    TE_XIAO_HU(1121103L, "特肖-虎"),
    TE_XIAO_TU(1121104L, "特肖-兔"),
    TE_XIAO_LONG(1121105L, "特肖-龙"),
    TE_XIAO_SHE(1121106L, "特肖-蛇"),
    TE_XIAO_MA(1121107L, "特肖-马"),
    TE_XIAO_YANG(1121108L, "特肖-羊"),
    TE_XIAO_HOU(1121109L, "特肖-猴"),
    TE_XIAO_JI(1121110L, "特肖-鸡"),
    TE_XIAO_GOU(1121111L, "特肖-狗"),
    TE_XIAO_ZHU(1121112L, "特肖-猪"),

    //合肖
    HE_XIAO_ER(1131101L, "二合肖"),
    HE_XIAO_SAN(1131102L, "三合肖"),
    HE_XIAO_SI(1131103L, "四合肖"),
    HE_XIAO_WU(1131104L, "五合肖"),
    HE_XIAO_LIU(1131105L, "六合肖"),
    HE_XIAO_QI(1131106L, "七合肖"),
    HE_XIAO_BA(1131107L, "八合肖"),
    HE_XIAO_JIU(1131108L, "九合肖"),
    HE_XIAO_SHI(1131109L, "十合肖"),
    HE_XIAO_SHI_YI(1131110L, "十一合肖"),

    // 连尾
    ER_LIAN_WEI(1141190L, "二连尾"),
    SAN_LIAN_WEI(1141290L, "三连尾"),
    SI_LIAN_WEI(1141390L, "四连尾"),
    WU_LIAN_WEI(1141490L, "五连尾"),

    ER_LIAN_WEI_0(1141101L, "二连尾-0尾"),
    SAN_LIAN_WEI_0(1141201L, "三连尾-0尾"),
    SI_LIAN_WEI_0(1141301L, "四连尾-0尾"),
    WU_LIAN_WEI_0(1141401L, "五连尾-0尾"),

    ER_LIAN_WEI_FEI_0(1141102L, "二连尾-非0尾"),
    SAN_LIAN_WEI_FEI_0(1141202L, "三连尾-非0尾"),
    SI_LIAN_WEI_FEI_0(1141302L, "四连尾-非0尾"),
    WU_LIAN_WEI_FEI_0(1141402L, "五连尾-非0尾"),

    // 正肖
    ZHENG_XIAO(1151190L, "正肖"),
    ZHENG_XIAO_SHU(1151101L, "正肖-鼠"),
    ZHENG_XIAO_NIU(1151102L, "正肖-牛"),
    ZHENG_XIAO_HU(1151103L, "正肖-虎"),
    ZHENG_XIAO_TU(1151104L, "正肖-兔"),
    ZHENG_XIAO_LONG(1151105L, "正肖-龙"),
    ZHENG_XIAO_SHE(1151106L, "正肖-蛇"),
    ZHENG_XIAO_MA(1151107L, "正肖-马"),
    ZHENG_XIAO_YANG(1151108L, "正肖-羊"),
    ZHENG_XIAO_HOU(1151109L, "正肖-猴"),
    ZHENG_XIAO_JI(1151110L, "正肖-鸡"),
    ZHENG_XIAO_GOU(1151111L, "正肖-狗"),
    ZHENG_XIAO_ZHU(1151112L, "正肖-猪"),

    // 五行
    WU_XING_JIN(1161101L, "金"),
    WU_XING_MU(1161102L, "木"),
    WU_XING_SHUI(1161103L, "水"),
    WU_XING_HUO(1161104L, "火"),
    WU_XING_TU(1161105L, "土"),

    // 自选不中
    ZI_XUAN_BU_ZHONG_5(1171101L, "自选不中-5"),
    ZI_XUAN_BU_ZHONG_6(1171102L, "自选不中-6"),
    ZI_XUAN_BU_ZHONG_7(1171103L, "自选不中-7"),
    ZI_XUAN_BU_ZHONG_8(1171104L, "自选不中-8"),
    ZI_XUAN_BU_ZHONG_9(1171105L, "自选不中-9"),
    ZI_XUAN_BU_ZHONG_10(1171106L, "自选不中-10"),
    ZI_XUAN_BU_ZHONG_11(1171107L, "自选不中-11"),
    ZI_XUAN_BU_ZHONG_12(1171108L, "自选不中-12");

    private long value;
    private String desc;

    public long value() {
        return value;
    }

    public String desc() {
        return desc;
    }

    LotteryMark6DoubleType(Long value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    private static Map<Long, LotteryMark6DoubleType> maps = new HashMap<>();

    static {
        for (LotteryMark6DoubleType type : LotteryMark6DoubleType.values())
            maps.put(type.value(), type);
    }

    public static LotteryMark6DoubleType parse(long value) {
        return maps.get(value);
    }

}
