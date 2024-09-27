public class Audio extends ElementoMultimediale{

    int durata;
    int volume;


    public Audio(String titolo ,int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }

    public void play() {
        for(int i=0; i < this.durata; i++) {
        System.out.print(this.titolo);
            for (int j = 0; j < this.volume; j++) {
                System.out.print(" !");
        }
            System.out.println();
        }

    }

    public void abbassaVolume () {
        this.volume --;
    }
    public void alzaVolume () {
        this.volume ++;
    }

}
