
public class WebProgrammer extends Person{

	private Integer yearEmploy;
	private String lastJob;
	private String programLanguage;

	public WebProgrammer(String name, Integer masterNum) {
		super(name, masterNum);
	}


	public void setYearEmploy(Integer yearEmploy) {
		this.yearEmploy = yearEmploy;
	}


	public void setLastJob(String lastJob) {
		this.lastJob = lastJob;
	}


	public void setProgramLanguage(String programLanguage) {
		this.programLanguage = programLanguage;
	}


	public Integer getYearEmploy() {return yearEmploy;}

	public String getLastJob() {return lastJob;}
	
	public String getProgramLanguage() {return programLanguage;}

	@Override
	public String getName() {return super.getName();}

	@Override
	public Integer getMasterNum() {return super.getMasterNum();}
	
}
