package business;

public class Stuffy {
	private int id;
	private String type;
	private String size;
	private String color;
	private static int objectCount;
	
	public  Stuffy (int id, String type, String size, String color) {
		this.id= id;
		this.type = type;
		this.size = size;
		this.color = color;
		this.objectCount++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Stuffy [id=" + id + ", type=" + type +
				", size=" + size + ", color=" + color + ", objectCount = "+objectCount+"]";
	}
	
	

}
