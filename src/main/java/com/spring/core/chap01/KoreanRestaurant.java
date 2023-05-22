package com.spring.core.chap01;

public class KoreanRestaurant implements Restaurant{
    //셰프도 레스토랑 소속
    private Chef chef = new KoreanChef();
    //코스요리 메뉴도 레스토랑 소속
    private Course course = new KoreanCourse();

    public KoreanRestaurant() {
        this.chef = new KoreanChef();
        this.course = new KoreanCourse();
    }
    @Override
    public void order() {
        System.out.println("한국 요리를 주문합니다.");
        course.combinedMenu();
        chef.cook();
    }
}
