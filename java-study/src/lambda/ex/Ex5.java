package lambda.ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ex5 {

    public static void main(String[] args) {
        List<Person> attendees = Arrays.asList(
                new Person("둘리", 22),
                new Person("희동이", 3),
                new Person("마이콜", 25),
                new Person("영희", 16)
        );

        Consumer<Person> welcome = (person) ->
                System.out.println("Welcome, " + person.getName() + "!");
        // 리스트의 각 요소에 Consumer.accept() 적용
        attendees.forEach(welcome);

        // - Predicate<Person>를 사용하여 특정 조건(예: 나이가 18세 이상)을 만족하는 참석자를 필터링
        Predicate<Person> isAdult = (person) -> person.getAge() >= 18;
        for(Person attendee : attendees){
            if (isAdult.test(attendee)){
                System.out.println(attendee.getName() + ", 18세 이상");
            }
        }
        // Function<Person, String>을 사용하여 참석자의 이름을 반환하세요.
        Function<Person, String> getNameFunction = Person::getName; // person -> person.getName();
        Supplier<List<String>> inviteListSupplier =
                ArrayList::new; // 생성자 참조
//        () -> { return new ArrayList<>(); };
        List<String> invitelist = inviteListSupplier.get();

        // 참석자 명단을 순회하며
        for(Person attendee : attendees){
            // 참석자 명단에서
            // 18세 이상인 경우만 필터링해서
            if (isAdult.test(attendee)) {
                // 새로운 초대명단에 추가할 것
                invitelist.add(getNameFunction.apply(attendee));
            }
        }

        // 초대명단 출력
        System.out.println(invitelist);


    }
}
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
