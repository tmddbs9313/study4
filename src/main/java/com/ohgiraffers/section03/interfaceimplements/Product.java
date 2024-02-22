package com.ohgiraffers.section03.interfaceimplements;

public class Product extends Object implements InterProduct {  //다중 상속 받을 수 있다
    @Override
    public void nonStaticMethod() {

        System.out.println("InterProduct의 nonStaticMethod 오버라이딩한 메소드 호출됨...");
    }

    @Override
    public void abMethod() {

        System.out.println("InterProduct의 absMethod 오버라이딩한 메소드 호출됨...");

    }

    /*필기. static 메소드는 오버라이딩 할 수 없다.*/
//    @Override
//    public static void staticMethod() {}

    /*필기. 클래스에서 인터페이스를 상속받을때에는 implements 키워드를 사용한다.
    *  또한 인터페이스는 여러개를 상속 받을 수 있다(다중 상속)
    *  extends 로 다른 클래스를 상속받는 경우에도 그것과 별개로 인터페이스도 추가 상속이 가능하다.
    *  단, extends 키워드를 앞에 작성하고 implements를 뒤로 작성해야한다. (아니면 에러 발생)*/


}
