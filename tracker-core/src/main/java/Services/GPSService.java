package Services;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import de.micromata.opengis.kml.v_2_2_0.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


@Component
public class GPSService {

    private double speed; //скорость

    private double latitude; // широта

    private double longitude; // долгота

    private double azimuth; // азимут

    public String toJson() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(this);
    }


    public void getCoordinate() {
        Random rd = new Random();
        speed = rd.nextDouble();
        latitude = rd.nextDouble();
        longitude = rd.nextDouble();
        azimuth = rd.nextDouble();
    }
}
