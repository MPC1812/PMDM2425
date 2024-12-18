package dam.pmdm.tarea02;

public class CharacterData {
    private final String image;
    private final String name;
    private final String description;
    private final String skills;

    public CharacterData(String image, String name, String description, String skills) {
        this.image = image;
        this.name = name;
        this.description = description;
        this.skills = skills;
    }

    public String getImage() {
        return image;
    }

    public String getName() {
        return name;
    }


    public String getDescription() {
        return description;
    }

    public String getSkills() {
        return skills;
    }

}
