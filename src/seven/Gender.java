package seven;

public enum Gender {

    FEMALE("Ženski", "Nježniji rod"),
    MALE("Muški", "Grublji rod"),
    UNKNOWN ("Nepoznato", "Nepoznati opis")
    ;

    private String name;
    private String description;

    private Gender (String n, String d){
        this.name = n;
        this.description = d;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
