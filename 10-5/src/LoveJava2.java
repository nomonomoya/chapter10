import java.awt.*;import java.awt.event.*;import javax.swing.*;
public class LoveJava2 extends JFrame{
	JPanel c = new JPanel();
	JLabel l = new JLabel("Love Java");
	LoveJava2 () {
		setTitle("��Ʈ ũ�� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200,200);
		l.setFont(new Font("Arial", Font.PLAIN, 10)); //Arial ��Ʈ 10�ȼ� ũ��
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
			if(keyC == KeyEvent.VK_MINUS) { //���� ���̳ʽ� �� ��
				if(size == 5) //����� 5��
					l.setFont(new Font("Arial", Font.PLAIN, size)); //�� ���ش�
				else
					l.setFont(new Font("Arial", Font.PLAIN, size-5)); //5�� �ƴϸ� �۾�����
			}
			else if(keyC == KeyEvent.VK_EQUALS); //�÷�����
				l.setFont(new Font("Arial", Font.PLAIN,size+5)); //���� Ŀ����
		}
	}
	public static void main(String[] args) {
		new LoveJava2();
	}
}
