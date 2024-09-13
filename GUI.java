// * This code was generated with love by Window Builder VS Code extension. * //

import java.awt.*;
import javax.swing.*;





public class GUI {
  static JTextField text_field_0 = new JTextField(15);
  static JButton button_0 = new JButton("Button");

  public static String getText(){

      String Banane = text_field_0.getText();
      return Banane;

  }
  public static boolean wannKnopf(){
      return button_0.getModel().isPressed();
    }

  public static void main() {
    JFrame frame = new JFrame("Anmelden");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(600, 400);
    
    JPanel panel = new JPanel(new GridBagLayout());
    GridBagConstraints constraints = new GridBagConstraints();

    // Fill the layout with placeholders
    for (int row = 0; row < 20; row++) {
        for (int col = 0; col < 15; col++) {
            constraints.gridx = col;
            constraints.gridy = row;
            constraints.weightx = 1.0;
            constraints.weighty = 1.0;
            constraints.fill = GridBagConstraints.BOTH;

            Component filler = Box.createRigidArea(new Dimension(0, 0));
            panel.add(filler, constraints);
        }
    }

    constraints.weightx = 0;
    constraints.weighty = 0;
    constraints.fill = GridBagConstraints.NONE;
    constraints.anchor = GridBagConstraints.NORTHWEST;

    
    
    text_field_0.setPreferredSize(new Dimension(131, 23));
    constraints.gridx = -1;
    constraints.gridy = 10;
    constraints.gridwidth = 5;
    constraints.gridheight = 5;
    panel.add(text_field_0, constraints);
    
    
    button_0.setPreferredSize(new Dimension(53, 27));
    
    constraints.gridx = 0;
    constraints.gridy = 11;
    constraints.gridwidth = 2;
    constraints.gridheight = 2;
    panel.add(button_0, constraints);
    
    frame.add(panel);
    frame.setVisible(true);

  }

}
    