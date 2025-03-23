/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ReservacionHotel.GUI;

import java.awt.*;
import javax.swing.border.Border;

public class RoundedBorder implements Border {
    private int radius;

    public RoundedBorder(int radius) {
        this.radius = radius; // Define el radio de las esquinas
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(this.radius + 5, this.radius + 5, this.radius + 5, this.radius + 5);
    }

    @Override
    public boolean isBorderOpaque() {
        return true;
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.drawRoundRect(x, y, width - 1, height - 1, radius, radius); // Dibuja el borde redondeado
    }
}
