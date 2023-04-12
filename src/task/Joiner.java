package task;

@FunctionalInterface
public interface Joiner<T> {
    T join(T t1, T t2);
}
