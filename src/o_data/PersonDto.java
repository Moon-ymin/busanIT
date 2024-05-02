package o_data;

import java.util.Objects;

// DTO 생성시 IDE 활용을 통해 만들 수 있고
// lombok (공통되는 부분을 애노테이션으로 대체) 라이브러리 활용 가능
// 코드가 길어지거나, 애노테이션 통해 추가처리 (라이브러리 의존)

public class PersonDto {
    private String name;
    private int age;

    public PersonDto(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public PersonDto() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonDto personDto = (PersonDto) o;
        return age == personDto.age && Objects.equals(name, personDto.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "PersonDto{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
