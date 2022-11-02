package AssignmentSelenium;

import java.util.ArrayList;
import java.util.List;

public class lListJava {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();  
		list.add("Devi");
		list.add("Fathima");
		list.add("Nimisha");
		list.add("Selenium");
		for(String names:list)
			System.out.println(names);
	}

}
