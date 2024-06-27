package collection.set.compare;

public class Person implements Comparable<Person>{ // 자기 자신(Person)과 다른 Person과 비교를 하겠다
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "이름 : %s, 나이 : %d".formatted(name, age);
    }

    @Override
    public int compareTo(Person other) {
        // 나이 기준으로 정수 비교 : 음수, 0, 양수
//        return this.age - other.age;
        int ageCompared = Integer.compare(this.age, other.age);
        // 나이가 같을 경우 이름순(2)으로 비교
        if (ageCompared == 0) {
            int nameCompared = this.name.compareTo(other.name);
            return nameCompared;
        }
        // 나이가 다르면 나이순(1) 비교
        return ageCompared;
    }
}
