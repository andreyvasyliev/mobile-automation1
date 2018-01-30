import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Cat> hmap = new HashMap<String, Cat>();

        hmap.put("Vaska", new Cat("Vaska"));
        hmap.put("Matroskin", new Cat("Matroskin"));
        hmap.put("Leopold", new Cat("Leopold"));
        hmap.put("Grumpy Cat", new Cat("Grumpy Cat"));
        hmap.put("Timophey", new Cat(("Timophey")));
        hmap.put("Murzik", new Cat("Murzik"));
        hmap.put("Leo", new Cat("Leo"));
        hmap.put("Barsik", new Cat("Barsik"));
        hmap.put("Lars", new Cat("Lars"));
        hmap.put("Ryzhik", new Cat("Ryzhik"));

        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.println("key is: "+ mentry.getKey() + " & Value is: " + mentry.getValue());
        }
    }
}
