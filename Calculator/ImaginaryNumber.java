//James Barrington 90008620
public class ImaginaryNumber extends RealNumber
{
	private double imageNum;
	

	// Constructors
	public ImaginaryNumber()
	{
		super();
		imageNum = 0;	
	}	

	public ImaginaryNumber(double inNum1, double inNum2)
	{
		super(inNum1);
		imageNum = inNum2;
	}

	public ImaginaryNumber(ImaginaryNumber inImageNum)
	{
		super(inImageNum.getRealNum());
		imageNum = inImageNum.getImageNum();
	}
	// Add , subtract, divide and multiply
	
	public void add(ImaginaryNumber inImageNum)
	{
		// use the setRealNumber method to assign the calculation to the realNumber part of the imaginary number
		super.add(inImageNum);
		imageNum += inImageNum.getImageNum();
	}
	
	public void subtract(ImaginaryNumber inImageNum)
	{
		// Uses the subtract method in the super class
		super.subtract(inImageNum);
		imageNum -= inImageNum.getImageNum();
	}
	
	public void multiply(ImaginaryNumber inImageNum)
	{
		// This is needed because the multiple method from the super class sets assigns real num to the calculation
		//Where as it is needed again later on in the calculation
		double tempReal;
		
		tempReal = super.getRealNum();
		
		super.multiply(inImageNum) ;
		//
		super.setRealNumber(super.getRealNum()- (imageNum * inImageNum.getImageNum()));
		imageNum = ((imageNum * inImageNum.getRealNum()) + (tempReal * inImageNum.getImageNum()));
		
	}
	
	public void divide(ImaginaryNumber inImageNum)
	{
		// This is needed because the multiple method from the super class sets assigns real num to the calculation
		//Where as it is needed again later on in the calculation
		if((inImageNum.getRealNum() != 0.00) || (inImageNum.getImageNum() != 0.00))
		{
			double tempReal;
			tempReal = super.getRealNum();
		
			super.multiply(inImageNum) ;
		
			super.setRealNumber((super.getRealNum()+ (imageNum * inImageNum.getImageNum()))/((inImageNum.getImageNum()* inImageNum.getImageNum()) + (inImageNum.getRealNum()*inImageNum.getRealNum())));
		
			imageNum = (((imageNum * inImageNum.getRealNum()) - (tempReal * inImageNum.getImageNum()))/((inImageNum.getImageNum()* inImageNum.getImageNum()) + (inImageNum.getRealNum()*inImageNum.getRealNum())));
		}
	}
	//////// Mutators and accesors
	public void setImaginaryNumber(double inNum1 ,double inNum2)
	{
		super.setRealNumber(inNum1);
		imageNum = inNum2;		
	}

	public double getImageNum()
	{
		return imageNum;
	}	
	//Checks if two numbers are equal 
	public boolean equals(ImaginaryNumber inImageNum)
	{
		boolean isEquals;
		isEquals = false;
		
		if(Math.abs(inImageNum.getImageNum() - imageNum)< 0.000001)
		{
	 		isEquals = true; 			
		}
		return isEquals;
	}

	public String toString()
	{
		String outString = "";
		outString += "Imaginary num" + imageNum + "Real Part" + super.toString();
		return outString;		
	}

}
