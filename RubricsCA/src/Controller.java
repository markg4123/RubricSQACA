import java.util.ArrayList;

public class Controller {
	ArrayList<String> rubric =new ArrayList<String>();
	ArrayList<String> rubric1 =new ArrayList<String>();
	ArrayList<ArrayList> rubrics = new ArrayList<>(); 

	public ArrayList createRubric() {

		rubric.add("Code");
		rubric.add("Plan");
		rubric.add("Documentation");
		
		rubrics.add(rubric);
		
		rubric1.add("Plan");
		rubric1.add("Design");
		rubric1.add("Testing");
		
		rubrics.add(rubric);
		rubrics.add(rubric1);
		
		return rubric;
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

}