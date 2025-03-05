public class Drivers

{

	private int 	driverId ;
	private String 	driverRef ;
	private String 	driverNum ;
	private String 	code ;
	private String 	forename ;
	private String 	surename ;
	private String 	nationality ;


public Drivers (int pDriverId , String pDriverRef , String  pDriverNum , String pCode , String pForename , String pSurename , String pNationality)

	{
		driverId = pDriverId ;
		driverRef = pDriverRef ;
		driverNum = pDriverNum ;
		code = pCode ;
		forename = pForename ;
		surename = pSurename ;
		nationality = pNationality ;
	}


	public int getDriverId() 
	{return driverId;}	 

	public String getDriverRef()
	{return driverRef;}

	public String getDriverNum()
	{return driverNum;}

	public String getCode()
	{return code;}
	
	public String getForename()
	{return forename;}

	public String getSurename()
	{return surename;}

	public String getNationality()
	{return nationality;}

}
