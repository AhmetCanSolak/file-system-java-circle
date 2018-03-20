package trial;

public class University {
	
	String name;
	int capacity;
	Faculty[] faculties;
	
	University(String Name, int cap, int FacNumber)
	{
		this.name = Name;
		this.faculties = new Faculty[FacNumber];
		this.capacity = cap;
	}
	
	void printFaculties()
	{
		for(int i=0;i<this.faculties.length;i++)
		{
			System.out.println(this.faculties[i].name);
		}
		return;
	}

}
