import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Myframe extends JFrame implements ActionListener {
	
	final TextField textfield;
	long number;
	double total;
	boolean flag;
	boolean cflag;
	String operation;
	JButton zero;
	JButton one;
	JButton two;
	JButton three;
	JButton four;
	JButton five;
	JButton six;
	JButton seven;
	JButton eight;
	JButton nine;
	JButton add;
	JButton subtract;
	JButton multiply;
	JButton divide;
	JButton clear;
	JButton ans;
	
	public Myframe() {
		setVisible(true);
		setLocation(100,100); //in order to implement these functions we extend JFrame class
		setSize(500,500);
		setLayout(null);
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		total = 0;
		number = 0;
		flag = true;
		cflag = false;
		operation = "";
		
		textfield = new TextField();
		textfield.setVisible(true);
		textfield.setEnabled(false);
		textfield.setLocation(10,10);
		textfield.setSize(475,50);
		add(textfield);
		
		seven = new JButton("7");
		seven.setBounds(75, 70, 70, 70);
		seven.setVisible(true);
		add(seven);
		seven.addActionListener(this);
		
		eight = new JButton("8");
		eight.setBounds(165,70,70,70);
		eight.setVisible(true);
		add(eight);
		eight.addActionListener(this);
		
		nine = new JButton("9");
		nine.setBounds(255,70,70,70);
		nine.setVisible(true);
		add(nine); 
		nine.addActionListener(this);
		
		add = new JButton("+");
		add.setBounds(345,70,70,70);
		add.setVisible(true);
		add(add); 
		add.addActionListener(this);
		
		four = new JButton("4");
		four.setBounds(75, 160, 70, 70);
		four.setVisible(true);
		add(four);
		four.addActionListener(this);
		
		five = new JButton("5");
		five.setBounds(165,160,70,70);
		five.setVisible(true);
		add(five);
		five.addActionListener(this);
		
		six = new JButton("6");
		six.setBounds(255,160,70,70);
		six.setVisible(true);
		add(six); 
		six.addActionListener(this);
		
		subtract = new JButton("-");
		subtract.setBounds(345,160,70,70);
		subtract.setVisible(true);
		add(subtract); 
		subtract.addActionListener(this);
		
		one = new JButton("1");
		one.setBounds(75,250,70,70);
		one.setVisible(true);
		add(one); 
		one.addActionListener(this);
		
		two = new JButton("2");
		two.setBounds(165,250,70,70);
		two.setVisible(true);
		add(two); 
		two.addActionListener(this);
		
		three = new JButton("3");
		three.setBounds(255,250,70,70);
		three.setVisible(true);
		add(three); 
		three.addActionListener(this);
		
		multiply = new JButton("*");
		multiply.setBounds(345,250,70,70);
		multiply.setVisible(true);
		add(multiply); 
		multiply.addActionListener(this);
		
		ans = new JButton("=");
		ans.setBounds(75,340,70,70);
		ans.setVisible(true);
		add(ans); 
		ans.addActionListener(this);
		
		zero = new JButton("0");
		zero.setBounds(165,340,70,70);
		zero.setVisible(true);
		add(zero);
		zero.addActionListener(this);
		
		clear = new JButton("Cl");
		clear.setBounds(255,340,70,70);
		clear.setVisible(true);
		add(clear); 
		clear.addActionListener(this);
		
		divide = new JButton("/");
		divide.setBounds(345,340,70,70);
		divide.setVisible(true);
		add(divide); 
		divide.addActionListener(this);
		
	}
	public static void main(String[] args) {
		new Myframe();
	}
	
	public void actionPerformed(ActionEvent event) {
		
		if( event.getSource() == one ) {
			if( cflag ) {
				cflag = false;
				textfield.setText("");
			}
			String t = textfield.getText();
			textfield.setText(t+"1");
			if( flag )
				number = number*10 + 1;
			else {
				flag = true;
				number = 1;
			}
		}
		else if( event.getSource() == two ) {
			if( cflag ) {
				cflag = false;
				textfield.setText("");
			}
			String t = textfield.getText();
			textfield.setText(t+"2");
			if( flag )
				number = number*10 + 2;
			else {
				flag = true;
				number = 2;
			}
		}
		else if( event.getSource() == three ) {
			if( cflag ) {
				cflag = false;
				textfield.setText("");
			}
			String t = textfield.getText();
			textfield.setText(t+"3");
			if( flag )
				number = number*10 + 3;
			else {
				flag = true;
				number = 3;
			}
		}
		else if( event.getSource() == four ) {
			if( cflag ) {
				cflag = false;
				textfield.setText("");
			}
			String t = textfield.getText();
			textfield.setText(t+"4");
			if( flag )
				number = number*10 + 4;
			else {
				flag = true;
				number = 4;
			}
		}
		else if( event.getSource() == five ) {
			if( cflag ) {
				cflag = false;
				textfield.setText("");
			}
			String t = textfield.getText();
			textfield.setText(t+"5");
			if( flag )
				number = number*10 + 5;
			else {
				flag = true;
				number = 5;
			}
		}
		else if( event.getSource() == six ) {
			if( cflag ) {
				cflag = false;
				textfield.setText("");
			}
			String t = textfield.getText();
			textfield.setText(t+"6");
			if( flag )
				number = number*10 + 6;
			else {
				flag = true;
				number = 6;
			}
		}
		else if( event.getSource() == seven ) {
			if( cflag ) {
				cflag = false;
				textfield.setText("");
			}
			String t = textfield.getText();
			textfield.setText(t+"7");
			if( flag )
				number = number*10 + 7;
			else {
				flag = true;
				number = 7;
			}
		}
		else if( event.getSource() == eight ) {
			if( cflag ) {
				cflag = false;
				textfield.setText("");
			}
			String t = textfield.getText();
			textfield.setText(t+"8");
			if( flag )
				number = number*10 + 8;
			else {
				flag = true;
				number = 8;
			}
		}
		else if( event.getSource() == nine ) {
			if( cflag ) {
				cflag = false;
				textfield.setText("");
			}
			String t = textfield.getText();
			textfield.setText(t+"9");
			if( flag )
				number = number*10 + 9;
			else {
				flag = true;
				number = 9;
			}
		}
		else if( event.getSource() == zero ) {
			if( cflag ) {
				cflag = false;
				textfield.setText("");
			}
			String t = textfield.getText();
			textfield.setText(t+"0");
			if( flag )
				number = number*10 + 0;
			else {
				flag = true;
				number = 0;
			}
		}
		else if( event.getSource() == add ) {
			if( cflag ) {
				cflag = false;
				total = Double.parseDouble(textfield.getText());
			}
			else
				total += number;
			flag = false;
			operation = "add"; 
			String t = textfield.getText();
			textfield.setText(t+"+");
		}
		else if( event.getSource() == subtract ) {
			if( cflag ) {
				cflag = false;
				total = Double.parseDouble(textfield.getText());
			}
			else {
				if( total == 0 )
					total = number;
				else
					total -= number;
			}
			flag = false;
			operation = "subtract";
			String t = textfield.getText();
			textfield.setText(t+"-");
		}
		else if( event.getSource() == multiply ) {
			if( cflag ) {
				cflag = false;
				total = Double.parseDouble(textfield.getText());
			}
			else {
				if( total == 0 )
					total = 1;
				total *= number;
				}
			flag = false;
			String t = textfield.getText();
			textfield.setText(t+"*");
			operation = "multiply";
		}
		else if( event.getSource() == divide ) {
			if( cflag ) {
				cflag = false;
				total = Double.parseDouble(textfield.getText());
			}
			else {
				if( total == 0 )
					total = number;
				else
					total /= number;
			}
			flag = false;
			operation = "divide";
			if( Double.isNaN(total) ) {
				textfield.setText("Math error");
				number = 0;
				total = 0;
				textfield.setText("");
			}
			else {
				String t = textfield.getText();
				textfield.setText(t+"/");
			}
		}
		else if( event.getSource() == ans ) {
	
			cflag = true;
			switch(operation) {
			case "add" 		:	total += number;
								break;
			case "subtract" :	total -= number;
								break;
			case "multiply" :	total *= number;
								break;
			case "divide" 	:	total /= number;
								break;
			}
			if( Double.isNaN(total) ) {
				textfield.setText("Math error");
				number = 0;
				total = 0;
				textfield.setText("");
			}
			else {
				textfield.setText(""+total);
				total = 0;
			}
		}
		else if( event.getSource() == clear ) {
			textfield.setText("");
			number = 0;
			total = 0;
		}
				
	}
	
}
