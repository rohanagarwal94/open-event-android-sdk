package openevent.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name",
        "latitude",
        "longitude",
        "floor",
        "room"
})
public class Microlocation {

    @JsonProperty
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("latitude")
    private String latitude;
    @JsonProperty("longitude")
    private String longitude;
    @JsonProperty("floor")
    private String floor;
    @JsonProperty("room")
    private String room;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("latitude")
    public String getLatitude() {
        return latitude;
    }

    @JsonProperty("latitude")
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    @JsonProperty("longitude")
    public String getLongitude() {
        return longitude;
    }

    @JsonProperty("longitude")
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @JsonProperty("floor")
    public String getFloor() {
        return floor;
    }

    @JsonProperty("floor")
    public void setFloor(String floor) {
        this.floor = floor;
    }

    @JsonProperty("room")
    public String getRoom() {
        return room;
    }

    @JsonProperty("room")
    public void setRoom(String room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Microlocation{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", floor='" + floor + '\'' +
                ", room='" + room + '\'' +
                '}';
    }
}
