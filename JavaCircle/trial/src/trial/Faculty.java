package trial;

public class Faculty {
	
	String name;
	Department[] departments;
	
	Faculty(String Name, int DepNumber)
	{
		this.name = Name;
		this.departments = new Department[DepNumber];
	}
	
	void printDepartments()
	{
		for(int i=0;i<this.departments.length;i++)
		{
			System.out.println(this.departments[i].name);
			System.out.println(this.departments[i].popularityScore);
		}
		
		return;
	}

}
