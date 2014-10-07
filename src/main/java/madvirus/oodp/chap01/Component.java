package madvirus.oodp.chap01;

public class Component {

    private OnClickListener listener;
    private String id;

    public Component(String id) {
        this.id = id;
    }

    public void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }

    public String getId() {
        return id;
    }
}
