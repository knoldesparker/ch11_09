import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Integer elements[]={1,2,3,5,8};
        Integer elements2[]={1,3,5};
        Set<Integer> numberList = new HashSet<>(Arrays.asList(elements));
        Set<Integer> emptyList = new HashSet<>();
        Set<Integer> oddList = new HashSet<>(Arrays.asList(elements2));

        hasEven(numberList);
        hasEven(emptyList);
        hasEven(oddList);
    }

    public static boolean hasEven(Set<Integer> intSet){
        boolean resault = false;

        for (int i :intSet){
            if(i % 2 ==0){
                System.out.println("True");
                return true;

            }
        }
     if(intSet.isEmpty()){
         System.out.println("List is empty");
            return false;
     }
        System.out.println("contains odd");
     return false;

    }
}
