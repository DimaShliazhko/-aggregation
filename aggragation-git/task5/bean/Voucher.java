package by.htps.task.bean;

public class Voucher {
	private String name;
	private String type;
	private String typeTransport;
	private boolean food;
	private int day;

	public Voucher(String name, String type, String typeTransport, boolean food, int day) {
		super();
		this.name = name;
		this.type = type;
		this.typeTransport = typeTransport;
		this.food = food;
		this.day = day;
	}

	@Override
	public String toString() {
		return "Voucher [name=" + name + ", type=" + type + ", typeTransport=" + typeTransport + ", food=" + food
				+ ", day=" + day + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTypeTransport() {
		return typeTransport;
	}

	public void setTypeTransport(String typeTransport) {
		this.typeTransport = typeTransport;
	}

	public boolean isFood() {
		return food;
	}

	public void setFood(boolean food) {
		this.food = food;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

}
