package quiz.quiz4;

public class Quiz4 {
    public static void main(String[] args) {
        DataProcessor<String> str = new StringDataProcessor();
        DataProcessor<Integer> num = new NumberDataProcessor();

        System.out.println(str.processData("hello generics"));
        System.out.println(num.processData(100));

    }
}

interface DataProcessor<T>{
    T processData(T data);
}
class StringDataProcessor implements DataProcessor<String>{
    @Override
    public String processData(String data) {
        return data.toUpperCase();
    }
}
class NumberDataProcessor implements DataProcessor<Integer>{
    @Override
    public Integer processData(Integer data) {
        return 2*data;
    }
}


