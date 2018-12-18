import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
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
     * Denne metode tager imod et foldernavn og returnerer en stringlist der fortæller hvilke filformater der er i mappen
     * @param folderNavn
     * @return
     */
    public ArrayList readMediaFolder(String folderNavn) {
        File file = new File(folderNavn);
        File[] list = file.listFiles();
        ArrayList<String> stringList = new ArrayList<>();

        //Dette loop samler alle navnene på filerne i en string
        for (File e: list) {
            stringList.add(e.getName());

            String filtype = e.getName().substring(e.getName().lastIndexOf('.') + 1);

            //Her bestemmes det om mediet er video, billede eller artikel
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

    /**
     *
     */
    public void saveToDB() {
        try {
            //Her instantieres et connection object via Connection class så der oprettes forbindelse til tv2 databasen
            Connection con = DriverManager.getConnection("jdbc:mysql://HER SKAL ET LINK IND JEG IKKE KAN FINDE", "root", "");
            Statement st = con.createStatement();


            /**
             * Denne metode bruges til at indsætte data i databasen. Den tager imod værdier fra en string og bruger det
             * i et SQL statement som serveren forstår.
             */
            st.executeUpdate("INSERT INTO mediadata(assetid, name, date, filename) VALUES (" + assetId + ", '" + name
                    + "', '" + created.toString() + "', '" + fileName + "');");


            con.close();

        } catch(Exception e){
            e.printStackTrace();
        }
    }

}
