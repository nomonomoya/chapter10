import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoveJava extends JFrame{
	JPanel con = new JPanel();
	Container c = getContentPane();
	JLabel a;
	String b = new String("Love Java");
	
	LoveJava() {
		setTitle("LeftŰ�� ���ڿ� �̵�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(con);
		setSize(200,200);
		a = new JLabel(b);
		a.addKeyListener(new KeyShift()); //Ű �Ƶ��ϴ� ��ü �����
		con.add(a);
		
		setVisible(true);
		a.requestFocus(); //��Ŀ��
	} 
	class KeyShift extends KeyAdapter {
		public void KeyPressed(KeyEvent e) {
			if(e.getKeyCode() == KeyEvent.VK_LEFT) { //�Է� Ű �ҷ��� Ȯ��
				b=b.substring(1) + b.substring(0,1); //b.substring(0,1)�� L����. b.substring(1)�� ove Java ����			
			}
			a.setText(b); //���ο� b����
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LoveJava();
	}
}
