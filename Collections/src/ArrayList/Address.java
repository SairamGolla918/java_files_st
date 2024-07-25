package ArrayList;



class Address
{
	int doorNo;
	String StreetName;
	String City;
	String State;
	String Country;
	public Address(int doorNo, String streetName, String city,String state, String country) {
		super();
		this.doorNo = doorNo;
		this.StreetName = streetName;
		this.City = city;
		this.State = state;
		this.Country = country;
	}
	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", StreetName=" + StreetName + ", City=" + City + ", State=" + State
				+ ", Country=" + Country + "]";
	}
	
}
