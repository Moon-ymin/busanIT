package collection.map.ex;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Ex4_1 {
    // 정보 추가해서 넣는 문제 (변형 문제)
    static class Employee {
        String id;
        String name;

        public Employee(String id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Employee employee = (Employee) o;
            return Objects.equals(id, employee.id);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
    public static void main(String[] args) {
        HashMap<Employee, String> hashMap = new HashMap<>();

        hashMap.put(new Employee("001", "Alice"), "개발");
        hashMap.put(new Employee("002", "Bob"), "디자인");
        hashMap.put(new Employee("003", "Charlie"), "마케팅");
        hashMap.put(new Employee("001", "Damon"), "개발"); // Key가 같은 경우 중복으로 판단

        System.out.println("hashMap = " + hashMap);

        for (Map.Entry<Employee, String> employeeStringEntry : hashMap.entrySet()) {
            System.out.println(employeeStringEntry);
        }

        // 조회
        String bobDepartment = hashMap.get(new Employee("002", "Bobby"));   // hashCode 동등성 비교로 key를 확인

        System.out.println("bobDepartment = " + bobDepartment);

        // 삭제
        hashMap.remove(new Employee("003", "Charlse"));

        for (Map.Entry<Employee, String> employeeStringEntry : hashMap.entrySet()) {
            System.out.println(employeeStringEntry);
        }
    }
}
