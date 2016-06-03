import java.util.List;


public class Allergy {
	
	AllergyType AllergyType; //food alregy // dust// skin // drug
	List<String> Symptoms;
	List<String> AllergyItems;
	
	public Allergy(){
		
	}
	
	public String getAllAllergyInfo(){
		return String.format("%s %s %s", AllergyType,AllergyItems,Symptoms);
		
	}
	
	public void setAllergyType(AllergyType AllergyType){
		this.AllergyType = AllergyType;
		
	}
	
	public AllergyType getAllergyType(){
		return AllergyType;
	}
	
	public void setAllergyItems(List<String> AllergyItems){
		this.AllergyItems = AllergyItems;
	}
	
	public List<String> getAllergyItems(){
		return AllergyItems;
	}
	
	public void setSymptons(List<String> Symptoms){
		this.Symptoms =  Symptoms;
	}
	
	public List<String> getSymptons(){
		return Symptoms;
	}
	
	
	

}
