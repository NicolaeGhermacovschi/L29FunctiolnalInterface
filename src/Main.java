import task.Joiner;
import task2.Joiners;

import java.util.ArrayList;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Functional Interface!");

        Joiner<String> joiners1 = (t1, t2) -> t1 + " " + t2;

        System.out.println(joiners1.join("Buna ziua", "lume"));

        //============Task 2===========================

        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        String resul1 = Joiners.fold(list, String::concat, () -> " ");
        System.out.println(resul1);


        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        Integer restul2 = Joiners.fold(list1, Integer::sum, () -> 0);
        System.out.println(restul2);


        //===============functional interface===============================
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("ab");
        list2.add("cd");
        list2.add("df");
        list2.add("eg");
        list2.add("hnLL");

        Supplier<ArrayList<String>> s1 = ArrayList<String>::new;
        ArrayList<String> arrayList = s1.get();
        arrayList.add("df");
        arrayList.add("eg");
        arrayList.add("hnLL");
        System.out.println(arrayList);

        System.out.println("===========================");
        Supplier<String> stringSupplier;

        Consumer<String> consumer = s -> s.length();
        consumer.accept("test");
        System.out.println( "--");


        BiFunction<Integer, Integer, Integer> addFunction = (a, b) -> a + b;

        int sum = addFunction.apply(2,5);
        System.out.println(sum);

        System.out.println("prdicate :");
        Predicate<String> p1 = s -> s.isEmpty();

        System.out.println(p1.test("abc"));

        System.out.println("Function :");
        Function<String, Integer> stringIntegerFunction = s -> s.length();
        int length = stringIntegerFunction.apply("hello");
        System.out.println(length);

        BiFunction<String, String, Integer> biFunction = (x,y) -> x.concat(y).length();
        System.out.println(biFunction.apply("apa","mere"));

        System.out.println("Unary Operatoru");
        UnaryOperator<String> u1 = u -> u.toUpperCase();
        System.out.println(u1.apply("avc"));

        BinaryOperator<String> u2 = (a,b ) -> a.concat(b).toUpperCase();
        System.out.println(u2.apply("asa"," ok"));

    }
}