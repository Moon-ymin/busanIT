package quiz.quiz7;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class q1 {
    record Employee(String name, String role, int salary) {}
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "Developer", 5000),
                new Employee("Bob", "Developer", 6000),
                new Employee("Charlie", "Manager", 7000),
                new Employee("David", "Manager", 8000)
        );

        int sum = employees.stream()
                .mapToInt(Employee::salary).sum();
        Map<String, Double> avgSalary = employees.stream()
                .collect(Collectors.groupingBy(Employee::role,
                        Collectors.averagingDouble(Employee::salary)));

        System.out.println("총 급여 : "+sum);
        System.out.println("Developer 평균 급여: "+ avgSalary.get("Developer"));
        System.out.println("Manager 평균 급여: " + avgSalary.get("Manager"));

    }
}
