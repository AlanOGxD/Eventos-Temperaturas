import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.*;

import javax.swing.*;
class operaciones{
	public String cAF(int numero) {
		return ((1.8*numero)+32)+"";
	}
	
	public String cAK(int numero) {
		return ;
	}
	
	public String cAR(int numero) {
		return;
		}
	
	public String fAC(int numero) {
		return ((numero-32)/1.8)+"";
		}
	
	public String fAK(int numero) {
		return ((numero+459.67)/1.8)+"";
		}
	
	public String fAR(int numero) {return;}
	
	public String kAC(int numero) {return;}
	
	public String kAF(int numero) {return;}
	
	public String kAR(int numero) {return;}
	
	public String rAC(int numero) {return;}
	
	public String rAF(int numero) {return;}
	
	public String rAK(int numero) {return;}
	
}

class conversor extends JFrame implements ActionListener, KeyListener{
	
	JTextField cajaConvertir, cajaResultado;
	JComboBox<String> combo1, combo2;
	public conversor() {
		getContentPane().setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 150);
		setTitle("Conversor: ");
		setLocationRelativeTo(null);
		setVisible(true);
				
		JLabel lblConvertir =new JLabel("Convertir: ");
		add(lblConvertir);
		
		cajaConvertir = new JTextField(10);
		cajaConvertir.addActionListener(this);
		add(cajaConvertir);
		
		combo1 = new JComboBox<String>();
		combo1.addActionListener(this);
		combo1.addItem("Centigrados");
		combo1.addItem("Fahrenheit");
		combo1.addItem("Kelvin");
		combo1.addItem("Rankine");
		add(combo1);
		
		JLabel lblA =new JLabel("A: ");
		add(lblA);
		
		combo2 = new JComboBox<String>();
		combo2.addActionListener(this);
		add(combo2);
		
		cajaResultado = new JTextField(10);
		cajaResultado.addActionListener(this);
		add(cajaResultado);
		
		
	}
	
	int numero;
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		try{
			numero=cajaConvertir.getText().charAt(0);
		if (!Character.isDigit(numero)) {
			JOptionPane.showMessageDialog(rootPane, "No es un número");
		}}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}


public class Prueba {
public static void main(String[] args) {
	SwingUtilities.invokeLater(new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
		new conversor();	
		}
	});
}
}
