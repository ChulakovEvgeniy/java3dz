import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class seminar3dz2 {
    public static void main(String[] args) {
        List<Integer> newArr = new ArrayList<>();
        addList(newArr);
        System.out.println(newArr);
        System.out.println("максимум = " + Collections.max(newArr) );
        System.out.println("минимум = " + Collections.min(newArr) );
        System.out.println("среднее = " + average(newArr) );

    }

    static void addList(List myList){
        for (int i = 0; i < 10; i++) {
            myList.add((int) (Math.random() * ((10 - 0) + 1)));
        }
    }

    static double average(List myList){
        double summ = 0;
        for (int i = 0; i < myList.size(); i++) {
            summ += (int)myList.get(i);
        }
        summ /= myList.size();
        return summ;
    }
}
