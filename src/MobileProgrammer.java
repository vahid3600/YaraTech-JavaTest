
public class MobileProgrammer extends Person{

	private Integer yearEmploy;
	private String lastJob;
	private Integer appReleased;

	public MobileProgrammer(String name, Integer masterNum, Integer yearEmploy, String lastJob, Integer appReleased) {
		super(name, masterNum);

		this.yearEmploy = yearEmploy;
		this.lastJob = lastJob;
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
