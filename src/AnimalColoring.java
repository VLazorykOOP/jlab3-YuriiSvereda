public enum AnimalColoring {
    CAMOUFLAGE("coloring that helps to hide themselves"),
    MONOCHROME("just one color"),
    BRIGHT("coloring that helps to attract attention");
    private final String description;

    AnimalColoring(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
}
