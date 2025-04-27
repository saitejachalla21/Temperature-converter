import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class temperatureConverter {

    //Declare the GUI Elements
    public static JFrame frmMain;
    public static JLabel lblCelsius;
    public static JTextField  textCelsius;
    public static JLabel lblFahrenheit;
    public static JTextField textFahrenheit;
    public static JButton btnCalculateCtof;
    public static JButton btnCalculateFtoc;

    public static void main(String[] args) {

        // Set up the frame
        frmMain = new JFrame("Temperature Converter by @MassimilianoVisintainer");
        frmMain.setSize(150,200);
        frmMain.setLayout(new FlowLayout());

        //Create GUI Elements
        lblCelsius = new JLabel("Celsius");
        textCelsius = new JTextField(10);
        lblFahrenheit = new JLabel("Fahrenheit");
        textFahrenheit = new JTextField(10);
        btnCalculateCtof = new JButton("Convert C to F");
        //Add ActionListener
        btnCalculateCtof.addActionListener
                (
                        new ActionListener() {

                            public void actionPerformed(ActionEvent e) {

                                String cText = textCelsius.getText();
                                double c = Double.parseDouble(cText);
                                double f = (c * 9 /5) + 32;
                                textFahrenheit.setText(String.valueOf(f));
                            }
                        }

                )
        ;
        btnCalculateFtoc = new JButton("Convert F to C");
        //Add ActionListener
        btnCalculateFtoc.addActionListener
                (
                        new ActionListener() {

                            public void actionPerformed(ActionEvent e) {

                                String fText = textFahrenheit.getText();
                                double f = Double.parseDouble(fText);
                                double c = ((f - 32) * 5 ) / 9;
                                textCelsius.setText(String.valueOf(c));
                            }
                        }
                )
        ;

        // Add the GUI Elements to the frame
        frmMain.add(lblCelsius);
        frmMain.add(textCelsius);
        frmMain.add(lblFahrenheit);
        frmMain.add(textFahrenheit);
        frmMain.add(btnCalculateCtof);
        frmMain.add(btnCalculateFtoc);

        //Make the frame visible
        frmMain.setVisible(true);

    }

}
