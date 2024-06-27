package collection.map.ex;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Ex4 {
    static class Employee{
        String id;
        String name;
        String department;

        public Employee(String id, String name, String department) {
            this.id = id;
            this.name = name;
            this.department = department;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Employee employee = (Employee) o;
            return Objects.equals(id, employee.id) && Objects.equals(name, employee.name) && Objects.equals(department, employee.department);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name, department);
        }
    }

    public static void main(String[] args) {
        Map<Integer, Employee> employee = new HashMap<>();

        // 추가
        employee.put(1, new Employee("001","Alice","개발"));
        employee.put(2, new Employee("002","Bob","디자인"));
        employee.put(3, new Employee("003","Charlie","마케팅"));
        employee.put(4, new Employee("004","Kim","기획"));

        // 조회
        Employee e = employee.get(1);
        System.out.println(e.name);

        // 삭제
        System.out.println(employee.size());
        employee.remove(4);
        System.out.println(employee.size());

        // 모든 직원 정보 출력
        for (Map.Entry<Integer, Employee> m : employee.entrySet()){
            System.out.printf("직원%d: ID \"%s\", 이름 \"%s\", 부서 \"%s\"\n",
                    m.getKey(), m.getValue().id, m.getValue().name, m.getValue().department);
        }


    }
}
