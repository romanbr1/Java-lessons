package ua.lviv.lgs.task2;

public class Methods {
	private int a;
	private int b;
	
	public int plus(int a, int b) throws MyException {
		inputCheck(a,b);
		return this.a*this.b;
	}
	public int minus(int a, int b) throws MyException  {
		inputCheck(a,b);

		return this.a-this.b;
	}
	public int multiply(int a, int b) throws MyException  {
		inputCheck(a,b);
		return this.a*this.b;
	}
	public int devide(int a, int b) throws MyException {
		inputCheck(a,b);
		return this.a*this.b;
		
	}
	public void inputCheck(int a, int b) throws MyException, IllegalArgumentException, ArithmeticException {
		
		if ((a<0)&&(b<0)) {
			throw new IllegalArgumentException("if ((a<0)&&(b<0))");
		}
		if ((a==0)&&(b!=0)) {
			throw new ArithmeticException("if ((a==0)&&(b!=0)) ");
		}
		if ((a!=0)&&(b==0)) {
			throw new ArithmeticException("if ((a!=0)&&(b==0)) ");
		}
		if ((a==0)&&(b==0)) {
			throw new IllegalArgumentException("if ((a==0)&&(b==0))");
		}
		if ((a>0)&&(b>0)) {
			throw new MyException("if ((a>0)&&(b>0)) MyException");
		}
		
	}
	
}
