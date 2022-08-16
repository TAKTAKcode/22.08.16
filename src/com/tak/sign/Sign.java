package com.tak.sign;

import java.util.Scanner;

public class Sign {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int retry = sc.nextInt();

        do {
            System.out.print("정숫값 : ");
            int n = sc.nextInt();

            if (n > 0) {
                System.out.println("이 값은 양수입니다.");
            } else if (n < 0) {
                System.out.println("이 값은 음수입니다.");
            } else {
                System.out.println("이 값은 0 입니다.");
            }
            System.out.println("다시 한번? 1-Yes / 0-No : ");
            retry = sc.nextInt();

        } while (retry == 1);
    }
}
