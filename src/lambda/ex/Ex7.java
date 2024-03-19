package lambda.ex;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Ex7 {
    /*
    연습문제 : 직원 필터링

    요구사항: List<Employee>에서 연봉(salary)이 50,000 이상인 직원만 필터링하여
    그 이름을 출력하세요. Predicate와 Consumer를 사용하여 구현하세요.
     Employee 클래스는 이름(name)과 연봉(salary) 필드를 가집니다.

    입력 데이터
    List<Employee> employees = Arrays.asList(new Employee("둘리", 70000),
     new Employee("희동", 40000), new Employee("마이클", 80000));

    출력 예시
    ===
    둘리
    마이클
     */
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(new Employee("둘리", 70000),
                new Employee("희동", 40000), new Employee("마이클", 80000));

        // Predicate 급여가 50000 이상 여부를 확인하는 람다식
        Predicate<Employee> predicate = employee -> employee.getSalary() >= 50_000;

        // Consumer 이름을 출력하는 람다식
        Consumer<Employee> consumer = employee -> System.out.println(employee.getName());

        // 일반적인 반복문을 통한 접근 방법
        for(Employee e : employees){
            if (predicate.test(e)){
                consumer.accept(e);
            }
        }
        // 람다식을 사용하지 않은 경우
        for(Employee employee : employees){
            if (employee.getSalary() >= 50000){
                System.out.println(employee.getName());
            }
        }
        // 스트림 API를 사용하는 경우
        employees                       // 컬렉션 프레임워크에서 (자료 리스트)
                .stream()               // 데이터 흐름을 만들어서
                .filter(predicate)      // 필요한 데이터를 걸러서 (50000 이상)
                .forEach(consumer);     // 출력해라
    }
    static class Employee{
        private String name;
        private int salary;

        public Employee(String name, int salary) {
            this.name = name;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public int getSalary() {
            return salary;
        }
    }
}