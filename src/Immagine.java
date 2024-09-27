import Interface.Luminosita;
import Interface.Show;

public class Immagine  extends ElementoMultimediale implements Luminosita, Show {

    int luminosita;



    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita=luminosita;
    }

    @Override
    public void Show(){
        System.out.print(this.titolo);
        for(int i = 0; i <this.luminosita; i++){
            System.out.print(" *");
        }
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
