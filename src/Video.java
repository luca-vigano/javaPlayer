public class Video extends ElementoMultimediale{

    int durata;
    int volume;
    int luminosita;

    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo);
        this.durata=durata;
        this.volume=volume;
        this.luminosita=luminosita;
    }


    public void play() {
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

    public void abbassaVolume () {
        this.volume --;
    }
    public void alzaVolume () {
        this.volume ++;
    }
    public void aumentaLuminosita(){
        this.luminosita ++;
    }
    public void diminuisciLuminosita(){
        this.luminosita --;
    }

}
