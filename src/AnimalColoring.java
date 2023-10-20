public enum AnimalColoring {
    CAMOUFLAGE("that helps to hide themselves"),
    MONOCHROME("that is just one color"),
    BRIGHT("that helps to attract attention");
    private final String description;

    AnimalColoring(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
}
