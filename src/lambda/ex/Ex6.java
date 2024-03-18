package lambda.ex;

import java.util.function.Function;

public class Ex6 {
    /*
    연습문제: 학생 성적 평균 계산하기

    요구사항
    주어진 코드를 바탕으로, 학생들의 영어와 수학 평균 점수를 계산하는 프로그램을 작성하세요. 프로그램은 다음 요구사항을 충족해야 합니다.

    Student 클래스 정의:
    Student 클래스에는 학생의 이름(String), 영어 점수(int), 수학 점수(int)를 필드로 가집니다.
    Student 클래스는 생성자를 통해 이러한 정보를 초기화할 수 있어야 합니다.
    getEnglishScore() 메서드와 getMathScore() 메서드를 통해 각각의 점수를 반환할 수 있어야 합니다.

    평균 점수 계산:
    avg(Function<Student> function) 메서드는 Function<Student, Integer> 함수형 인터페이스를 매개변수로 받아, 학생들의 평균 점수를 계산합니다.
    avg 메서드는 모든 학생들에 대해 주어진 함수형 인터페이스를 적용한 후, 그 결과값들의 평균을 반환합니다.

    프로그램 실행:
    메인 메서드에서는 두 학생의 정보를 Student 배열에 저장합니다.
    영어 점수의 평균과 수학 점수의 평균을 각각 계산하여 출력합니다

    입력 데이터 :
    Student[] students = {
            new Student("홍길동", 90, 96),
            new Student("이몽룡", 95, 93)
        };

    출력 예시 :
    영어 평균 점수: 92.5
    수학 평균 점수: 94.5
     */
    public static void main(String[] args) {
        Student[] students = {
                new Student("홍길동", 90, 96),
                new Student("이몽룡", 95, 93)
        };

//        double avgEnglish = avg(students, (student) -> {
//            return student.getEnglishScore();
//        });
//        double avgMath = avg(students, (student) -> {
//            return student.getMathScore();
//        });

        // 함수를 매개변수로 받으면서 다양한 필드의 평균값을 계산할 수 있음.
        // 메서드 참조를 사용해서 축약
        double avgEnglish = avg(students, Student::getEnglishScore);
        double avgMath = avg(students, Student::getMathScore);

        System.out.println("영어 평균 = " + avgEnglish);
        System.out.println("수학 평균 = " + avgMath);
    }

    static double avg(Student[] students, Function<Student, Integer> function) {
        // 전체를 더해서
        int sum = 0;
        for (Student student : students) {
            sum += function.apply(student);
        }
        // 전체 길이만큼 나누면 평균
        double avg = (double) sum / students.length;
        return avg;
    }

    static class Student {
        private String name;
        private int englishScore;
        private int mathScore;

        public Student(String name, int englishScore, int mathScore) {
            this.name = name;
            this.englishScore = englishScore;
            this.mathScore = mathScore;
        }

        public int getEnglishScore() {
            return englishScore;
        }

        public int getMathScore() {
            return mathScore;
        }
    }
}