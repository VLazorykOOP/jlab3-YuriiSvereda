public enum MammalsOrder {

    INSECTIVORES("insectivores"),
    BATS("bats"),
    RODENTS("rodents"),
    HARES("hares"),
    CARNIVORES("carnivores"),
    PINNIPEDS("pinnipeds"),
    CETACEANS("cetaceans"),
    CLOVEN_HOOFED("cloven-hoofed"),
    UNGULATES("ungulates"),
    PRIMATES("primates");
    private final String description;

    MammalsOrder(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
