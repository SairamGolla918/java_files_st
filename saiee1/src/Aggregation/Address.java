package Aggregation;


@Component
public class Address 
{
	
	int HouseNo;
	String Street;
	String Town;
	int Pincode;
	public Address(int houseNo, String street, String town, int pincode) 
	{
		super();
		HouseNo = houseNo;
		Street = street;
		Town = town;
		Pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [HouseNo=" + HouseNo + ", Street=" + Street + ", Town=" + Town + ", Pincode=" + Pincode + "]";
	}
	

}
