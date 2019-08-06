package pac1;

import javax.swing.JOptionPane;

public class exercicios {

	 public static String cres(int num1, int num2, int num3) {
		String jaaj = " "; 
	if (num1 > num2 && num2 > num3) {
		jaaj = num3 +" " + num2 +" "+ num1;
	}
	if	(num1 > num3 && num3 > num2) {
		jaaj = num2 +" " + num3 +" "+ num1;
	}
	if	(num2 > num1 && num1 > num3) {
		jaaj = num2 +" " + num1 +" "+ num3;	
	}
	if	(num2 > num3 && num3 > num1) {
		jaaj = num2 +" " + num3 +" "+ num1;	
	}
	if	(num3 > num2 && num2 > num1) {
		jaaj = num1 +" " + num2 +" "+ num3;	
	}
	if	(num3 > num1 && num1 > num2) {
		jaaj = num3 +" " + num1 +" "+ num2;		
	}
		return jaaj;
			
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	
	int a=Integer.parseInt(JOptionPane.showInputDialog("Digite o número 1:"));
	int b=Integer.parseInt(JOptionPane.showInputDialog("Digite o número 2:"));
	int c=Integer.parseInt(JOptionPane.showInputDialog("Digite o número 3:"));

	JOptionPane.showMessageDialog(null, "A ordem crescente é: "+cres(a, b, c));
	}
	
	}
			

	
	


