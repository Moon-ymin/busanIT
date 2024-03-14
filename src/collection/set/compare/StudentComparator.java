package collection.set.compare;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    // 필드
    private SortBy sortBy;
    private SortDirection sortDirection;

    // 중첩 클래스 (Enum)
    public enum SortBy {STUDENT_NO, NAME, AGE, HEIGHT}; // 정렬기준
    public enum SortDirection { ASC, DESC };            // 정렬순서

    // 생성자
    public StudentComparator(SortBy sortBy, SortDirection sortDirection) {
        this.sortBy = sortBy;
        this.sortDirection = sortDirection;
    }

    // 메서드 : 비교 기준
    @Override
    public int compare(Student s1, Student s2) {
        // 비교기준에 따라 결과를 음수, 0, 양수의 정수로 변환
        int compareResult = 0;
        switch (sortBy) {
            case STUDENT_NO -> compareResult = s1.getStudentNo() - s2.getStudentNo();
            case NAME -> compareResult = s1.getName().compareTo(s2.getName());
            case AGE -> compareResult = s1.getAge() - s2.getAge();
            case HEIGHT -> compareResult = Double.compare(s1.getHeight(),s2.getHeight());
        }
        // 내림차순일 경우 양수와 음수를 스위칭한다.
        if (sortDirection == SortDirection.DESC) compareResult *= -1;
        return compareResult;
    }
}
