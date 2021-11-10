public class PhanTu<T extends Comparable<T>> {

    private T t;

    public T getT() {
        return this.t;
    }

    public void setT(T tee) {
        this.t = tee;
    }
    
    public boolean isGreaterThan(T a) {
        return t.compareTo(a) > 0;
    }



}
