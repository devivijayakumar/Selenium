package AssignmentSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.ArrayList;
import java.util.List;

public class ListAssignment2 {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		Robot obj= new Robot();
		List<String>list= new ArrayList<String>();
		list.add("swift");
		list.add("polo");
		list.add("tiago");
		list.add("ritz");
		list.add("seltos");
		list.add("baleno");
		for(String cars:list)
			System.out.println(cars);
		System.out.println(list.contains("ritz"));
		System.out.println("position of ritz "+list.indexOf("ritz"));
		
		
		

	}

}
