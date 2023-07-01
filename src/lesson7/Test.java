package lesson7;

import java.sql.SQLOutput;
import java.util.*;

public class Test {
    public static void main(String[] args) {

        /*ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        list.add(0, 5);

        System.out.println(list);

        list.remove(Integer.valueOf(5));

        System.out.println(list);

        System.out.println(list.contains(1));

        System.out.println(list.size());

        System.out.println(list.get(0));



        Random random = new Random();

        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i=0;i<100;i++) {
            int n = random.nextInt(1000);
            list2.add(n);
        }
        System.out.println(list2);

        System.out.println("---------------");
        System.out.println("---------------");
        System.out.println("---------------");

        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i=0;i<100;i++) {
            int n = random.nextInt(2000);
            list3.add(n);
        }

        System.out.println(list3);

        System.out.println("---------------");
        System.out.println("---------------");
        System.out.println("---------------");

        list2.removeAll(list3);

        System.out.println("---------------");
        System.out.println("---------------");
        System.out.println("---------------");

        System.out.println(list2);*/

        String s = "157";


    }


    public static void sort(ArrayList<Integer> list) {

        for (int i=0;i<list.size();i++) {
            for (int k=i+1; k<list.size();k++) {
                if (list.get(k) < list.get(i)) {
                    int temp = list.get(i);
                }
            }
        }
    }


}
