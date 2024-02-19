package class0.ex;

public class Animal {
    String[] category = {"닭","강아지","고양이"};
    String[] name = {"꼬꼬", "엘라", "감자"};
    int[] age = {2, 1, 5};

    void Information(int i) {
        System.out.printf("종류 : %s\n이름 : %s\n나이 : %d살\n",
                category[i], name[i], age[i]);
    }
}
