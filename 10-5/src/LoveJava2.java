import java.awt.*;import java.awt.event.*;import javax.swing.*;
public class LoveJava2 extends JFrame{
	JPanel c = new JPanel();
	JLabel l = new JLabel("Love Java");
	LoveJava2 () {
		setTitle("폰트 크기 조절");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200,200);
		l.setFont(new Font("Arial", Font.PLAIN, 10)); //Arial 폰트 10픽셀 크기
		setContentPane(c);
		c.add(l);
		l.addKeyListener(new plusMinusKey());
		setVisible(true);
		l.requestFocus();
	}
	class plusMinusKey extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keyC = e.getKeyCode();
			Font f = l.getFont();
			int size = f.getSize();
			if(keyC == KeyEvent.VK_MINUS) { //값이 마이너스 일 때
				if(size == 5) //사이즈가 5면
					l.setFont(new Font("Arial", Font.PLAIN, size)); //더 안준다
				else
					l.setFont(new Font("Arial", Font.PLAIN, size-5)); //5가 아니면 작아진다
			}
			else if(keyC == KeyEvent.VK_EQUALS); //플러스면
				l.setFont(new Font("Arial", Font.PLAIN,size+5)); //값이 커진다
		}
	}
	public static void main(String[] args) {
		new LoveJava2();
	}
}
