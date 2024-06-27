package generic.wildcard;

public class Course {
    // 타입 파라미터 ?(와일드카드)는 해당 범위에 있는 모든 타입으로 대체 가능
    // 모든 사람이 등록 가능한 코스
    void registerCourse1(Applicant<?> applicant) {
        System.out.println("모두의 과정 등록");
    }

    void registerCourse2(Applicant<? extends Student> applicant) {
        System.out.println("학생만 등록 가능한 과정 등록");
    }

    void registerCourse3(Applicant<? super Worker> applicant) {
        System.out.println("직장인 또는 일반인만 등록 가능한 과정 등록");
    }
}
