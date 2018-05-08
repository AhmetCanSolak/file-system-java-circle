
public class Runner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		// 1. Get root folder for the filesystem instance and OS type
		// String targetFolder = args[0];
		String targetFolder = "hehe";
		String hostOS = System.getProperty("os.name");
		
		// 2. Check if there is a previously created filesystem
		
		// 3. Initiate or re-open the filesystem at target folder
		FileSystem fs = new FileSystem(targetFolder);
		fs.setHostOS(hostOS);
		fs.configure();
		
		// 4. Start filesystem-CLI
		// 5. Clear temporaries and exit the program
		
		return;
	}

}
