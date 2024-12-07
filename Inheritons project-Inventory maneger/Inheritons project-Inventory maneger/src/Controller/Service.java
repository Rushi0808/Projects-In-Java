package Controller;

public class Service extends Item{
	String ServiceCategory;
	int ServiceCode;
	

	
	public Service(String name, double price,  String serviceCategory,int ServiceCode) {
		super(name, price);
		ServiceCategory = serviceCategory;
	}


	public String getServiceCategory() {
		return ServiceCategory;
	}


	public int getServiceCode() {
		return ServiceCode;
	}


	@Override
	public String toString() {
		return "Service [ServiceCategory=" + ServiceCategory + ", ServiceCode=" + ServiceCode + ", name=" + name
				+ ", price=" + price + "]";
	}


	


	


	
	
}
