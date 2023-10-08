package map;

import java.util.HashMap;
import java.util.WeakHashMap;


public class WeakHashMapDemo {
	
	public static void main(String[] args) throws InterruptedException {

	HashMap<Object, String> map = new HashMap<>();
	
	Temp t = new Temp();
	
	map.put(t, "element");
	
	//System.out.println(map);
	
	t=null;
	//System.gc();
	//Thread.sleep(3000);
	//System.out.println(map); //Objects have strong references //Dominates GC mechanism
	
	//---------------------------------------------
	
	WeakHashMap map2 = new WeakHashMap();
	Temp temp2 = new Temp();
	map2.put(temp2, "element");
	
	System.out.println(map2);
	
	temp2=null;
	System.gc();
	Thread.sleep(3000);
	System.out.println(map2); //Objects have weak references //GC takes over
	
	

	}

}


 class Temp{
	 
	 public String toString() {
		 return "temp";
	 }
	 
	 public void finalize() {
		 System.out.println("Finalize method called");
	 }
}
