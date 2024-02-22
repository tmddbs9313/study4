package com.ohgiraffers.section01.polymorphism;

public class 토끼 extends 동물{

    @Override
    public void 먹기() {
        System.out.println("토끼가 풀을 뜯어 먹고 있습니다 챱챱");
    }

    @Override
    public void 달리기() {
        System.out.println("토끼가 깡총~깡총 뛰어다닙니다");
    }

    @Override  //부모꺼여서 씀
    public void 울기() {
        System.out.println("토끼가 울음소리를 냅니다.끼잉~끼잉..");
    }//토끼는 부모클래스를 재정의함.

    public static void 점프() {
        System.out.println("토끼가 점프를 합니다.점~핑~~!");
    }

}
