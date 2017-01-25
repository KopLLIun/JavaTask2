package Web;
import GUI.*;

import javax.swing.*;

/**
 * Created by Никита on 24.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        Start start = new Start("Page Scraper");
        start.setVisible(true);
        start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        start.setSize(400,400);
        start.setResizable(false);
        start.setLocationRelativeTo(null);
    }
}
