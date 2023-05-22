package com.spring.core.chap01;

import com.spring.core.chap01.ChineseChef;
import com.spring.core.chap01.ChineseCourse;
import com.spring.core.chap01.Restaurant;

public class FusionRestaurant implements Restaurant {
    // 셰프
    private Chef chef;
    //요리코스
    private Course course;
    public FusionRestaurant(){
        chef = new ChineseChef();
        course = new ChineseCourse();
    }

    @Override
    public void order() {
        System.out.println("여기는 퓨전 레스토랑 입니다.");
        course.combinedMenu();
        chef.cook();
    }
}
