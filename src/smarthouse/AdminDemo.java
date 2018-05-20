package smarthouse;

/**
 *
 * @author stevenpatton
 */
import javax.swing.*;

public class AdminDemo extends JFrame {

    private JPanel keypadPanel;

    public static void main(String[] args) {

        //ClockRadioKeyPad key = new ClockRadioKeyPad();
        RoomKeypad GUI = new RoomKeypad();
        //new DoorKeypad().setVisible(true);
        AdminGUI x = new AdminGUI();
//        ClockRadioGUI a = new ClockRadioGUI();
        ClockRadioKeyPad a = new ClockRadioKeyPad();
    }
}
