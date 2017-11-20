import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoveJava extends JFrame{
	JPanel con = new JPanel();
	Container c = getContentPane();
	JLabel a;
	String b = new String("Love Java");
	
	LoveJava() {
		setTitle("Left키로 문자열 이동");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(con);
		setSize(200,200);
		a = new JLabel(b);
		a.addKeyListener(new KeyShift()); //키 아동하는 객체 만들기
		con.add(a);
		
		setVisible(true);
		a.requestFocus(); //포커스
	} 
	class KeyShift extends KeyAdapter {
		public void KeyPressed(KeyEvent e) {
			if(e.getKeyCode() == KeyEvent.VK_LEFT) { //입력 키 불러와 확인
				b=b.substring(1) + b.substring(0,1); //b.substring(0,1)은 L리턴. b.substring(1)은 ove Java 리턴			
			}
			a.setText(b); //새로운 b설정
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LoveJava();
	}
}
