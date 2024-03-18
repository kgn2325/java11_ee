package sec1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class LoginGUI extends JFrame implements ActionListener{
	JPanel port_log = new JPanel();
	JLabel port_label = new JLabel("유저 입력");
	JLabel port_warn = new JLabel("포트 입력");
	JLabel port_add = new JLabel("주소 입력");
	JTextField port_num = new JTextField(20);
	JTextField port_num2 = new JTextField(20);
	JTextField port_num3 = new JTextField(20);
	JButton port_btn = new JButton("접속~!");
	
	public LoginGUI() {
		setTitle("로그인 화면");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,400);
		setVisible(true);
		setResizable(false);
		port_btn.addActionListener(this);
		port_log.add(port_label);
		port_log.add(port_num);
		port_log.add(port_warn);
		port_log.add(port_num2);
		port_log.add(port_add);
		port_log.add(port_num3);
		port_log.add(port_btn);
		add(port_log);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}

public class GUIClient {

	public static void main(String[] args) {
		new LoginGUI();

	}

}
