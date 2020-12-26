package spring.mongo.group3project.document;

public class Coordinates {

    private Float start_lat;
    private Float start_lng;

    public Coordinates(Float start_lat, Float start_lng) {
        this.start_lat = start_lat;
        this.start_lng = start_lng;
    }

    public Float getStart_lat() {
        return start_lat;
    }

    public void setStart_lat(Float start_lat) {
        this.start_lat = start_lat;
    }

    public Float getStart_lng() {
        return start_lng;
    }

    public void setStart_lng(Float start_lng) {
        this.start_lng = start_lng;
    }
}
