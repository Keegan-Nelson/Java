package Converter;

public class Calc {
	


	
 
	//double CTconstant;
	//CTconstant = 1.8;
	// QUESTION ABOUT WHY CANT I DECLARE THIS OUTSIDE THE MAIN 
	
	
	// to convert from F to C need to 
	// subtract 32 
	// divide answer by 1.8
	
	
	// to convert from C to F need to 
	// multiply by 1.8
	// then add 32
	
	private double inputF; 
	private double inputC; 
	
	public double outputF; 
	public double outputC; 
	
	
	public double getOutputF() { 
		return outputF;
	}
	public double getOutputC( ) { 
		return outputC; 
	}
	public void setInputF(double input) {
		inputF = input; 
	}
	public void setInputC(double input) {
		inputC = input; 
	}
	
	public double convertC() {
		double FtoCconstant;
		FtoCconstant = 1.8; 
		int ThirtyTwo; 
		ThirtyTwo = 32;
		return outputC = (inputF - ThirtyTwo) / FtoCconstant;  
		
	}
	public double convertT() {
		double CtoFconstant; 
		CtoFconstant = 1.8; 
		int ThirtyTwo; 
		ThirtyTwo = 32;
		return outputF = (inputC * CtoFconstant) + ThirtyTwo; 
		
	}
	
	
	
	}
