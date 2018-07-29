
public class MobileProgrammer extends Person{

	private Integer yearEmploy;
	private String lastJob;
	private Integer appReleased;

	public MobileProgrammer(String name, Integer masterNum) {
		super(name, masterNum);
	}

	public void setYearEmploy(Integer yearEmploy) {
		this.yearEmploy = yearEmploy;
	}


	public void setLastJob(String lastJob) {
		this.lastJob = lastJob;
	}


	public void setAppReleased(Integer appReleased) {
		this.appReleased = appReleased;
	}


	public Integer getYearEmploy() {return yearEmploy;}

	public String getLastJob() {return lastJob;}

	public Integer getAppReleased() {return appReleased;}
	
	@Override
	public String getName() {return super.getName();}

	@Override
	public Integer getMasterNum() {return super.getMasterNum();}
}
