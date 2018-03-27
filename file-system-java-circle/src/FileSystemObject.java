

import java.time.LocalDateTime;

public class FileSystemObject {
	String name;
	int sizeInBytes;
	LocalDateTime creationDate;
	LocalDateTime lastModified;

	public FileSystemObject(String name) {
		this.name = name;
		this.creationDate = LocalDateTime.now();
		this.lastModified = this.creationDate;
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
