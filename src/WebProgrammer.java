
public class WebProgrammer extends Person{

	private Integer yearEmploy;
	private String lastJob;
	private String programLanguage;

	public WebProgrammer(String name, Integer masterNum, Integer yearEmploy, String lastJob, String programLanguage) {
		super(name, masterNum);

		this.yearEmploy = yearEmploy;
		this.lastJob = lastJob;
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
