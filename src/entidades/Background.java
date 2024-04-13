package entidades;
import java.awt.*;
import javax.swing.*;

public class Background extends JDesktopPane{
    private Image fondo;

    public Background(Image fondo) {
        this.fondo = fondo;
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (fondo != null) {
            // Dibujar la imagen de fondo en el tamaño del JDesktopPane
            g.drawImage(fondo, 0, 0, getWidth(), getHeight(), this);
        }
    }
}
