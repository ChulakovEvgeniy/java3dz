import java.util.ArrayList;
import java.util.List;

public class seminar3dz1 {
    public static void main(String[] args) {
        List<Integer> newArr = new ArrayList<>();
        addList(newArr);
        System.out.println(newArr);
        delete(newArr);
        System.out.println(newArr);

    }
    static void addList(List myList){
        for (int i = 0; i < 10; i++) {
            myList.add((int) (Math.random() * ((10 - 0) + 1)));
        }
    }
    static void delete(List myList){
        for (int i = 0; i < myList.size(); i++) {
            if ((int)myList.get(i) % 2 == 0) {
                myList.remove(i);
                i--;
            }
        }
    }
}
