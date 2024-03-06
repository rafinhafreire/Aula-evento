
import javax.swing.*;
import java.awt.event.*;

public class Eventoaula extends JFrame {
    private JButton button;
    private JTextField textField;
    private JTextArea textArea;

    public Eventoaula() {
        setTitle("Eventoaula");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        button = new JButton("Exibir");
        textField = new JTextField(10);
        textArea = new JTextArea(5, 20);


        JPanel panel = new JPanel();
        panel.add(new JLabel("Digite algo:"));
        panel.add(textField);
        panel.add(button);

        JScrollPane scrollPane = new JScrollPane(textArea);
        panel.add(scrollPane);

        add(panel);


        button.addActionListener(new ButtonClickListener());

        textField.addActionListener(new TextFieldEnterListener());
    }


    class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String text = textField.getText();
            textArea.append(text + "\n");
            textField.setText("");
        }
    }

    class TextFieldEnterListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String text = textField.getText();
            textArea.append(text + "\n");
            textField.setText("");
        }
    }

    public static void main(String[] args) {
        Eventoaula demo = new Eventoaula();
        demo.setVisible(true);
    }
}

