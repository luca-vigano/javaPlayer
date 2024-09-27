import Interface.Luminosita;
import Interface.Play;
import Interface.Volume;

public class Audio extends ElementoMultimediale implements Volume, Play {

    int durata;
    int volume;


    public Audio(String titolo ,int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }



    @Override
    public void Play() {
        for(int i=0; i < this.durata; i++) {
        System.out.print(this.titolo);
            for (int j = 0; j < this.volume; j++) {
                System.out.print(" !");
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
}
