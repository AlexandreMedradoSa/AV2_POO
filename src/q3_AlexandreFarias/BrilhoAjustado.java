package q3_AlexandreFarias;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class BrilhoAjustado {
    public static void main(String[] args) {
        try {
            BufferedImage image = ImageIO.read(new File("caminho/imagem.jpg"));

            double brightnessFactor = 1.5;

            for (int y = 0; y < image.getHeight(); y++) {
                for (int x = 0; x < image.getWidth(); x++) {
                    int rgb = image.getRGB(x, y);
                    int alpha = (rgb >> 24) & 0xFF;
                    int red = (int) ((rgb >> 16 & 0xFF) * brightnessFactor);
                    int green = (int) ((rgb >> 8 & 0xFF) * brightnessFactor);
                    int blue = (int) ((rgb & 0xFF) * brightnessFactor);
                    int newRGB = (alpha << 24) | (red << 16) | (green << 8) | blue;
                    image.setRGB(x, y, newRGB);
                }
            }

            File output = new File("caminho/imagem_ajustada.jpg");
            ImageIO.write(image, "jpg", output);

            System.out.println("Ajuste de brilho concluído. Imagem salva em 'imagem_ajustada.jpg'.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
