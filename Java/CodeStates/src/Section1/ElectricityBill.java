package Section1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        System.out.println("=========================");
        System.out.println("주택용 전기요금(저압) 계산기");
        System.out.println("=========================");
        Scanner sc = new Scanner(System.in);
        int finalCharge;

        while (true) {
            //입력 받을 값 : 사용량(kWh), 사용기간(월)
            System.out.println("프로그램을 종료하려면 0을 입력하세요.");
            System.out.println("요금 계산할 달을 입력하세요.(1~12월)");
            int month = sc.nextInt();
            if (month == 0) System.exit(1);
            if (month < 0 || month > 12) {
                System.out.println("잘못 입력하셨습니다. 1 ~ 12월 사이로 입력해주세요.");
                continue;
            }
            System.out.println("사용량을 입력하세요.(kWh)");
            int usage = sc.nextInt();
            if (usage <= 0) {
                System.out.println("잘못 입력하셨습니다. 1 이상의 정수로 입력해주세요.");
                continue;
            }

            //하계와 기타계절로 구분해서 요금 책정
            switch (month) {
                case 7:
                case 8:
                    //청구금액(finalCharge) = sum(전기요금계, 부가세, 기반기금) (일의 자리에서 버림)
                    finalCharge = summerSeasons(usage) + vatMethod(summerSeasons(usage)) + baseFundMethod(summerSeasons(usage));
                    finalCharge = finalCharge - (finalCharge % 10);
                    break;
                default:
                    finalCharge = otherSeasons(usage) + vatMethod(otherSeasons(usage)) + baseFundMethod(otherSeasons(usage));
                    finalCharge = finalCharge - (finalCharge % 10);
                    break;
            }

            DecimalFormat df = new DecimalFormat("###,###");
            System.out.println("청구 금액 : " + df.format(finalCharge) + "원");
        }
    }

    //하계(7,8월)
    //300kWh 이하 : 기본요금(원) 910, 전력량 요금(원/kWh) 112.0
    //301~450kWh  : 기본요금(원) 1600, 전력량 요금(원/kWh) 206.6
    //450kWh 초과 : 기본요금(원) 7300, 전력량 요금(원/kWh) 299.3
    public static int summerSeasons(int usage) {
        //사용량(usage), 기본요금(bCharge), 전력량 요금(electricCharge)
        int bCharge, electricCharge, electricMeter = 0;
        //기후환경요금(eCharge) = 사용량 * 9
        //연료비조정요금(fCharge) = 사용량 * 5
        int eCharge = usage * 9;
        int fCharge = usage * 5;

        if (usage <= 300) {
            bCharge = 910;
            electricCharge = (int) Math.floor(usage * 112.0);
        } else if (usage >= 301 && usage <= 450) {
            bCharge = 1600;
            electricCharge = (int) Math.floor((300 * 112.0) + ((usage - 300) * 206.6));
        } else {
            bCharge = 7300;
            electricCharge = (int) Math.floor((300 * 112.0) + (150 * 206.6) + ((usage - 450) * 299.3));
        }

        //전기요금계(electricMeter) = sum(기본요금, 전력량 요금, 기후환경요금, 연료비조정요금)
        electricMeter = bCharge + electricCharge + eCharge + fCharge;

        return electricMeter;
    }

    //기타 계절(7,8월 제외)
    //200kWh 이하 : 기본요금(원) 910, 전력량 요금(원/kWh) 112.0
    //201~400kWh  : 기본요금(원) 1600, 전력량 요금(원/kWh) 206.6
    //400kWh 초과 : 기본요금(원) 7300, 전력량 요금(원/kWh) 299.3
    public static int otherSeasons(int usage) {
        //사용량(usage), 기본요금(bCharge), 전력량 요금(electricCharge)
        int bCharge, electricCharge, electricMeter = 0;
        //기후환경요금(eCharge) = 사용량 * 9
        //연료비조정요금(fCharge) = 사용량 * 5
        int eCharge = usage * 9;
        int fCharge = usage * 5;

        if (usage <= 200) {
            bCharge = 910;
            electricCharge = (int) Math.floor(usage * 112.0);
        } else if (usage >= 201 && usage <= 400) {
            bCharge = 1600;
            electricCharge = (int) Math.floor((200 * 112.0) + ((usage - 200) * 206.6));
        } else {
            bCharge = 7300;
            electricCharge = (int) Math.floor((200 * 112.0) + (200 * 206.6) + ((usage - 400) * 299.3));
        }

        //전기요금계(electricMeter) = sum(기본요금, 전력량 요금, 기후환경요금, 연료비조정요금)
        electricMeter = bCharge + electricCharge + eCharge + fCharge;

        return electricMeter;
    }

    public static int vatMethod(int electricMeter) {
        //부가세(vat) = 전기요금계 * 0.1 (소수 첫 째 자리에서 반올림)
        return (int) Math.round(electricMeter * 0.1);
    }

    public static int baseFundMethod(int electricMeter) {
        //기반기금(baseFund) = 전기요금계 * 0.037 (일의 자리에서 버림)
        return (int)(Math.floor((electricMeter * 0.037) / 10) * 10);
    }
}