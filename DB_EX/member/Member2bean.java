package member;

public class Member2bean {
	
	private String id;
	private String pwd;
	public Member2bean(String id, String pwd) {
		this.id = id;
		this.pwd = pwd;
	}
	public String getId() {
		return id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
}
