import java.awt.*;
import java.awt.event.*;

class Ass11Q1 extends Frame implements ActionListener {
    Button b1, b2, b3;
    Label l1;

    Ass11Q1() {
        this.setLayout(new FlowLayout());
        b1 = new Button("Red");
        b2 = new Button("Blue");
        b3 = new Button("Green");
        l1 = new Label("Welcome");
        add(b1);
        add(b2);
        add(b3);
        add(l1);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        setTitle("My Buttons");
        setSize(650, 400);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1)
            l1.setForeground(Color.red);
        if (ae.getSource() == b2)
            l1.setForeground(Color.blue);
        if (ae.getSource() == b3)
            l1.setForeground(Color.green);
    }

    public static void main(String args[]) {
        Ass11Q1 mb = new Ass11Q1();
        
    }
}