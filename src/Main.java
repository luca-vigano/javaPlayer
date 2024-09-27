import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il titolo della prima traccia audio: ");
        String titoloAudio1 = scanner.nextLine();
        System.out.println("Inserisci la durata della prima traccia audio: ");
        int durataAudio1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Inserisci il volume della prima traccia audio: ");
        int volumeAudio1 = Integer.parseInt(scanner.nextLine());


        Audio track1 = new Audio(titoloAudio1, durataAudio1, volumeAudio1);

        System.out.println("Inserisci il titolo della seconda traccia audio: ");
        String titoloAudio2 = scanner.nextLine();
        System.out.println("Inserisci la durata della seconda traccia audio: ");
        int durataAudio2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Inserisci il volume della seconda traccia audio: ");
        int volumeAudio2 = Integer.parseInt(scanner.nextLine());


        Audio track2 = new Audio(titoloAudio2, durataAudio2, volumeAudio2);


        System.out.println("Inserisci il titolo del primo video: ");
        String titoloVideo1 = scanner.nextLine();
        System.out.println("Inserisci la durata del primo video: ");
        int durataVideo1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Inserisci il volume del primo video: ");
        int volumeVideo1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Inserisci la luminosità del primo video: ");
        int luminositaVideo1 = Integer.parseInt(scanner.nextLine());


        Video video1 = new Video(titoloVideo1, durataVideo1, volumeVideo1, luminositaVideo1);

        System.out.println("Inserisci il titolo del secondo video: ");
        String titoloVideo2 = scanner.nextLine();
        System.out.println("Inserisci la durata del secondo video: ");
        int durataVideo2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Inserisci il volume del secondo video: ");
        int volumeVideo2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Inserisci la luminosità del secondo video: ");
        int luminositaVideo2 = Integer.parseInt(scanner.nextLine());


        Video video2 = new Video(titoloVideo2, durataVideo2, volumeVideo2, luminositaVideo2);

        System.out.println("Inserisci il titolo della prima immagine: ");
        String titoloImg1 = scanner.nextLine();
        System.out.println("Inserisci la luminosità della prima immagine: ");
        int luminositaImg1 = Integer.parseInt(scanner.nextLine());

        Immagine img1 = new Immagine(titoloImg1, luminositaImg1);


        System.out.println("MEDIA PLAYER ");
        System.out.println("Comandi: 1-2 audio, 3-4 video, 5 img. exit: termina player");
        System.out.println("Inserisci un comando ");

        ElementoMultimediale[] multimediaArr = {track1, track2, video1, video2, img1};

        boolean attivo =true;
        while (attivo){

            String comando = scanner.nextLine();
            switch (comando){
                case "1", "2", "3", "4", "5":
                   ElementoMultimediale.method(multimediaArr[Integer.parseInt(comando)-1]);
                    break;
                case "exit":
                    attivo=false;
                    break;
                default:
                    System.out.println("Comando non valido");
            }
        }


    }







}