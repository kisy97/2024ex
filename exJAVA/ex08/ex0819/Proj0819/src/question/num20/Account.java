package question.num20;

public class Account {
	private String name;
	private String id;
	private int money;
	
	Account() {
		// TODO Auto-generated constructor stub
	}
	
	Account(String name,String id,int money) {
		this.name = name;
		this.id = id;
		this.money = money;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	
	
	
}
