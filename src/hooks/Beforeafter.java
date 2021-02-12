package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Beforeafter {

	@Before
	public void before_function1()
	{System.out.println("before function1");}
	
	@After
	public void After_function1() {
		
		System.out.println("After function1");
	}
	
	
}
