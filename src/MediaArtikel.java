public class MediaArtikel extends Media {

    //Klassevariabler
    private String author;          //forfatter (navn)
    private String articleText;     //artikeltekst
    private String picture;         //tilhørende billede

    //Her overskrives metoden logToConsole fra Media class'en
    @Override
    public void logToConsol() {
        System.out.println("Navn: " + getName() + " Medietype: Artikel");
    }
}
