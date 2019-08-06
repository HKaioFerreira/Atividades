package pac1;

import javax.swing.JOptionPane;

public class exerc2 {

	public static int media(int n1,int n2,int n3,int n4,int n5) {
		return (n1+n2+n3+n4+n5)/5;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =Integer.parseInt(JOptionPane.showInputDialog("Digite a nota 1:"));	
		int b =Integer.parseInt(JOptionPane.showInputDialog("Digite a nota 2:"));	
		int c =Integer.parseInt(JOptionPane.showInputDialog("Digite a nota 3:"));	
		int d =Integer.parseInt(JOptionPane.showInputDialog("Digite a nota 4:"));
		int e =Integer.parseInt(JOptionPane.showInputDialog("Digite a nota 5:"));	
	
	JOptionPane.showMessageDialog(null, "nota final:"+media(a,b,c,d,e));
}
}