package text_field;

import java.awt.event.*;
import javax.swing.*;

public class TextFieldExampleRunner implements ActionListener {

  JTextField textField1, textField2, textField3;
  JButton button1, button2;

  TextFieldExampleRunner() {
    JFrame frame = new JFrame("");

    textField1 = new JTextField();
    textField1.setBounds(50, 50, 200, 30);

    textField2 = new JTextField();
    textField2.setBounds(50, 100, 200, 30);

    textField3 = new JTextField();
    textField3.setBounds(50, 150, 200, 30);
    textField3.setEditable(false);

    button1 = new JButton("+");
    button1.setBounds(50, 200, 50, 50);
    button1.addActionListener(this);

    button2 = new JButton("-");
    button2.setBounds(150, 200, 50, 50);
    button2.addActionListener(this);

    frame.add(textField1);
    frame.add(textField2);
    frame.add(textField3);
    frame.add(button1);
    frame.add(button2);

    frame.setSize(300, 300);
    frame.setLayout(null);
    frame.setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    String s1 = textField1.getText();
    String s2 = textField2.getText();

    int a = Integer.parseInt(s1);
    int b = Integer.parseInt(s2);
    int c = 0;

    if (e.getSource() == button1) {
      c = a + b;
    } else if (e.getSource() == button2) {
      c = a - b;
    }

    String result = String.valueOf(c);
    textField3.setText(result);
  }

  public static void main(String[] args) {
    new TextFieldExampleRunner();
  }
}
