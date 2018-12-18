//her importaeres en række libraries som vi gør brug af i programmet;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


/**
 *  Hver mediefil hos TV2 skal have et unikt ID, og denne klasse hjælper med at genrere unikke ID'er
 */
public class MediaID {

    //her initialiseres en klassevariabel kaldet latestId
    private static int latestId = 100;

    /**
     * Denne metode instantierer først et file object hvorefter den først prøver at læse filens id, og dernæst giver
     * objectet et id hvis det ikke findes i forvejen
     * @return
     */
    public static int generate() {

        File file = new File("media_id.txt");

        // Låser filen op før adgang
        // file.setWritable(true);

        //det hele er pakket ind i en try / catch statement der fange evt. fejl ved filhåndteringen
        try {


            //Her tjekkes for om filen allerede findes. Hvis den gør indlæses filens id nr.
            if (file.exists()) {
                FileReader fileReader = new FileReader(file);
                Scanner scanner = new Scanner(file);
                latestId = (int) scanner.nextInt();
            }

            //ellers oprettes der en ny fil som får et id der er 1 større en forrige fil
            latestId++;

            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(Integer.toString(latestId));
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Låser filen ned for at den ikke redigeres ved en fejl
        // file.setReadOnly();

        return latestId;
    }

}