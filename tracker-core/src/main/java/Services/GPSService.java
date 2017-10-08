package Services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import de.micromata.opengis.kml.v_2_2_0.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


@Service
public class GPSService {

    private static final Logger log = LoggerFactory.getLogger(GPSService.class);

    private double speed; //скорость
    private double latitude; // широта
    private double longitude; // долгота
    private double azimuth; // азимут

    private Random rd = new Random();

    public GPSService() {

    }

    public String toJson() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(this);
    }


    public void getCoordinate() {
        speed = rd.nextDouble();
        latitude = rd.nextDouble();
        longitude = rd.nextDouble();
        azimuth = rd.nextDouble();
    }
}
