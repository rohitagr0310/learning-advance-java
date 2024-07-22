package text_field;

import javax.swing.*;

public class TextFieldExample {

  public static void main(String[] args) {
    JFrame frame = new JFrame("TextField Example");

    JTextField textField1, textField2;

    textField1 = new JTextField("Write your rollno. ");
    textField1.setBounds(50, 100, 200, 30);

    textField2 = new JTextField("Write your Name");
    textField2.setBounds(50, 150, 200, 30);

    frame.add(textField1);
    frame.add(textField2);

    frame.setSize(400, 400);
    frame.setLayout(null);
    frame.setVisible(true);
  }
}
