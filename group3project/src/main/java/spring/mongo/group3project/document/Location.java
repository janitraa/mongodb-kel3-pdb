package spring.mongo.group3project.document;

public class Location {

    private Coordinates coordinates;

    private String type;

    public Location(Coordinates coordinates, String type) {
        this.coordinates = coordinates;
        this.type = type;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
