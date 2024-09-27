import Interface.Luminosita;
import Interface.Play;
import Interface.Volume;

public class Video extends ElementoMultimediale implements Volume, Luminosita, Play {

    int durata;
    int volume;
    int luminosita;

    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo);
        this.durata=durata;
        this.volume=volume;
        this.luminosita=luminosita;
    }

    @Override
    public void Play() {
        for(int i=0; i < this.durata; i++) {
            System.out.print(this.titolo);
            for (int j = 0; j < this.volume; j++) {
                System.out.print(" !");
            }
            for (int l = 0; l < this.luminosita; l++) {
                System.out.print(" *");
            }

            System.out.println();
        }

    }





    @Override
    public void abbassaVolume() {
        this.volume --;
    }

    @Override
    public void alzaVolume() {
    this.volume ++;
    }

    @Override
    public void aumentaLuminosita() {
        this.luminosita ++;
    }

    @Override
    public void diminuisciLuminosita() {
        this.luminosita --;
    }
}
