import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class mouseEX extends JFrame{
	public mouseEX () {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		Container c = getContentPane(); //�����̳� ����
		c.setLayout(new FlowLayout());
		JLabel label = new JLabel("Love Java"); //love �ڹ� �� ����
		c.add(label);//�� �߰�
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				JLabel la = (JLabel)e.getSource();
				la.setText("Love Java"); //���콺 �ø��� ����
			}
			@Override
			public void mouseExited(MouseEvent e) {
				JLabel a = (JLabel)e.getSource();
				a.setText("�����");//������ �����
			}			
		});
		setSize(250,150);//ũ�� ����
		setVisible(true);
	}
	
	static public void main(String [] args) {
		new mouseEX();
	}
}