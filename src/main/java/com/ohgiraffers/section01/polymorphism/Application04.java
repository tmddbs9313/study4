package com.ohgiraffers.section01.polymorphism;

public class Application04 {

    public static void main(String[] args) {

        /*수업목표. 다형성을 적용해서 리턴타입에 활용할 수 있다.*/

        /*목차. 랜덤동물() 메소드 추가*/

        /*목차.1. 랜덤동물() 호출*/
        Application04 app4 = new Application04();

        동물 randomAnimal = app4.랜덤동물();
        // 동물 random = new 토끼( 토끼나 호랑이 랜덤동물에 대입. return은 값을 가지고 돌아가기 때문)

        randomAnimal.울기();

    }
    public 동물 랜덤동물() {  //동물이라는 class를 자료형으로 쓴다.

        int 랜덤  = (int)(Math.random() * 2) ;  //2는 숫자를 두개쓸거다라는 범위.뒤에 +0이 생략되어있음

        return  랜덤 == 0 ? new 토끼() : new 호랑이();  //0이면 토끼 아니면 호랑이
        //토끼는 동물이면서 토끼, 호랑이도 동물이면서 호랑이라 다형성 적용.


    }

}
