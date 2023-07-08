import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class seminar3dz3 {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        String[] str = new String[]{ "Меркурий", "Венера", "Земля","Марс", "Юпитер", "Сатурн", "Уран","Нептун","Плутон"};
        addList(arr, str);
        System.out.println(arr);
        List newArr = new ArrayList<>();
        count(arr,str,newArr);
        System.out.println(newArr);


    }
    static void addList(List myList,String[] str){
        for (int i = 0; i < 10; i++) {
            int temp = (int) (Math.random() * ((8) + 1));
            myList.add(str[temp]);
        }
    }

    static void count(List myList,String[] str,List newArr){
        for (int i = 0; i < str.length; i++) {
            List temp = new ArrayList<>();
            temp.add(0,str[i]);
            temp.add(1,Collections.frequency(myList,str[i]));
            newArr.add(temp);


        }
    }
}
