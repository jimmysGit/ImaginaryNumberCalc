//James Barrington 90008620
public class RealNumber
{
	private double realNum;
	//Default Constructor
	public  RealNumber()
	{
		realNum = 0;
	}
	//Alternate Constructor
	public  RealNumber(double inNumber)
	{
		
		setRealNumber(inNumber); 
	}
	//CopyConstructor
	public RealNumber(RealNumber inRealNumber)
	{
		realNum = inRealNumber.getRealNum();
	}
///	Mutators and Accesors

	public void setRealNumber(double inNumber)
	{
		realNum = inNumber;
	}

	public double getRealNum()
	{
		return realNum;
	}	
	//Equals
	public boolean equals(RealNumber inRealNumber)
	{
		boolean isEquals;
		isEquals = false;
		if((Math.abs(realNum - inRealNumber.getRealNum()))< 0.000001)
			{
				isEquals = true;
			}
		return isEquals;
	}

	public String toString()
	{
		String stringOut = "";
		stringOut +=  realNum;
		return stringOut;
	}
	//Calculations(add ,subtract ,divide ,multiply)
	public void add(RealNumber inNum)
	{
		realNum += inNum.getRealNum();
	}

	public void subtract(RealNumber inNum)
	{
		realNum -= inNum.getRealNum();
	}

	public void multiply(RealNumber inNum)
	{
 		realNum *= inNum.getRealNum();
	}

	public void divide(RealNumber inNum)
	{
		//Makes sure that the number is not equal to 0 before doing a divide
		if(inNum.getRealNum() != 0.0)
		{
			realNum  /= inNum.getRealNum();
		}
	}

}
