package org.launchcode.enumerableplanets.data;

public enum Planets {

        MERCURY("mercury", 88),
        VENUS("venus", 225),
        EARTH("earth", 365),
        MARS("mars", 687),
        JUPITER("jupiter", 4333),
        SATURN("saturn", 10759),
        URANUS("uranus", 30687),
        NEPTUNE("neptune", 602000);

    private String displayPlanets;

    private Integer yearLength;

    Planets(String displayPlanets, Integer yearLength){
        this.displayPlanets = displayPlanets;
        this.yearLength = yearLength;
    }

    public String getDisplayPlanets() {
        return displayPlanets;
    }

    public Integer getYearLength() {
        return yearLength;
    }
}
