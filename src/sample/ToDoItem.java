package sample;

/**
 * Created by austinhays on 5/31/16.
 */
public class ToDoItem {
    String text;
    Boolean isDone;

    public ToDoItem(String text, Boolean isDone) {
        this.text = text;
        this.isDone = isDone;
    }

    @Override
    public String toString() {
        return "ToDoItem{" +
                "text='" + text + '\'' +
                ", isDone=" + isDone +
                '}';
    }
}
