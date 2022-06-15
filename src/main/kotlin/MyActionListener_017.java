import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListener_017 implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton b_017 = (JButton) e.getSource();
        if (b_017.getText().equals("Action")) {
            b_017.setText("액션");
        } else {
            b_017.setText("Action");
        }
    }
}
