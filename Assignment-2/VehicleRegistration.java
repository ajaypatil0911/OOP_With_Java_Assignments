class Vehicle
{
	String regNo;
	String ownerName;
	String vehicleType;
	static int vehicleCount;
	
	static
	{
		System.out.println("========Welcome To CDAC Vehicle Registration Portal========");
	}
	Vehicle(String ownerName,String vehicleType)
	{
		vehicleCount++;
		this.regNo="MH-2025-"+vehicleCount;
		this.ownerName=ownerName;
		this.vehicleType=vehicleType;
	}
	
	String getRegNo()
	{
		return this.regNo;
	}
	String getOwnerName()
	{
		return this.ownerName;
	}
	String getVehicleType()
	{
		return this.vehicleType;
	}
	
	void showDetails()
	{
		System.out.println("Reg No.="+regNo+" Owner Name="+ownerName+" Vehicle Type="+vehicleType);
	}
}
class Main
{
	public static void main(String args[])
	{
		Vehicle v1=new Vehicle("Ajay","Car");
		Vehicle v2=new Vehicle("Patil","Bike");
		v1.showDetails();
		v2.showDetails();
	}
}