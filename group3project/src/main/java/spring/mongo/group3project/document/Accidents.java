package spring.mongo.group3project.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Document(collection = "Accident")
public class Accidents {

    @Id
    private String id;
    private Integer id_accident;
    private Integer severity;
    private String side;
    private String city;
    private String county;
    private String state;
    private Integer zipcode;
    private Double temperature;
    private Double humidity;
    private Double pressure;
    private Double visibility;
    private Double wind_speed;
    private String weather_condition;
    private Integer traffic_signal;
    private String date;
    private String time_start;
    private Integer month_start;
    private Integer year_start;
    private String time_end;
    private String period_time;
    private Location location;

    public Accidents(String id, Integer id_accident, Integer severity, String side, String city, String county, String state, Integer zipcode, Double temperature, Double humidity, Double pressure, Double visibility, Double wind_speed, String weather_condition, Integer traffic_signal, String date, String time_start, Integer month_start, Integer year_start, String time_end, String period_time, Location location) {
        this.id = id;
        this.id_accident = id_accident;
        this.severity = severity;
        this.side = side;
        this.city = city;
        this.county = county;
        this.state = state;
        this.zipcode = zipcode;
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.visibility = visibility;
        this.wind_speed = wind_speed;
        this.weather_condition = weather_condition;
        this.traffic_signal = traffic_signal;
        this.date = date;
        this.time_start = time_start;
        this.month_start = month_start;
        this.year_start = year_start;
        this.time_end = time_end;
        this.period_time = period_time;
        this.location = location;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getId_accident() {
        return id_accident;
    }

    public void setId_accident(Integer id_accident) {
        this.id_accident = id_accident;
    }

    public Integer getSeverity() {
        return severity;
    }

    public void setSeverity(Integer severity) {
        this.severity = severity;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getZipcode() {
        return zipcode;
    }

    public void setZipcode(Integer zipcode) {
        this.zipcode = zipcode;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getHumidity() {
        return humidity;
    }

    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }

    public Double getPressure() {
        return pressure;
    }

    public void setPressure(Double pressure) {
        this.pressure = pressure;
    }

    public Double getVisibility() {
        return visibility;
    }

    public void setVisibility(Double visibility) {
        this.visibility = visibility;
    }

    public Double getWind_speed() {
        return wind_speed;
    }

    public void setWind_speed(Double wind_speed) {
        this.wind_speed = wind_speed;
    }

    public String getWeather_condition() {
        return weather_condition;
    }

    public void setWeather_condition(String weather_condition) {
        this.weather_condition = weather_condition;
    }

    public Integer getTraffic_signal() {
        return traffic_signal;
    }

    public void setTraffic_signal(Integer traffic_signal) {
        this.traffic_signal = traffic_signal;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime_start() {
        return time_start;
    }

    public void setTime_start(String time_start) {
        this.time_start = time_start;
    }

    public Integer getMonth_start() {
        return month_start;
    }

    public void setMonth_start(Integer month_start) {
        this.month_start = month_start;
    }

    public Integer getYear_start() {
        return year_start;
    }

    public void setYear_start(Integer year_start) {
        this.year_start = year_start;
    }

    public String getTime_end() {
        return time_end;
    }

    public void setTime_end(String time_end) {
        this.time_end = time_end;
    }

    public String getPeriod_time() {
        return period_time;
    }

    public void setPeriod_time(String period_time) {
        this.period_time = period_time;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
