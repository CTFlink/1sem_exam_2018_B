import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class MediaManager {

    /**
     * Denne metode læser hvilke filer der er i media mappen
     * @param folderNavn
     */
    public void logMediaFolder(String folderNavn) {
        File file = new File("C:\Users\tryde\Documents\GitHub\1sem_exam_2018_B");
        File[] list = file.listFiles();

        //her looper jeg igennem arraylisten af filer og printer filnavnet ud for hvert loop
        for (File abc: list) {
            System.out.println(abc.getName());
        }

    }

    /**
     * Denne metode
     * @param folderNavn
     * @return
     */
    public ArrayList readMediaFolder(String folderNavn) {
        File file = new File(folderNavn);
        File[] list = file.listFiles();
        ArrayList<String> stringList = new ArrayList<>();

        for (File e: list) {
            stringList.add(e.getName());

            String filtype = e.getName().substring(e.getName().lastIndexOf('.') + 1);

            if (filtype.equals("mp4") || filtype.equals("m4v") || filtype.equals("mov")) {
                MediaVideo video = new MediaVideo();
            } else if (filtype.equals("jpg") || filtype.equals("png") || filtype.equals("gif")) {
                MediaBillede billede = new MediaBillede();
            } else if (filtype.equals("txt")) {
                MediaArtikel artikel = new MediaArtikel();
            }
        }

        return stringList;
    }
}
