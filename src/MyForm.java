import javax.swing.*;
import java.awt.event.*;

public class MyForm {
    private JButton buttonTest;
    private JPanel PanelForm;
    private JTextArea textArea1;
    private JButton clearButton;

    public JPanel getPanelForm(){return PanelForm;}
    MyForm (){
        buttonTest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(textArea1.getText());
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText("");
            }
        });
    textArea1.addMouseListener(new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    });
    textArea1.addKeyListener(new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
            if(e.getKeyChar()=='6'){
                textArea1.setText("Джава не души");
            }
        }

        @Override
        public void keyPressed(KeyEvent e) {

        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    });}
}
