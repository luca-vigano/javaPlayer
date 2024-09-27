import javax.swing.*;
import java.awt.*;

public abstract class ElementoMultimediale{

    String titolo;

    public ElementoMultimediale(String titolo) {
        this.titolo = titolo;
    }

    static void method (ElementoMultimediale em){
        if (em instanceof Audio) {
            Audio a = (Audio) em;
            a.Play();
        } else if (em instanceof Video) {
            Video v = (Video) em;
            v.Play();
        }else if (em instanceof Immagine) {
            Immagine i = (Immagine) em;
            i.Show();
    }}
}
