

import java.util.ArrayList;

public class Folder extends FileSystemObject{
	ArrayList<FileSystemObject> FSObjectList;

	public Folder(String name) {
		super(name);
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
			size += fileSystemObject.calcSizeIntBytes();
		}
		
		return size;
	}
}
