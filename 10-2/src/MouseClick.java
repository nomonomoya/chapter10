import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseClick extends JFrame {
	public MouseClick() {
		setTitle("드래깅동안 YELLOW");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane(); 
		c.setBackground(new Color(0,200,0));
		c.addMouseMotionListener(new MyMouseListener());
		setSize(300,200); //크기 지정
		setVisible(true);
	}
	class MyMouseListener implements MouseMotionListener {
		public void mouseDragged(MouseEvent e) { //마우스가 드래그 되면
				JLabel j = (JLabel)e.getSource();
				j.setBackground(Color.YELLOW); //노랑색
		}

		public void mouseMoved(MouseEvent e) {
			JLabel j = (JLabel)e.getSource(); //마우스가 움직이면
			j.setBackground(Color.green); //초록색
	
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseClick();
	}

}
