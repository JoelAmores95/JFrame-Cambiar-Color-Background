import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FourButtons extends JFrame {
  
  public FourButtons(String title) {
    super(title);

    // Crear los botones
    JButton redButton = new JButton("Rojo");
    JButton greenButton = new JButton("Verde");
    JButton blueButton = new JButton("Azul");
    JButton grayButton = new JButton("Gris");

    // Crear el panel
    JPanel panel = new JPanel();
    panel.add(redButton);
    panel.add(greenButton);
    panel.add(blueButton);
    panel.add(grayButton);

    // Agregar ActionListeners a los botones
    redButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        // Cambiar el color de fondo del panel a rojo
        panel.setBackground(Color.RED);
      }
    });

    greenButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        // Cambiar el color de fondo del panel a verde
        panel.setBackground(Color.GREEN);
      }
    });

    blueButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        // Cambiar el color de fondo del panel a azul
        panel.setBackground(Color.BLUE);
      }
    });

    grayButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        // Cambiar el color de fondo del panel a gris
        panel.setBackground(Color.GRAY);
      }
    });

    // Agregar el panel al JFrame
    add(panel);

    // Configurar el tamaño y la visibilidad de la ventana
    setSize(150, 75);
    setVisible(true);
  }

}
