import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * login
 *
 * @author Nicolas Feige
 * @version 1.0
 * @date 23.09.2020
 */


public class Login extends JFrame {

    static JTextField eingabePasswort = new JTextField();
    private JPanel hauptPanel = new JPanel();
    private JPanel abschnitt1Panel = new JPanel();
    private JPanel loginPanel = new JPanel();
    private JPanel loginSplitPanel = new JPanel();
    static JButton login = new JButton("Login");
    private JLabel titelEingabePasswort = new JLabel("Passwort: ");

    public Login(String passwort) throws HeadlessException {
        super("Login");
            init(passwort);

        }

    private void init(String passwort) {
        getContentPane().add(hauptPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(330, 150);
        setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
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
                if(eingabePasswort.getText().equals(passwort)){
                    JLabel nachricht = new JLabel("Du hast das Richtige Passwort herausgefunden!");
                    nachricht.setFont(new Font("SansSerif", Font.BOLD, 25));
                    JOptionPane.showMessageDialog(null, nachricht);
                }

            }
        });
    }
}

