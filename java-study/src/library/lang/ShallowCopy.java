package library.lang;

// Clone은 기본적으로 얕은 복사
public class ShallowCopy implements Cloneable {
    int[] array;

    public ShallowCopy(int[] array) {
        this.array = array;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}


