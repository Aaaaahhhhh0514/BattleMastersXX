import java.util.List;
import java.util.ArrayList;

/**
 * Domain class representing each game area
 */
public class Domain {
    private String name;
    private String realm; // Regular or Mythic
    private String description;
    private List<String> locations;
    private String domainBoss;
    private List<String> specialShops;
    
    public Domain(String name, String realm, String description, List<String> locations, 
                  String domainBoss, List<String> specialShops) {
        this.name = name;
        this.realm = realm;
        this.description = description;
        this.locations = new ArrayList<>(locations);
        this.domainBoss = domainBoss;
        this.specialShops = new ArrayList<>(specialShops);
    }

    public Domain(String name) {
        this.name = name;
        this.realm = "Regular";
        this.description = "A mysterious domain.";
        this.locations = new ArrayList<>();
        this.domainBoss = "Unknown";
        this.specialShops = new ArrayList<>();
    }
    
    // Getters
    public String getName() { return name; }
    public String getRealm() { return realm; }
    public String getDescription() { return description; }
    public List<String> getLocations() { return locations; }
    public String getDomainBoss() { return domainBoss; }
    public List<String> getSpecialShops() { return specialShops; }
}
