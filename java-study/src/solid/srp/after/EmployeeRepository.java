package solid.srp.after;

// SRP(단일책임원칙) 적용 전
// 직원 정보를 저장하고, 직원에게 이메일을 보내는 두 가지 책임을 가지고 있음
public class EmployeeRepository {
    // 데이터베이스에 관련된 하나의 책임만 가짐.
    // 데이터베이스에서 직원 정보를 저장하는 로직
    public void save(Employee employee) {
        System.out.println("직원 정보 저장");
    }
}
