import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseClick extends JFrame {
	public MouseClick() {
		setTitle("�巡�뵿�� YELLOW");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane(); 
		c.setBackground(new Color(0,200,0));
		c.addMouseMotionListener(new MyMouseListener());
		setSize(300,200); //ũ�� ����
		setVisible(true);
	}
	class MyMouseListener implements MouseMotionListener {
		public void mouseDragged(MouseEvent e) { //���콺�� �巡�� �Ǹ�
				JLabel j = (JLabel)e.getSource();
				j.setBackground(Color.YELLOW); //�����
		}

		public void mouseMoved(MouseEvent e) {
			JLabel j = (JLabel)e.getSource(); //���콺�� �����̸�
			j.setBackground(Color.green); //�ʷϻ�
	
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseClick();
	}

}
