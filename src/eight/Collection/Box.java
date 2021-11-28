package eight.Collection;
//T - generički tip uveden na nivou klase BOX

public class Box<T> {
    private T field;

    public T getField() {
        return field;
    }

    public void setField(T field) {
        this.field = field;
    }
}
