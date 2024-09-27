import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public abstract class ElementoMultimediale{

    String titolo;

    public ElementoMultimediale(String titolo) {
        this.titolo = titolo;
    }

    static void method (ElementoMultimediale em){
        Scanner s = new Scanner(System.in);
        if (em instanceof Audio) {
            Audio a = (Audio) em;
            a.Play();
            System.out.println("vuoi alzare(up) abbassare(down) il volume?");
            String command = s.nextLine();
            if (command == "up") {
                a.alzaVolume();
            } else {
             a.abbassaVolume();
            }
            a.Play();
        } else if (em instanceof Video) {
            Video v = (Video) em;
            v.Play();
            System.out.println("vuoi alzare(up) abbassare(down) il volume?");
            String command = s.nextLine();
            if (command == "up") {
                v.alzaVolume();
            } else {
                v.abbassaVolume();
            }
            v.Play();
            System.out.println("vuoi alzare(up) abbassare(down) la luminosità?");
             command = s.nextLine();
            if (command == "up") {
                v.aumentaLuminosita();
            } else {
                v.diminuisciLuminosita();
            }
            v.Play();

        }else if (em instanceof Immagine) {
            Immagine i = (Immagine) em;
            i.Show();
            System.out.println("vuoi alzare(up) abbassare(down) la luminosità?");
            String command = s.nextLine();
            if (command == "up") {
                i.aumentaLuminosita();
            } else {
                i.diminuisciLuminosita();
            }
            i.Show();
    }}
}
