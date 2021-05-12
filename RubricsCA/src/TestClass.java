import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.ArrayList;

import org.junit.Test;

public class TestClass {
	ArrayList<String> rubric =new ArrayList<String>();
	ArrayList<String> rubric1 =new ArrayList<String>();
	ArrayList<ArrayList> rubrics = new ArrayList<>(); 
	ArrayList<Integer> grade = new ArrayList<Integer>();
	
	

	Controller controller = new Controller();
	
	//test for creating a Rubric
	 @Test
	 public void testCreateRubric() {

	    rubric.add("Code");
		rubric.add("Plan");
		rubric.add("Documentation");
		
		rubric1.add("Plan");
		rubric1.add("Design");
		rubric1.add("Testing");
		
		rubrics.add(rubric);
		rubrics.add(rubric1);
		

	
		assertEquals(rubrics,controller.createRubric());
	
	 }
	
	 //test for adding criteria
	 @Test
	 public void testAddriteria() {
			
		rubric.add("Design");
		
		assertEquals(rubric,controller.addCriterion());
	
	 }
	 
	//test for getting all Rubrics  
		 @Test
		 public void testAllRubrics() {
		
	    	rubric.add("Code");
			rubric.add("Plan");
			rubric.add("Documentation");
				
			rubric1.add("Plan");
			rubric1.add("Design");
			rubric1.add("Testing");
			
			rubrics.add(rubric);
			rubrics.add(rubric1);
				
			assertEquals(rubrics,controller.allRubrics());
		
		 }
		 
		 //get Rubric 1
		 @Test
		 public void testSpecificRubric() {
				
				rubric.add("Code");
				rubric.add("Plan");
				rubric.add("Documentation");
				
			
			assertEquals(rubric,controller.getSpecificRubric());
		
		 }
		 
		 //test for adding student grade
		 @Test
		 public void testAddStudentGrade() {
				
			 	grade.add(19);
				grade.add(45);
				grade.add(54);
				grade.add(32);
				grade.add(86);
			
			assertEquals(grade,controller.createStudentGrade());
		
		 }
	 
}
