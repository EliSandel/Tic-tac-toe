
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main implements ActionListener {

    JFrame frame = new JFrame("Tic-Tac-Toe");
    Label label = new Label("");
    JButton button1 = new JButton("");

    JButton button2 = new JButton("");
    JButton button3 = new JButton("");
    JButton button4 = new JButton("");
    JButton button5 = new JButton("");
    JButton btn6 = new JButton("");
    JButton btn7 = new JButton("");
    JButton btn8 = new JButton("");
    JButton btn9 = new JButton("");
    JButton btn10 = new JButton("");

    JPanel board = new JPanel();
    JPanel panel = new JPanel();

    String letter = "";
    int count = 0;

    boolean win = false;
    public Main() {
        initUI();
        addActionEvents();
    }

    @Override
    public void actionPerformed(ActionEvent a) {
        count++;
        if (count == 1 || count == 3 || count == 5 || count == 7 || count == 9) {
            letter = "X";
        } else if (count == 2 || count == 4 || count == 6 || count == 8) {
            letter = "O";
        }

        if (a.getSource() == button1) {
            button1.setText(letter);
            button1.setEnabled(false);
            button1.setFont(new Font("MV Boli" , Font.PLAIN , 35));
        } else if (a.getSource() == button2) {
            button2.setText(letter);
            button2.setEnabled(false);
            button2.setFont(new Font("MV Boli" , Font.PLAIN , 35));
        } else if (a.getSource() == button3) {
            button3.setText(letter);
            button3.setEnabled(false);
            button3.setFont(new Font("MV Boli" , Font.PLAIN , 35));
        } else if (a.getSource() == button4) {
            button4.setEnabled(false);
            button4.setText(letter);
            button4.setFont(new Font("MV Boli" , Font.PLAIN , 35));
        } else if (a.getSource() == button5) {
            button5.setText(letter);
            button5.setEnabled(false);
            button5.setFont(new Font("MV Boli" , Font.PLAIN , 35));
        } else if (a.getSource() == btn6) {
            btn6.setText(letter);
            btn6.setEnabled(false);
            btn6.setFont(new Font("MV Boli" , Font.PLAIN , 35));
        } else if (a.getSource() == btn7) {
            btn7.setEnabled(false);
            btn7.setText(letter);
            btn7.setFont(new Font("MV Boli" , Font.PLAIN , 35));
        } else if (a.getSource() == btn8) {
            btn8.setEnabled(false);
            btn8.setText(letter);
            btn8.setFont(new Font("MV Boli" , Font.PLAIN , 35));
        } else if (a.getSource() == btn9) {
            btn9.setText(letter);
            btn9.setEnabled(false);
            btn9.setFont(new Font("MV Boli" , Font.PLAIN , 35));
        } else if (a.getSource() == btn10) {

            letter = "";
            count = 0;

            button1.setEnabled(true);
            button2.setEnabled(true);
            button3.setEnabled(true);
            button4.setEnabled(true);
            button5.setEnabled(true);
            btn6.setEnabled(true);
            btn7.setEnabled(true);
            btn8.setEnabled(true);
            btn9.setEnabled(true);

            button1.setText("");
            button2.setText("");
            button3.setText("");
            button4.setText("");
            button5.setText("");
            btn6.setText("");
            btn7.setText("");
            btn8.setText("");
            btn9.setText("");
            btn9.setText("");
            label.setText("");
            win = false;
        }
        checkWinner();
    }

    private void initUI() {

        board.setLayout(new GridLayout(3, 3));
        panel.setLayout(new FlowLayout());
        board.add(button1);

        board.add(button2);
        board.add(button3);
        board.add(button4);
        board.add(button5);
        board.add(btn6);
        board.add(btn7);
        board.add(btn8);
        board.add(btn9);

        panel.add(btn10);
        panel.add(label);

        frame.add(board, BorderLayout.CENTER);
        frame.add(panel, BorderLayout.SOUTH);

        frame.setVisible(true);
        frame.setSize(550, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void addActionEvents() {
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btn10.addActionListener(this);
    }

    private void checkWinner() {
        if (button1.getText() == button2.getText() &&
                button2.getText() == button3.getText() &&
                button1.getText() != "" &&
                button2.getText() != "" &&
                button3.getText() != "") {
            win = true;
        } else if (button4.getText() == button5.getText() &&
                button5.getText() == btn6.getText() &&
                button4.getText() != "" &&
                button5.getText() != "" &&
                btn6.getText() != "") {
            win = true;
        } else if (btn7.getText() == btn8.getText() &&
                btn8.getText() == btn9.getText() &&
                btn7.getText() != "" &&
                btn8.getText() != "" &&
                btn9.getText() != "") {
            win = true;
        } else if (button1.getText() == button4.getText() &&
                button4.getText() == btn7.getText() &&
                button1.getText() != "" &&
                button4.getText() != "" &&
                btn7.getText() != "") {
            win = true;
        } else if (button2.getText() == button5.getText() &&
                button5.getText() == btn8.getText() &&
                button2.getText() != "" &&
                button5.getText() != "" &&
                btn8.getText() != "") {
            win = true;
        } else if (button3.getText() == btn6.getText() &&
                btn6.getText() == btn9.getText() &&
                button3.getText() != "" &&
                btn6.getText() != "" &&
                btn9.getText() != "") {
            win = true;
        } else if (button1.getText() == button5.getText() &&
                button5.getText() == btn9.getText() &&
                button1.getText() != "" &&
                button5.getText() != "" &&
                btn9.getText() != "") {
            win = true;
        } else if (button3.getText() == button5.getText() &&
                button5.getText() == btn7.getText() &&
                button3.getText() != "" &&
                button5.getText() != "" &&
                btn7.getText() != "") {
            win = true;
        } else {
            win = false;
        }
        btn10.setText("RESET");
        if (win) {
            label.setText("Congratulations! Player " + letter + ", you win!");
            label.setFont(new Font("MV Boli" , Font.PLAIN , 15));
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);

        } else if (!win && count == 9) {
            label.setText("Tie game!");
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
        }
    }
    public static void main(String[] args) {
        Main game = new Main();
    }
}