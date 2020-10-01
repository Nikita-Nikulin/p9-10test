import javax.swing.*;

public class Loader {
    public static void main (String[] args){
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(600,400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        MyForm myForm = new MyForm();
        frame.add(myForm.getPanelForm());
    }
}
