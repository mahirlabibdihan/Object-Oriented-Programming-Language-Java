// Can contain one null key,any null values

import java.util.Objects;

class HashMap{
	int x,y;
	@Override
	public int hashCode(){
		return Objects.hash(x,y);
	}
}
