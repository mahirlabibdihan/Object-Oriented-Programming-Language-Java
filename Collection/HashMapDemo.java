// Can contain one null key,any null values
// Not synchronized , not threadsafe
// So we should use ConcurrentHashMap for multi-threading
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Objects;
import java.lang.Object;
class A{
    int x,y;
    A(int x,int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o){
        A a= (A)o;
        return this.x==a.x&&this.y==a.y;
    }

    @Override
    public int hashCode(){
        return Objects.hash(x,y);
    }
}

class HashMapDemo {
    public static void main(String args[]) {
        HashMap<String, Double> balance = new HashMap<>();
        // ConcurrentHashMap balance<String, Double> = new ConcurrentHashMap<>(); // for multi-threading
        String str;
        double bal;

        balance.put("John Doe", 3434.34);
        balance.put("Tom Smith", 123.22);
        balance.put("Jane Baker", null);
        balance.put("Tod Hall", 99.22);
        balance.put("Ralph Smith", -19.08);
        balance.put(null, 0.0);

        // show all balances in hashtable
        Set<String> set = balance.keySet(); // get set view of keys
        // get iterator
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            str = itr.next();
            System.out.println(str + ": " + balance.get(str));
        }
        System.out.println();

        // Using for-each loop
        for (Map.Entry mapElement : balance.entrySet()) {
              System.out.println(mapElement.getKey() + ": " + mapElement.getValue());
        }
        System.out.println();

        // Using Hashmap.forEach()
        balance.forEach((k, v) -> System.out.println(k + " : " + v));
        System.out.println();


        String key = "John Doe";
        // Deposit 1,000 into John Doe's account
        bal = balance.get(key);
        balance.put(key, bal + 1000);
        System.out.println(key + "'s new balance: " + balance.get(key));


        HashMap<A,Integer> map = new HashMap<>();
        A a = new A(2,3);
        A b = new A(2,3);
        map.put(a,10);
        System.out.println(map.get(b));
    }
}
