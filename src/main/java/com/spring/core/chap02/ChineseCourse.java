package com.spring.core.chap02;

public class ChineseCourse implements Course {
    @Override
    public void combinedMenu() {
        System.out.println("----- 중식 코스 요리 구성 -----");
        System.out.println("1. 샥스핀 스프");
        System.out.println("2. 냉채");
        System.out.println("3. 황금계란볶음밥");
        System.out.println("4. 유린기");
        System.out.println("5. 탕수육");
        System.out.println("6. 전가복");
        System.out.println("7. 만두");
    }
}
