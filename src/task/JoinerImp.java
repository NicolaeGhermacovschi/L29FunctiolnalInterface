package task;

public class JoinerImp<T>  implements  Joiner<T>{
    @Override
    public T join(T t1, T t2) {


        T i = (T) (t1 + " " + t2);
        return i;
    }
}
