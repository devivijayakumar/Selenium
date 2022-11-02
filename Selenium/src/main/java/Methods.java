

public class Methods {
	int mark;
	int total;
	float percentage(int mark,int total)
	{
		float c= (float)mark/total*100;
		return c;
	}
	public static void main(String[] args) {
		Methods obj= new Methods();
		
		System.out.println("the percentage  of 2 numbers are "+obj.percentage(50,100));
		}

	}


