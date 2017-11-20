import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class mouseEX extends JFrame{
	public mouseEX () {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		Container c = getContentPane(); //컨테이너 생성
		c.setLayout(new FlowLayout());
		JLabel label = new JLabel("Love Java"); //love 자바 라벨 생성
		c.add(label);//라벨 추가
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				JLabel la = (JLabel)e.getSource();
				la.setText("Love Java"); //마우스 올리면 영어
			}
			@Override
			public void mouseExited(MouseEvent e) {
				JLabel a = (JLabel)e.getSource();
				a.setText("사랑해");//내리면 사랑해
			}			
		});
		setSize(250,150);//크기 설정
		setVisible(true);
	}
	
	static public void main(String [] args) {
		new mouseEX();
	}
}