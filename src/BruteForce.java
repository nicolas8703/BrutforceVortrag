import java.util.ArrayList;
import java.util.List;

/**
 * brutForce
 *
 * @author Nicolas Feige
 * @version 1.0
 * @date 23.09.2020
 */


public class BruteForce {

    public BruteForce(Login login) {
        List<String> pwListTop20;
        pwListTop20 = createPwList();
        start(pwListTop20);
    }
    private void start(List<String> pwListTop20){
        for (int i = 0; i < pwListTop20.size(); i++) {
            Login.eingabePasswort.setText(pwListTop20.get(i));
            Login.login.doClick();
        }
    }


    private List<String> createPwList() {
        List<String> pwListTop20 = new ArrayList<>();
        pwListTop20.add("12345");
        pwListTop20.add("1");
        pwListTop20.add("12");
        pwListTop20.add("123");
        pwListTop20.add("1234");
        pwListTop20.add("123456");
        pwListTop20.add("123456789");
        pwListTop20.add("test1");
        pwListTop20.add("password");
        pwListTop20.add("12345678");
        pwListTop20.add("zinch");
        pwListTop20.add("g_czechout");
        pwListTop20.add("asdf");
        pwListTop20.add("qwerty");
        pwListTop20.add("1234567890");
        pwListTop20.add("1234567");
        pwListTop20.add("Aa123456");
        pwListTop20.add("Aa123456.");
        pwListTop20.add("iloveyou");
        pwListTop20.add("1234");
        pwListTop20.add("abc123");
        pwListTop20.add("111111");
        pwListTop20.add("123123");
        pwListTop20.add("dubsmash");
        pwListTop20.add("test");
        pwListTop20.add("princess");
        pwListTop20.add("qwertyuiop");
        pwListTop20.add("sunshine");
        pwListTop20.add("BvtTest123");
        pwListTop20.add("11111");
        pwListTop20.add("ashley");
        pwListTop20.add("00000");
        pwListTop20.add("000000");
        pwListTop20.add("password1");
        pwListTop20.add("monkey");

        return pwListTop20;
    }
}
