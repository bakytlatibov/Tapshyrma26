public class Box <T,T1>{
    private T height;
    private T1 length;

    public Box(T height, T1 length) {
        this.height = height;
        this.length = length;
    }

    public T getHeight() {
        return height;
    }

    public void setHeight(T height) {
        this.height = height;
    }

    public T1 getLength() {
        return length;
    }

    public void setLength(T1 length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Box{" +
                "height=" + height +
                ", length=" + length +
                '}';
    }
    public  static <E> E  box(E obj){
        return obj;

    }
}
