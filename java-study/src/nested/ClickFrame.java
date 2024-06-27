package nested;

// GUI 컴포넌트를 사용 (Swing)
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// JFrame을 상속받는 클래스 정의
public class ClickFrame extends JFrame {
    // 생성자
    public ClickFrame(){
        // 프레임에 버튼을 생성하고, 버튼을 클릭할 시,
        // 내부 클래스의 이벤트 리스너에서 구현된 메서드가 실행할 수 있도록 추가
        JButton button = new JButton("클릭 해보세요");
        button.addActionListener( new ButtonClickListener() );

        // 프레임 내부 GUI 구현
        this.add(button);
        this.setSize(300, 300);
        this.setVisible( true );
    }

    // 내부 클래스를 정의하고, ActionListener를 구현
    class ButtonClickListener implements ActionListener {
        // 클릭 되었을 때 실행되는 메서드
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("버튼이 클릭되었어요.");
        }
    }

    public static void main(String[] args) {
        new ClickFrame();
    }
}
