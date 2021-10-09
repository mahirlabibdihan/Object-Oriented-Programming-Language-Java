// Thread safe
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.Objects;

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

class HashTableDemo {
    public static void main(String args[]) {
        Hashtable<String, Double> balance = new Hashtable<>();
        String str;
        double bal;

        balance.put("John Doe", 3434.34);
        balance.put("Tom Smith", 123.22);
        //balance.put("Jane Baker", null); // error
        //balance.put(null, new Double(0)); // error
        balance.put("Jane Baker", 1378.00);
        balance.put("Tod Hall", 99.22);
        balance.put("Ralph Smith", -19.08);


        Set<String> set = balance.keySet(); // get set view of keys
        Iterator<String> itr = set.iterator();     // get iterator
        while (itr.hasNext()) {
            str = itr.next();
            System.out.println(str + ": " + balance.get(str));
        }

        System.out.println();

        String key = "John Doe";
        // Deposit 1,000 into John Doe's account
        bal = balance.get(key);
        balance.put(key, bal + 1000);
        System.out.println(key + "'s new balance: " + balance.get(key));


        Hashtable<A,Integer> map = new Hashtable<>();
        A a = new A(2,3);
        A b = new A(2,3);
        map.put(a,10);
        System.out.println(map.get(b));
    }
}
