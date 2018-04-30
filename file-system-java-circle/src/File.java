

public class File extends FileSystemObject{
	private String format;
	private String visibleName;
	private byte[] data;
	// TODO Owners, users, authorization
	
	public File(String name, 
				String format, 
				byte[] data) {
		
		super(name);
		this.format = format;
		this.visibleName = name + "." + format;
		this.sizeInBytes = data.length;
		this.data = data;
	}
	


	public void setName(String name) {
		this.name = name;
		updateVisibleName();
	}
	
	private void updateVisibleName() {
		this.visibleName = this.name + "." + this.format;		
	}
	
	public String getVisibleName() {
		return visibleName;
	}
	
	public String getFormat() {
		return format;
	}
	
	public int getSizeInBytes() {
		return calcSizeIntBytes();
	}
	
	public byte[] getData() {
		return data;
	}



	@Override
	public int calcSizeIntBytes() {
		return this.sizeInBytes;
	}
	
	
	
}
