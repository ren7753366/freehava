package deer.milu.freejava.bean;

public class MNameValuePair {
	private String name;
	private Object value;
	public String getName() {
		return name;
	}
	
	public MNameValuePair(String name, Object value) {
		this.name = name;
		this.value = value;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	
	public String toString() {
		return "(name:" + name +",value:" + value+")";
	}
}
