package 김광현;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class MainClass extends JFrame implements ActionListener {
	
	ProgTest1 pt1 = new ProgTest1();
	ProgTest2 pt2 = new ProgTest2();
	
	JPanel jp1, jp2, jp3;
	JLabel jlb1, jlb2, jlb3, jlb4;
	JTextField jtf1, jtf2, jtf3;
	JRadioButton jrbtn1, jrbtn2;
	JButton jbtn1, jbtn2, jbtn3, jbtn4;
	JTextArea jta;
	ButtonGroup btnG;
	
	public MainClass() {
		super("프로그래밍언어활용평가");
		
		Box hBox = Box.createHorizontalBox();
		jlb1 = new JLabel("회원 ID :");
		jlb2 = new JLabel("회원 이름 :");
		jlb3 = new JLabel("전화번호 :");
		jlb4 = new JLabel("성별 :");
		jtf1 = new JTextField();
		jtf2 = new JTextField();
		jtf3 = new JTextField();
		
		btnG = new ButtonGroup();
		jrbtn1 = new JRadioButton("남", true);
		jrbtn2 = new JRadioButton("여", false);
		btnG.add(jrbtn1);
		btnG.add(jrbtn2);
		
		hBox.add(Box.createHorizontalStrut(50));
		hBox.add(jlb1);
		hBox.add(jtf1);
		hBox.add(Box.createHorizontalStrut(10));
		hBox.add(jlb2);
		hBox.add(jtf2);
		hBox.add(Box.createHorizontalStrut(10));
		hBox.add(jlb3);
		hBox.add(jtf3);
		hBox.add(Box.createHorizontalStrut(10));
		hBox.add(jlb4);
		hBox.add(jrbtn1);
		hBox.add(jrbtn2);
		hBox.add(Box.createHorizontalStrut(50));
		
		jbtn1 = new JButton("회원등록");
		jbtn2 = new JButton("회원삭제");
		jbtn3 = new JButton("전체회원조회");
		Box hhBox = Box.createHorizontalBox();
		hhBox.add(jbtn1);
		hhBox.add(Box.createHorizontalStrut(10));
		hhBox.add(jbtn2);
		hhBox.add(Box.createHorizontalStrut(10));
		hhBox.add(jbtn3);
		
		Box vBox = Box.createVerticalBox();
		vBox.add(hBox);
		vBox.add(hhBox);
		
		jp1 = new JPanel (new BorderLayout());
		jp1.setBorder(new TitledBorder(new EtchedBorder(), "회원등록,삭제,조회"));
		jp1.add(vBox);
		
		jp2 = new JPanel();
		jp2.setBorder(new TitledBorder(new EtchedBorder(), "구구단"));
		jbtn4 = new JButton("구구단 보기");
		Box hhhBox = Box.createHorizontalBox();
		jp2.setAlignmentY(CENTER_ALIGNMENT);
		hhhBox.add(jbtn4);
		jp2.add(hhhBox);
		
		jp3 = new JPanel();
		jp3.setBorder(new TitledBorder(new EtchedBorder(), "결과"));
		jta = new JTextArea(10, 70);
		jp3.add(jta);
		
		Box vvBox = Box.createVerticalBox();
		vvBox.add(jp1);
		vvBox.add(jp2);
		vvBox.add(jp3);
		add(vvBox);
		
		jbtn1.addActionListener(this);
		jbtn2.addActionListener(this);
		jbtn3.addActionListener(this);
		jbtn4.addActionListener(this);
		
		setSize(800, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new MainClass();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == jbtn1) {
			int con = JOptionPane.showConfirmDialog(this, "회원을 등록하시겠습니까?", "회원등록",JOptionPane.YES_NO_OPTION);
			if  (con == JOptionPane.YES_OPTION) {
				Enumeration<AbstractButton> em = btnG.getElements();
				while (em.hasMoreElements()) {
					AbstractButton button = em.nextElement();
					JRadioButton jb = (JRadioButton) button;
					if (jb.isSelected() ) {
						pt2.mapListAdd(jtf1.getText(), jtf2.getText(),jtf3.getText(), jb.getText());
					}
				}
			}else if (con == JOptionPane.NO_OPTION) {
			}
		}
		if (e.getSource() == jbtn2) {
			int con = JOptionPane.showConfirmDialog(this,  "회원을 삭제하겠습니까?", "회원삭제", JOptionPane.YES_NO_OPTION);
				if (con == JOptionPane.YES_OPTION) {
					pt2.mapListRemove(jtf1.getText());
				}else if (con == JOptionPane.NO_OPTION ) {
		}
	}

}
}


