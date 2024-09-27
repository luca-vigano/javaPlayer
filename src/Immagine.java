public class Immagine  extends ElementoMultimediale{

    int luminosita;



    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita=luminosita;
    }

    public void show(){
        System.out.print(this.titolo);
        for(int i = 0; i <this.luminosita; i++){
            System.out.print(" *");
        }
    }

    public void aumentaLuminosita(){
        this.luminosita ++;
    }
    public void diminuisciLuminosita(){
        this.luminosita --;
    }
}
