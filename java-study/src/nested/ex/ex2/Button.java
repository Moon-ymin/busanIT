package nested.ex.ex2;

public class Button {
    private OnClickListener listener;

    public void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }

    public void click() {
        if (listener == null) { return; }
        listener.onClick();
    }
}
