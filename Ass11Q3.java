import java.awt.*;
import java.awt.event.*;

class TextFieldExample extends Frame implements ActionListener {
    TextField tf1, tf2, tf3;
    Button b1;

    TextFieldExample() {
        this.setLayout(null);
        tf1 = new TextField();
        tf1.setBounds(50, 50, 150, 20);
        tf2 = new TextField();
        tf2.setBounds(50, 100, 150, 20);
        tf3 = new TextField();
        tf3.setBounds(50, 150, 150, 20);
        tf3.setEditable(false);
        b1 = new Button("Add");
        b1.setBounds(100, 190, 60, 45);
        b1.addActionListener(this);
        add(tf1);
        add(tf2);
        add(tf3);
        add(b1);
    }

    public void actionPerformed(ActionEvent e) {
        String s1 = tf1.getText();
        String s2 = tf2.getText();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = 0;
        if (e.getSource() == b1)
            c = a + b;
        String result = String.valueOf(c);
        tf3.setText(result);
    }

    public static void main(String args[]) {
        TextFieldExample tf = new TextFieldExample();
        tf.setTitle("My text field");
        tf.setSize(400, 400);
        tf.setVisible(true);
    }
}