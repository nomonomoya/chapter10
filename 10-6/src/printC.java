import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class printC extends JFrame {
	private final int FLYING_UNIT = 10;
	private JLabel la = new JLabel("HELLO");
	public printC() {
		setTitle("Ŭ�� ���� �� �������α׷�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);//����Ʈ���� ��ġ������ ����
		c.addKeyListener(new MyKeyListener()); //����Ʈ�ҿ� Ű ������ �ޱ�
		la.setLocation(100,100); //la�� �ʱ� ��ġ�� 100 100
		la.setSize(100,20);
		c.add(la);
		setSize(300,300);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus(); //���ɽ� ���� ����
		c.addMouseListener(new MouseAdapter() { //����Ʈ�ҿ� ��Ŀ�� �Ҵ� ��� ���
			public void mouseClicked(MouseEvent e) {
				Component com = (Component)e.getSource();
				com.setFocusable(true);
				com.requestFocus();
			}
		});
	}
	class MyKeyListener extends KeyAdapter { //Ű ������ ����
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode(); //Ű �ڵ� �ƾƳ���
			if(keyCode == 'c') { //���ڰ� c�̸�
					int x = (int)(Math.random()*256);
					int y = (int)(Math.random()*256);
					la.setLocation(x, y); //������ �ֱ�
			}
		}
	}
	public static void main(String [] args) {
		new printC();
	}
}