package library.lang.ex;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {

        String explorerName = "김우주";
        int planetsDiscovered = 7;
        double averageDiscoveryYear = 2.5;

        String str = String.format("탐험가 %s는 총 %d개의 행성을 발견했으며," +
                        " 평균 %.1f년에 한 번씩 새로운 행성을 발견했습니다.",
                explorerName, planetsDiscovered, averageDiscoveryYear );
        System.out.println(str);
    }
}
