
package arraylistExample;

import java.util.ArrayList;
import java.util.Arrays;

public class example2 {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();
        names.add("Huy1");
        names.add("Huy2");
        names.add("Huy3");
        System.out.println("name[]=" +Arrays.toString(names.toArray()));
        System.out.println("name[0]=" +names.get(0));
        System.out.println(names.remove("Huy2"));
        System.out.println(names.remove(1));
        System.out.println(Arrays.toString(names.toArray()));
        
    }
}
