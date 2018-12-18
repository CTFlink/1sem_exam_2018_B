public class MediaVideo extends Media {

    //Klassevariabler
    private String fileFormat;          //filtype (mp4, m4v, mov)
    private int length;                 //længde i sekunder (minutter og sekunder)
    private String resolution;          //opløsing (SD, HD)
    private String photographer;        //fotograf (navn)

    //Her overskrives metoden logToConsole fra Media class'en
    @Override
    public void logToConsol() {
        System.out.println("Navn: " + getName() + " Medietype: Video");
    }
}
