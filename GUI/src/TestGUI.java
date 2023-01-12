import java.awt.*;
import javax.swing.*;
public class TestGUI extends JFrame {
	
	private static final int WIDTH = 400;
	private static final int HEIGHT = 300;
	//Components
	private JLabel lblLength,lblWidth,lblArea,lblPerimter;
	//private JTextField txtLenght,txtWidth.txtArea.txtPerimter;
	
	//Constructor Method
	public TestGUI() {
		setTitle("Area and Perimater");
		setSize(WIDTH,HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//Properties for Components
		lblLength =  new JLabel("Enter the lenght:",SwingConstants.RIGHT);
		lblWidth =  new JLabel("Enter the width:",SwingConstants.RIGHT);
		lblArea =  new JLabel("area:",SwingConstants.RIGHT);
		lblPerimter =  new JLabel("perimter:",SwingConstants.RIGHT);
		//TextField
		//txtLenght = new JTextField(10);
		
		GridLayout L = new GridLayout(4,1);
		setLayout(L);
		//Add Components
		//add(txtLenght);
		add(lblLength);
		add(lblWidth);
		add(lblArea);
		add(lblPerimter);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestGUI prog = new TestGUI();

	}

}
