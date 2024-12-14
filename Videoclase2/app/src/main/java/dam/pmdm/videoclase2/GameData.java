package dam.pmdm.videoclase2;

public class GameData {

    private final String image;
    private final String name;
    private final int releaseYear;
    private final String description;
    private final String platforms;

    public GameData(String image, String name, int releaseYear, String description, String platforms) {
        this.image = image;
        this.name = name;
        this.releaseYear = releaseYear;
        this.description = description;
        this.platforms = platforms;
    }

    public String getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public int getReleaseYear(){
        return releaseYear;
    }

    public String getDescription(){
        return description;
    }

    public String getPlatforms(){
        return platforms;
    }
}
