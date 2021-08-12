import java.util.ArrayList;
import java.util.List;

// Non-synchronized

// interface List{

// }

// class ArrayList implements List extends AbstractList{

// }
public class Array_List {
	public static void main(String[] args) {
		//  ArrayList can’t be created for primitive data types
		// Only reference type are allowed in arraylist
		ArrayList<String> Animals = new ArrayList<String>();
		ArrayList<Integer> Numbers1 = new ArrayList<Integer>();
		ArrayList<Double> Numbers2 = new ArrayList<Double>();
		ArrayList<Float> Numbers4 = new ArrayList<Float>();
		ArrayList<Long> Numbers3 = new ArrayList<Long>();
		List<Integer> Numbers5 = new ArrayList<Integer>();


		// Print
		for(int i=0;i<Numbers5.size();i++){
 			System.out.println(Numbers5.get(i));
		}

		for(Integer i:Numbers5){
			System.out.println(i);
		} 

		Numbers5.forEach(i->System.out.println(i));

		Iterator<Integer> itr = Numbers5.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next()+" ");
		}

		// ArrayList to Array
		Integer ia[] = new Integer[Numbers5.size()];
		Numbers5.toArray(ia);

		// Reference type Array to  list
		List<Integer>  al = Arrays.asList(ia);

		// Primitive type Array to List
		
	}
}
