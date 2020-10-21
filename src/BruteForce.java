import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * brutForce
 *
 * @author Nicolas Feige
 * @version 1.0
 * @date 23.09.2020
 */


public class BruteForce extends SwingWorker {
    /**
     * Starts the BruteForce Attack
     */
    private void start(List<String> pwListTop20){
        /**
         * TODO
         * Ergänze hier die BruteForce Methode
         */
        int counter = 0;

        for (int i = 0; i < pwListTop20.size(); i++) {
            if(!Login.passwortGeknackt) {
                if (Login.login.isEnabled()) {
                    counter++;
                    Login.eingabePasswort.setText(pwListTop20.get(i));
                    Login.login.doClick();
                    StartBruteForceGui.eingabePasswort.setText(String.valueOf(counter));
                }
            }
        }
        Login.eingabePasswort.setText("");
        if(!Login.passwortGeknackt) {
            JLabel nachricht = new JLabel("Die Brute Force Methode ist nicht auf dein Passwort gekommen!");
            nachricht.setFont(new Font("SansSerif", Font.BOLD, 25));
            JOptionPane.showMessageDialog(null, nachricht);
        }
    }

    /**
     * Creates the Password List
     */
    private ArrayList<String> createPwList() {
        Scanner s = null;
        try {
            URL url = getClass().getResource("pw/pwList.txt");
            s = new Scanner(new File(url.getPath()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<String> list = new ArrayList<>();
        while (s.hasNext()){
            list.add(s.next());
        }
        s.close();
        return list;
    }

    /**
     * Runs all methods in the background to keep the gui responsive
     */
    @Override
    protected Object doInBackground() {
        ArrayList<String> pwList;
        pwList = createPwList();
        start(pwList);
        return null;
    }
}
