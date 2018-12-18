import java.io.File;
import java.time.Instant;
import java.util.Date;

public class Media {

    //en række forskellige klasse variable der bruges i programmmet. Der er private så de kan som udgangspunkt
    // kun ændres og bruges i klassen
    private int assetId;
    private String name;
    private Date created = new Date();
    private String fileName;

    /**
     * dette er klassens constructor som instantiere et nyt Media object
     */
    public Media() {
        assetId = MediaID.generate();
        created = Date.from(Instant.now());
    }

    //Her kommer der så en række getters og setters der giver mulighed for at læse og redigere ovenstående variable

    public int getAssetId() {
        return assetId;
    }

    public void setAssetId(int assetId) {
        this.assetId = assetId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Her bruges @override annotationen der spørger programmet om vi nu rent faktisk overskriver metoden som vi har i
     * sinde. Det er en måde at checke efter stavefejl etc.
     * metoden samler nogle bestemte variable i en string som returneres
     * @return
     */
    @Override
    public String toString() {
        return "Media{" +
                "assetId=" + assetId +
                ", name='" + name + '\'' +
                ", created=" + created +
                ", fileName='" + fileName + '\'' +
                '}';
    }
}