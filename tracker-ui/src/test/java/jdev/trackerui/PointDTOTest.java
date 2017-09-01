package jdev.trackerui;

import com.fasterxml.jackson.databind.ObjectMapper;
import jdev.dto.PointDTO;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PointDTOTest {
    private String expected="{\"lat\":54.0,\"lon\":79.0,\"autoID\":\"08jf4wedf\",\"time\":1504244889579}";
    private String autoID = "08jf4wedf";

    @Test
    public void toJson() throws Exception{
        PointDTO point = new PointDTO();
        point.setLat(54);
        point.setLon(79);
        point.setAutoID("08jf4wedf");
        point.setTime(System.currentTimeMillis());
        System.out.println(point.toJson());
        assertTrue(point.toJson().contains("\"lat\":54"));
        assertTrue(point.toJson().contains("\"time\":"));

    }

    @Test
    public void decodeDTO() throws Exception{
        ObjectMapper mapper = new ObjectMapper();
        PointDTO dto = mapper.readValue(expected,PointDTO.class);
        assertEquals(autoID,dto.getAutoID());
        assertEquals(1504244889579L,dto.getTime());

    }
}
