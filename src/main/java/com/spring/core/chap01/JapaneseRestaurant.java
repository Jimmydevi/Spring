package com.spring.core.chap01;

public class JapaneseRestaurant implements Restaurant{
    //셰프 선언
    private Chef chef;
    //코스 선언
    private Course course;

    public JapaneseRestaurant(){
        this.chef = new JapaneseChef();
        this.course = new JapaneseCourse();
    }
    @Override
    public void order() {
        System.out.println("일본요리를 준비합니다.");
        course.combinedMenu();
        chef.cook();
    }
}
