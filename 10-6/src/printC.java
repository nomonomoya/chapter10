import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class printC extends JFrame {
	private final int FLYING_UNIT = 10;
	private JLabel la = new JLabel("HELLO");
	public printC() {
		setTitle("클릭 연습 용 응용프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);//컨텐트팬의 배치관리자 삭제
		c.addKeyListener(new MyKeyListener()); //컨텐트팬에 키 리스너 달기
		la.setLocation(100,100); //la의 초기 위치는 100 100
		la.setSize(100,20);
		c.add(la);
		setSize(300,300);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus(); //포케스 강제 지정
		c.addMouseListener(new MouseAdapter() { //컨텐트팬에 포커스 잃는 경우 대비
			public void mouseClicked(MouseEvent e) {
				Component com = (Component)e.getSource();
				com.setFocusable(true);
				com.requestFocus();
			}
		});
	}
	class MyKeyListener extends KeyAdapter { //키 리스너 구현
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode(); //키 코드 아아내기
			if(keyCode == 'c') { //문자가 c이면
					int x = (int)(Math.random()*256);
					int y = (int)(Math.random()*256);
					la.setLocation(x, y); //랜덤값 넣기
			}
		}
	}
	public static void main(String [] args) {
		new printC();
	}
}