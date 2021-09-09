import java.util.*;
public class Institute {
	private int eiin;
	private int shift;
	private int version;
	private int group;
	public Institute (int eiin, int shift, int version, int group) {
		this.eiin = eiin;
		this.shift = shift;
		this.version = version;
		this.group = group;
	}

	@Override
	public boolean equals(Object o){
		Institute i= (Institute)o;
		return this.eiin==i.eiin&&this.shift==i.shift&&this.version==i.version&&this.group==i.group;
	}


	@Override
	public int hashCode(){
		return Objects.hash(eiin,shift,version,group);
	}

	public static void main (String [] args) {
		Institute i1 = new Institute (135790, 1, 1, 0);
		Institute i2 = new Institute (135790, 1, 1, 0);
		System.out.println(i1.equals(i2));
		HashMap map = new HashMap();
		map.put (i1, 100);
		System.out.println(map.get(i2));
	}
}