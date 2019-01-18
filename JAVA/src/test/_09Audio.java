package test;

public class _09Audio extends _09Electro{
	 private String audio;
	    private double bonus = getPrice()*0.01;    

	    public _09Audio(){

	} 
	    public _09Audio(String audio, int price){
		super(price);
		this.audio= audio;

	}
	   public double getBonus(){
	 	return bonus;
	}

	    public String getAudio(){
	     	return audio ;
	}
	    public String toString(){
	   return "\t 제품명:  "+ getAudio();
	}
}
