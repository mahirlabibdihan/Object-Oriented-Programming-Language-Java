import java.util.*;
// To sort array/list of objects of a class, that class must implement Comparable
class Test{

}
public class Comparator{
	public static void main(String[] args){
		Test[] t=new Test[2];
		t[0]  = new Test();
		t[1] = new Test();
		Arrays.sort(t);
	}
}
