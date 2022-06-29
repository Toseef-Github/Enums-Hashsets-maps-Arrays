package qa.com.HashLists;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedLists {
	
	  public static void main(String[] args) {
		    var cars = new LinkedList<String>();
		    cars.add("Audi");
		    cars.add("BMW");
		    cars.add("Mercedes");
		    cars.add("Ferarri");
		    System.out.println(cars);
	
		    Iterator<String> itr = cars.iterator();
		    
		    while(itr.hasNext()) {
		    	System.out.println(itr.next());
		    }
	  }

}
