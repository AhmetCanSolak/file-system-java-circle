

import java.util.ArrayList;

public class Folder extends FileSystemObject{
	ArrayList<FileSystemObject> FSObjectList;

	public Folder(User u, String name) {
		super(u, name);
		this.FSObjectList = new ArrayList<FileSystemObject>();
		this.sizeInBytes = 0;
	}
	
	public ArrayList<FileSystemObject> getFSObjectList() {
		return FSObjectList;
	}
	
	public void pushNewFSObject(FileSystemObject fs){
		this.FSObjectList.add(fs);
	}

	public int calcSizeIntBytes(){
		int size = 0;
		
		for (FileSystemObject fileSystemObject : FSObjectList) {
			if (fileSystemObject instanceof Folder ) {
				size += ((Folder) fileSystemObject).calcSizeIntBytes();
			} else {
				size += fileSystemObject.sizeInBytes;
			}
		}
		
		return size;
	}
}
