package library.lang;

// 깊은 복사
public class DeepCopy implements Cloneable {
    int[] array;
    String str;         // 깊은 복사시 참조값 주의
    int[][] deepArray = {{1,2,3}, {4,5,6}};      // 차원이 높아질수록 모두 깊은 복사해야 함.
    String[] strArray;  // 참조 차원마다 복사해야 함

    public DeepCopy(int[] array) {
        this.array = array;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        DeepCopy cloned = (DeepCopy) super.clone();
        // 내부 필드의 참조값(배열, 참조타입 등)을 다시 한 번 복사해야 됨.
        cloned.array = this.array.clone();
        // 2차원 배열의 복제 : 배열의 차원마다 모두 복제해야 함
        cloned.deepArray = this.deepArray.clone();
        for (int i = 0; i < deepArray.length; i++) {
            cloned.deepArray[i] = this.deepArray[i].clone();
        }
        return cloned;
    }
}