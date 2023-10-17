public enum Habitat {
    TREES("on the trees"),
    GROUND("on the ground"),
    UNDERGROUND("underground"),
    UNDERWATER("underwater"),
    BODY("in the body of another");
    private final String description;

    Habitat(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
