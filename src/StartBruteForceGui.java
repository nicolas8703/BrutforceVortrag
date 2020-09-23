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


public class StartBruteForceGui extends JFrame{
    private JTextField eingabePasswort = new JTextField();
    private JPanel hauptPanel = new JPanel();
    private JPanel abschnitt1Panel = new JPanel();
    private JPanel loginPanel = new JPanel();
    private JPanel loginSplitPanel = new JPanel();
    private JButton startBruteForceBttn = new JButton("Start Brute Force");


    public StartBruteForceGui(Login login) throws HeadlessException {
        super("BruteForce starten");
        init(login);
    }

    private void init(Login login) {
        getContentPane().add(hauptPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(200, 100);
        setResizable(false);

        hauptPanel.add(startBruteForceBttn);

        startBruteForceBttn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                BruteForce bruteForce = new BruteForce(login);
            }
        });
    }
}

