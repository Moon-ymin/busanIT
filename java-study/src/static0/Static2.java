package static0;

import access_modifier.second.C;

import static static0.Obj.count;

public class Static2 {
    public static void main(String[] args) {
        /*
        // 일반적인 방법으로 필드에 갯수 정보가 생성될때마다 공유되지 않는다
        Obj obj1 = new Obj("A");
        System.out.println(obj1.count); // 1
        Obj obj2 = new Obj("B");
        System.out.println(obj2.count); // 1
        Obj obj3 = new Obj("C");
        System.out.println(obj3.count); // 1

        // 각각의 객체가 가지고 있는 별개의 객체 count라서
        // 생성되는 전체 객체의 수가 출력되지 않음
        */

        /*
        // 외부에서 생성될 때마다 카운터 객체를 주입하여 개수를 센다
        Counter counter = new Counter();
        Obj obj1 = new Obj("A", counter);
        System.out.println(counter.count); // 1
        Obj obj2 = new Obj("B", counter);
        System.out.println(counter.count); // 2
        Obj obj3 = new Obj("C", counter);
        System.out.println(counter.count); // 3
        */

        // static 키워드를 적용하게 될 경우
        Obj obj1 = new Obj("A");
        System.out.println(count); // 1
        Obj obj2 = new Obj("B");
        System.out.println(count); // 2
        Obj obj3 = new Obj("C");
        System.out.println(count); // 3

        // static 필드(=클래스 변수)는 클래스를 통해 접근 가능
        System.out.println("객체의 갯수 : "+ Obj.count);

    }
}
