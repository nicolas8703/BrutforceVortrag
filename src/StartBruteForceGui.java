import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * StartBruteForceGui
 *
 * @author Nicolas Feige
 * @version 1.0
 * @date 23.09.2020
 */


class StartBruteForceGui extends JFrame{
    private JPanel hauptPanel = new JPanel();
    private JButton startBruteForceBttn = new JButton("Start Brute Force");
    static JLabel eingabePasswort = new JLabel();

    StartBruteForceGui() throws HeadlessException {
        super("BruteForce starten");
        init();
    }
    //initialize the Start Gui to enter the Password
    private void init() {
        getContentPane().add(hauptPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(200, 100);
        setResizable(false);

        hauptPanel.add(startBruteForceBttn);
        hauptPanel.add(eingabePasswort);
        eingabePasswort.setText("0");

        //starts the BruteForce Attack
        startBruteForceBttn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                BruteForce bruteForce = new BruteForce();
                bruteForce.execute();
            }
        });
    }
}

