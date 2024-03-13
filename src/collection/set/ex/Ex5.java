package collection.set.ex;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Ex5 {
    static class Character{
        String id;
        String name;

        public Character(String id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "캐릭터 정보: ID "+id+", 이름 "+name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Character character = (Character) o;
            return Objects.equals(id, character.id) ;
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }
        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        Set<Character> characters = new HashSet<>();
        Character character1 = new Character("char001", "용전사");
        Character character2 = new Character("char002", "엘프궁수");
        Character character3 = new Character("char001", "마법사");

        addCharacter(characters, character1);
        addCharacter(characters, character2);
        addCharacter(characters, character3);

        for (Character character : characters) {
            System.out.println(character);
        }
    }

    private static void addCharacter(Set<Character> characters, Character character) {
        if (!characters.add(character)) {
            System.out.println("중복된 ID로 캐릭터 생성을 시도 했습니다. 존재하는 id : " + character.getId());
        } else {
            System.out.println(character.getName() + " 캐릭터가 생성되었습니다.");
        }
    }

}
