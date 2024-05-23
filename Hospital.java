package details;

public class Hospital {
	private String Name;
	private String Gender;
	
	public Hospital(String Name,String Gender) {
		this.Name=Name;
		this.Gender=Gender;
	}
	public String toString() {
		return "Hospital[Name="+ Name+",Gender="+Gender+"]";
	}
	void Hospitalout() {
		System.out.println("Name="+Name);
		System.out.println("Gender="+Gender);
		
	}
	

}
