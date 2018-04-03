

import java.time.LocalDateTime;
import java.util.ArrayList;

public class FileSystemObject {
	protected String name;
	protected int sizeInBytes;
	ArrayList<User> read;
	ArrayList<User> write;
	private LocalDateTime creationDate;
	private LocalDateTime lastModified;

	public FileSystemObject(User u, String name){
		this.name = name;
		this.read.add(u);
		this.creationDate = LocalDateTime.now();
		this.lastModified = this.creationDate;
	}
	
	public void addReadUser(User u) {
		if(this.read.contains(u)) {
			System.out.println("This user already has read access!");
		}else {
			this.read.add(u);
		}
	}
	
	public void addWriteUser(User u) {
		if(this.write.contains(u)) {
			System.out.println("This user already has read access!");
		}else {
			this.read.add(u);
		}
	}
	
	public String getName() {
		return name;
	}
	
	public LocalDateTime getCreationDate() {
		return creationDate;
	}
	
	public LocalDateTime getLastModified() {
		return lastModified;
	}
}
