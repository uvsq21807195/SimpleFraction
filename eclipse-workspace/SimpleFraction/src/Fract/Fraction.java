package Fract;

public class Fraction {
	
	public int numerateur;
	public int denominateur;
	
	
	Fraction( int numerateur, int denominateur)
	{
		this.numerateur=numerateur;
		this.denominateur=denominateur;
		
	}
	
	
	public String toString()
	{
		return Integer.toString(this.numerateur )+'/' + Integer.toString(this.denominateur);
	}

}
