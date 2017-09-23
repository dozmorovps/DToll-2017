package Services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import de.micromata.opengis.kml.v_2_2_0.Kml;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;




@Service
public class GPSService {

    private static final Logger log = LoggerFactory.getLogger(GPSService.class);

    Kml kml = new Kml();

    private double speed; //скорость
    private double latitude; // широта
    private double longitude; // долгота
    private double azimuth; // азимут

    public GPSService(){

    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getAzimuth() {
        return azimuth;
    }

    public void setAzimuth(double azimuth) {
        this.azimuth = azimuth;
    }

    public String toJson() throws JsonProcessingException{
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(this);
    }


    public void getCoordinate() {

    }
}
