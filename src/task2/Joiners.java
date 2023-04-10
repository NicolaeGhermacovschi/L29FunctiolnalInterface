package task2;

import task.JoinerImp;

import java.util.ArrayList;

public class Joiners<T> {


    public T fold(ArrayList<String> list, JoinerImp<String> joiner) {

       T ras = list.get(0);
        for (int i = 1; i < list.size(); i++) {

            ras = joiner.join(ras,list.get(i));

        }


        return ras;
    }
}
