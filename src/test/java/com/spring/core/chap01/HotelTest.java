package com.spring.core.chap01;

import org.junit.jupiter.api.Test;

public class HotelTest {
    @Test
    public void hotelTest() {
        // 테스트 영역에서 @Test가 붙은 메서드를 하나하나 실행하거나
        // 클래스명 왼쪽의 버튼을 이용해 한번 씩 전체적으로 실행할 수 있음.
        // 현재 호텔에는 한식당이 입점해 있음.
        Hotel hotel = new Hotel();
        hotel.inform();
    }
}
