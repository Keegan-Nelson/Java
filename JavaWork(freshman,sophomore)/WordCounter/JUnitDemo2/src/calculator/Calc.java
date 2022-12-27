package calculator;

public class Calc {

		
		private double input1; 
		private double input2; 
		private double output; 
		
		
		public double getInput1() { 
			return input1;
		}
		public double getInput2() { 
			return input2; 
		}
		public double getOutput() { 
			return output; 
		}
		public void setInput1(double input) { 
			input1 = input; 
		}
		public void setInput2(double input) { 
			input2 = input; 
		}
		public void add() { 
			output = input1 + input2; 
		}
		public void subtract() { 
			output = input1 - input2; 
		}
		public void multiply() { 
			output = input1  * input2; 
		}
		public void divide() { 
			output = input1 / input2; 
		}
		public boolean equals(Object arg0) { 
			Calc c = (Calc)arg0; 
			return ( input1 == c.getInput1()
				  && input2 == c.getInput2() 
				  && output == c.getOutput()); 

	}
}
