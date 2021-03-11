package study.dto;

public class Member {
	private int num;
	private String name;
	private String email;
	private String tel;
	private String address;
	
	public Member() {
		this("강아지","dog@gmail.com","010-3333-4444","서울");
	}
	
	public Member(String name, String email, String tel, String address) {
		this.name = name;
		this.email = email;
		this.tel = tel;
		this.address = address;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
