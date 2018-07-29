
public class Accountant extends Person {

	private Integer yearEmploy;
	private String lastDegree;

	public Accountant(String name, Integer masterNum) {
		super(name, masterNum);
	}

	public void setYearEmploy(Integer yearEmploy) {
		this.yearEmploy = yearEmploy;
	}


	public void setLastDegree(String lastDegree) {
		this.lastDegree = lastDegree;
	}


	public Integer getYearEmploy() {
		return yearEmploy;
	}

	public String getLastDegree() {
		return lastDegree;
	}

	@Override
	public String getName() {
		return super.getName();
	}

	@Override
	public Integer getMasterNum() {
		return super.getMasterNum();
	}

}
