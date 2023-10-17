public enum Area {
    FOREST("in the forest"),
    SAVANNAH("in the savannah"),
    JUNGLE("in the jungle"),
    DESERT("in the desert"),
    ICE("at the north or south pole"),
    CAPTIVITY("in captivity because of people");
    private final String description;

    Area(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
