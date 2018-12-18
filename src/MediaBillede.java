public class MediaBillede extends Media {

    //Klassevariabler
    private String fileFormat;         //(jpg, png, gif)
    private int width;              //bredde i pixels
    private int height;             //højde i pixels
    private String photographer;    //fotograf (navn)

    //Her overskrives metoden logToConsole fra Media class'en
    @Override
    public void logToConsol() {
        System.out.println("Navn: " + getName() + " Medietype: Billede");
    }
}
