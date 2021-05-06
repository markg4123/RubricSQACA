import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class TestClass {
	
	
	 @Test
	 public void testCreateRubric() {
			ArrayList<String> rubric =new ArrayList<String>();
			rubric.add("code");
			rubric.add("plan");
			rubric.add("documentation");
		
			Controller controller = new Controller();
			
			assertEquals(rubric,controller.createRubric());
			
		
	
	 }
	 
}
