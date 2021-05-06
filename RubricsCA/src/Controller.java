
import java.util.ArrayList;

public class Controller {
	ArrayList<String> rubric =new ArrayList<String>();
	
	public ArrayList createRubric() {
		
		rubric.add("Code");
		rubric.add("Plan");
		rubric.add("Documentation");
	
		return rubric;
	}
	
	public ArrayList addCriterion() {
		
		rubric.add("Design");
		
		return rubric;
		
	}

}
