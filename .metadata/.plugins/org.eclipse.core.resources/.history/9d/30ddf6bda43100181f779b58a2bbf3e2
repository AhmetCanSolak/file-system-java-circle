package trial2;

import java.util.ArrayList;
import java.util.Iterator;

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
			if (fileSystemObject instanceof Folder ) {
				size += ((Folder) fileSystemObject).calcSizeIntBytes();
			} else {
				size += fileSystemObject.sizeInBytes;
			}
		}
		
		return size;
	}
}
