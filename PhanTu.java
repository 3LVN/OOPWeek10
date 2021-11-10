public class PhanTu<T extends Comparable<T>> {

    private T t;

    public boolean isGreaterThan(T a) {
        return t.compareTo(a) > 0;
    }
    


}
