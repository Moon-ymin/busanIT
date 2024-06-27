package generic;

public class Generic5 {
    // 제네릭 인터페이스
    // 정의 : 인터페이스 이름 뒤에 <T> 와 같이 매개변수 추가하여 정의
    // 제네릭 인터페이스를 구현하는 클래스는 T에 대한 구체적 타입 제공 필요
    interface Container<T> {
        void put(T item);
        T get();
    }
    static class GenericContainer<T> implements Container<T> {
        T item;

        @Override
        public void put(T item) {
            this.item = item;
        }

        @Override
        public T get() {
            return item;
        }
    }

    public static void main(String[] args) {
        Container<Integer> intContainer = new GenericContainer<>();
        intContainer.put(100);
        Integer i = intContainer.get();
        System.out.println("i = " + i);

        Container<String> stringContainer = new GenericContainer<>();
        stringContainer.put("문자열");
        String s = stringContainer.get();
        System.out.println("s = " + s);


    }
}
