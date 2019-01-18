package test;

public class _09Laptop extends _09Electro{
	private String lap;
	   private double bonus = getPrice()*0.02; //get으로 불러오지 않음
	   
	   public _09Laptop(){
		
	}
	   public _09Laptop(String lap, int price){
		super(price);
		this.lap = lap;
	}
	   public double getBonus(){
	 	return bonus;
	}

	   public String getLap(){
		return lap;
	}
	   public String toString(){
	  	 return "\t 제품명 : "+ getLap();
	}
}
