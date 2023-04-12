package task2;

import task.Joiner;

import java.util.ArrayList;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

public class Joiners {


    public static <T> T fold(ArrayList<T> list, BinaryOperator<T> operator, Supplier<T> supplier) {

       T restul = supplier.get();

       if(restul instanceof String) {
           StringBuilder stringBuilder = new StringBuilder();

           for(T element : list){
               stringBuilder.append(operator.apply(restul,element));
           }
           return (T) stringBuilder.toString();
       } else {
           for(T element : list){
               restul =  operator.apply(restul,element);
           }
       }






        return restul;
    }


}
