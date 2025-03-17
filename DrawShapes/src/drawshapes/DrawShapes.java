package DrawShapes;

import javax.swing.*;
import java.awt.*;

public class DrawShapes extends JPanel {

    Font font;
    Color redColor;
    Color blueColor;
    Color backgroundColor;

    public DrawShapes() {
        // Mengatur font dan warna
        font = new Font("Arial", Font.ITALIC, 18);
        redColor = Color.RED;
        backgroundColor = Color.ORANGE;
        blueColor = new Color(0, 0, 122);
        
        // Mengatur warna background panel
        setBackground(backgroundColor);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Mengatur font
        g.setFont(font);

        // Menampilkan teks
        g.drawString("Draw Shapes", 90, 20);

        // Menggambar persegi panjang
        g.setColor(blueColor);
        g.drawRect(120, 120, 120, 120);
        g.fillRect(115, 115, 90, 90);

        // Menggambar lingkaran
        g.setColor(redColor);
        g.fillArc(110, 110, 50, 50, 0, 360);

        // Menggambar persegi panjang lainnya
        g.setColor(Color.CYAN);
        g.drawRect(50, 50, 50, 50);
        g.fillRect(50, 50, 60, 60);
    }

    public static void main(String[] args) {
        // Membuat JFrame untuk menampilkan panel
        JFrame frame = new JFrame("DrawShapes");
        DrawShapes panel = new DrawShapes();

        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
