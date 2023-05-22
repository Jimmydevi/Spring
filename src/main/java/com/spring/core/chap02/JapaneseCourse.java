package com.spring.core.chap02;

public class JapaneseCourse implements Course {
    @Override
    public void combinedMenu() {
        System.out.println("----- 오마카세 메뉴 구성 -----");
        System.out.println("1. 일식 계란찜");
        System.out.println("2. 청어알을 얹은 초밥");
        System.out.println("3. 장어 초밥");
        System.out.println("4. 오뎅");
        System.out.println("5. 금태구이");
        System.out.println("6. 머리찜");
        System.out.println("7. 청포도아이스크림");
    }
}
