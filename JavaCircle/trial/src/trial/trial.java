package trial;

public class trial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Hardcode declare six departments
		Department CS = new Department("CS",99);
		Department EE = new Department("EE",98);
		Department IE = new Department("IE",70);
		Department CH = new Department("CH",56);
		Department EC = new Department("EC",98);
		Department SO = new Department("SO",32);
		
		// Declare a faculty with a name and required size
		Faculty GeneralFaculty = new Faculty("GF",6);
		
		// Populate departments of GeneralFaculty Object
		GeneralFaculty.departments[0] = CS;
		GeneralFaculty.departments[1] = EE;
		GeneralFaculty.departments[2] = IE;
		GeneralFaculty.departments[3] = CH;
		GeneralFaculty.departments[4] = EC;
		GeneralFaculty.departments[5] = SO;
		
		// To print departments properly
		GeneralFaculty.printDepartments();
		
		Department TP = new Department("TIP",98);
		Department NU = new Department("NURSING",88);
		
		// Declare a medicine faculty
		Faculty MedicineFaculty = new Faculty("MD",2);
		
		//Populate departments of MedicineFaculty
		MedicineFaculty.departments[0] = TP;
		MedicineFaculty.departments[1] = NU;
		
		// To print departments properly
		MedicineFaculty.printDepartments();
		
		// Declare a university
		University KOC = new University("KOÇ",6500,2);
		KOC.faculties[0] = GeneralFaculty;
		KOC.faculties[1] = MedicineFaculty;
		
		// To print faculties properly
		KOC.printFaculties();
		
		return;
	}

}
