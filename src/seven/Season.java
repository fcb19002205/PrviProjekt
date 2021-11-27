package seven;

public enum Season {

    Winter("Zima"),
    Spring("Proljeće"),
    Summer("Ljeto"),
    Autumn("Jesen");

    private String name;

    private Season(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
