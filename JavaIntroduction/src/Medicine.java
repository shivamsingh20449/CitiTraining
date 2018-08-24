
public class Medicine {
	
	private String medicineName;
	private int medicinePrice;
	
	public Medicine()
	{
		medicineName= "PCM";
		medicinePrice= 26;
	}
	
	
	public Medicine(String medicineName, int medicinePrice) {
		super();
		this.medicineName = medicineName;
		this.medicinePrice = medicinePrice;
	}

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}


	public int getMedicinePrice() {
		return medicinePrice;
	}
	

	public void setMedicinePrice(int medicinePrice) {
		this.medicinePrice = medicinePrice;
	}


	public void display()
	{
		System.out.println("medicine: "+medicineName+"\t Medicine Price: "+ medicinePrice);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Medicine m1= new Medicine();
		m1.display();
		Medicine m2= new Medicine("ranitine", 50);
		m2.display();
		
				
	}

}
