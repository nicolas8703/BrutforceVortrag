import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * startGui
 *
 * @author Nicolas Feige
 * @version 1.0
 * @date 23.09.2020
 */


    public class StartGui extends JFrame {
    private JTextField eingabePasswort = new JTextField();
    private JPanel hauptPanel = new JPanel();
    private JPanel abschnitt1Panel = new JPanel();
    private JPanel loginPanel = new JPanel();
    private JPanel loginSplitPanel = new JPanel();
    private JButton login = new JButton("Start");
    private JLabel titelEingabePasswort = new JLabel("Passwort festlegen: ");

    public StartGui() throws HeadlessException {
        super("Passwort festlegen");
        init();
    }

    private void init() {
        getContentPane().add(hauptPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(330, 150);
        setResizable(false);

        hauptPanel.setLayout(new GridLayout(2, 1));
        hauptPanel.add(abschnitt1Panel);
        abschnitt1Panel.setLayout(new GridLayout(2, 1));
        abschnitt1Panel.add(titelEingabePasswort);
        abschnitt1Panel.add(eingabePasswort);

        hauptPanel.add(loginPanel);
        loginPanel.setLayout(new GridLayout(2, 1));
        loginPanel.add(loginSplitPanel);
        loginPanel.add(login);
        login.setFont(new Font("SansSerif", Font.BOLD, 12));

        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(!eingabePasswort.getText().equals("")){
                    Login login = new Login(eingabePasswort.getText());
                    StartBruteForceGui startBruteForceGui = new StartBruteForceGui(login);
                    dispose();
                }
            }
        });
    }
}
