import java.util.List;
import java.util.ArrayList;

public class Controller {
	ArrayList<String> rubric =new ArrayList<String>();
	ArrayList<String> rubric1 =new ArrayList<String>();
	ArrayList<Integer> grade = new ArrayList<Integer>();
	
	ArrayList<ArrayList> rubrics = new ArrayList<>(); 

	public ArrayList createRubric() {

		rubric.add("Code");
		rubric.add("Plan");
		rubric.add("Documentation");
		
		rubric1.add("Plan");
		rubric1.add("Design");
		rubric1.add("Testing");
		
		rubrics.add(rubric);
		rubrics.add(rubric1);
		
		return rubrics;
	}

	public ArrayList addCriterion() {

		rubric.add("Design");

		return rubric;

	}
	
	public ArrayList allRubrics() {
		
		rubric.add("Code");
		rubric.add("Plan");
		rubric.add("Documentation");
		
		rubric1.add("Plan");
		rubric1.add("Design");
		rubric1.add("Testing");
		
		rubrics.add(rubric);
		rubrics.add(rubric1);
		return rubrics;
		
	}

	public ArrayList getSpecificRubric() {
		
		rubric.add("Code");
		rubric.add("Plan");
		rubric.add("Documentation");
		
		
		return rubric;
		
	}
	
	public ArrayList createStudentGrade() {
	
		grade.add(19);
		grade.add(45);
		grade.add(54);
		grade.add(32);
		grade.add(86);
		
		
		return grade;
	}

}