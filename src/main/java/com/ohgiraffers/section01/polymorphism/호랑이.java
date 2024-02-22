package com.ohgiraffers.section01.polymorphism;

public class 호랑이 extends 동물{

    @Override
    public void 먹기 () {
        System.out.println("호랑이가 고기를 뜯어 먹습니다..");
    }
    @Override
    public void 달리기() {
        System.out.println("호랑이는 웬만해서는 달리지않습니다. 어슬렁~~");
    }
    @Override
    public void 울기() {
        System.out.println("호랑이가 울부짖습니다. ㅇ어흐으으응");
    }
    public void 물엉뜯기() {
        System.out.println("호랑이가 물어 뜯습니다..앙!!");
    }

}
