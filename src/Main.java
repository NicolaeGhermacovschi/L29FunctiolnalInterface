import task.JoinerImp;
import task2.Joiners;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Functional Interface!");
        JoinerImp<String> stringJoinerImp = new JoinerImp<>();
        System.out.println(stringJoinerImp.join("Buna ziua ","lume"));

        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        Joiners<String> joiners = new Joiners<>();
        System.out.println(joiners.fold(list,stringJoinerImp));

        JoinerImp<Integer> stringJoinerImp1 = new JoinerImp<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println(joiners.fold(list1,stringJoinerImp1));


    }
}