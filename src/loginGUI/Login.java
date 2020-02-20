package loginGUI;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Login {

	public static void main(String[] args) {

		
		//setting User accounts
		int currentUser = 0;
		User[] UserArray = new User[100];

		
		//Setting up JFrame GUI
		JFrame f = new JFrame();
		f.setSize(200, 300);

		JTextField NameTextField = new JTextField();
		JTextField UserNameTextField = new JTextField();
		JTextField PWTextField = new JTextField();

		JLabel NameLabel = new JLabel("name: ");
		JLabel UserNameLabel = new JLabel("username: ");
		JLabel PWLabel = new JLabel("password: ");

		JButton SignUpButton = new JButton();
		SignUpButton.setText("Sign Up");

		JButton LogInButton = new JButton();
		LogInButton.setText("Login");

		f.setLayout(new GridLayout(4, 2));

		f.add(NameLabel);
		f.add(NameTextField);

		f.add(UserNameLabel);
		f.add(UserNameTextField);

		f.add(PWLabel);
		f.add(PWTextField);

		f.setVisible(true);

		f.add(LogInButton);
		f.add(SignUpButton);

		
		//setting up login logic
		LogInButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < UserArray.length; i++) {
					if (UserArray[i] != null && UserArray[i].getUsername().equals((UserNameTextField.getText())))
					{
						if (UserArray[i].getPW().equals(PWTextField.getText())) {
							System.out.println("logged in");
							NameTextField.setVisible(false);
							UserNameTextField.setVisible(false);
							PWTextField.setVisible(false);

							SignUpButton.setVisible(false);
							LogInButton.setVisible(false);

							NameLabel.setText("welcome, " + UserArray[i].getName());
							UserNameLabel.setVisible(false);
							PWLabel.setVisible(false);

							break;
						}
					}
				}
			}
		});

		
		//setting up sign up logic
		SignUpButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//created class User  with constructor (check out class "User")
				User UserToAdd = new User(NameTextField.getText(), NameTextField.getText(), PWTextField.getText());

				boolean UserExists = false;

				for (int i = 0; i < UserArray.length; i++) {
					if (UserArray[i] != null && UserArray[i].getUsername().equals(UserToAdd.getUsername())) {
						UserExists = true;
					}
				}
				if (UserExists == false) {
					UserArray[currentUser] = UserToAdd;

					System.out.println("added new user with name:" + UserToAdd.getName());
				}
			}
		});
	}
}
