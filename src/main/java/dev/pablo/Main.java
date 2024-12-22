package dev.pablo;

import com.formdev.flatlaf.FlatDarkLaf;
import dev.pablo.view.VPrincipal;

// Main class
public class Main {

    // Main driver method
    public static void main(String[] args) {
        FlatDarkLaf.setup();
        VPrincipal p = new VPrincipal();
        p.setLocationRelativeTo(null);
        p.setVisible(true);
    }

}