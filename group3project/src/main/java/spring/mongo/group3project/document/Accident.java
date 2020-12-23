package spring.mongo.group3project.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Document
public class Accident {

    @Id
    private Integer id;
    private String severity;
    private Double start_lat;
    private Double start_lng;
    private Integer side;
    private Integer city;
    private Integer county;
    private Integer state;
    private Integer zipcode;
    private Double temperature;
    private Double humidity;
    private Double pressure;
    private Double visibility;
    private Integer wind_direction;
    private Double wind_speed;
    private Integer weather_condition;
    private Integer traffic_signal;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date_start;
    @DateTimeFormat(pattern = "hh:mm:ss")
    private Date time_start;
    private Integer month_start;
    private Integer year_start;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date_end;
    @DateTimeFormat(pattern = "hh:mm:ss")
    private Date time_end;
    private Integer month_end;
    private Integer year_end;

    private Integer total;
    private Integer period_time;

    public Accident(Integer id, String severity, Double start_lat, Double start_lng, Integer side, Integer city, Integer county, Integer state, Integer zipcode, Double temperature, Double humidity, Double pressure, Double visibility, Integer wind_direction, Double wind_speed, Integer weather_condition, Integer traffic_signal, Date date_start, Date time_start, Integer month_start, Integer year_start, Date date_end, Date time_end, Integer month_end, Integer year_end, Integer total, Integer period_time) {
        this.id = id;
        this.severity = severity;
        this.start_lat = start_lat;
        this.start_lng = start_lng;
        this.side = side;
        this.city = city;
        this.county = county;
        this.state = state;
        this.zipcode = zipcode;
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.visibility = visibility;
        this.wind_direction = wind_direction;
        this.wind_speed = wind_speed;
        this.weather_condition = weather_condition;
        this.traffic_signal = traffic_signal;
        this.date_start = date_start;
        this.time_start = time_start;
        this.month_start = month_start;
        this.year_start = year_start;
        this.date_end = date_end;
        this.time_end = time_end;
        this.month_end = month_end;
        this.year_end = year_end;
        this.total = total;
        this.period_time = period_time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public Double getStart_lat() {
        return start_lat;
    }

    public void setStart_lat(Double start_lat) {
        this.start_lat = start_lat;
    }

    public Double getStart_lng() {
        return start_lng;
    }

    public void setStart_lng(Double start_lng) {
        this.start_lng = start_lng;
    }

    public Integer getSide() {
        return side;
    }

    public void setSide(Integer side) {
        this.side = side;
    }

    public Integer getCity() {
        return city;
    }

    public void setCity(Integer city) {
        this.city = city;
    }

    public Integer getCounty() {
        return county;
    }

    public void setCounty(Integer county) {
        this.county = county;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
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

    public Integer getWind_direction() {
        return wind_direction;
    }

    public void setWind_direction(Integer wind_direction) {
        this.wind_direction = wind_direction;
    }

    public Double getWind_speed() {
        return wind_speed;
    }

    public void setWind_speed(Double wind_speed) {
        this.wind_speed = wind_speed;
    }

    public Integer getWeather_condition() {
        return weather_condition;
    }

    public void setWeather_condition(Integer weather_condition) {
        this.weather_condition = weather_condition;
    }

    public Integer getTraffic_signal() {
        return traffic_signal;
    }

    public void setTraffic_signal(Integer traffic_signal) {
        this.traffic_signal = traffic_signal;
    }

    public Date getDate_start() {
        return date_start;
    }

    public void setDate_start(Date date_start) {
        this.date_start = date_start;
    }

    public Date getTime_start() {
        return time_start;
    }

    public void setTime_start(Date time_start) {
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

    public Date getDate_end() {
        return date_end;
    }

    public void setDate_end(Date date_end) {
        this.date_end = date_end;
    }

    public Date getTime_end() {
        return time_end;
    }

    public void setTime_end(Date time_end) {
        this.time_end = time_end;
    }

    public Integer getMonth_end() {
        return month_end;
    }

    public void setMonth_end(Integer month_end) {
        this.month_end = month_end;
    }

    public Integer getYear_end() {
        return year_end;
    }

    public void setYear_end(Integer year_end) {
        this.year_end = year_end;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getPeriod_time() {
        return period_time;
    }

    public void setPeriod_time(Integer period_time) {
        this.period_time = period_time;
    }
}
