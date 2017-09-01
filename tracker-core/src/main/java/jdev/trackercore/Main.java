package jdev.trackercore;

import jdev.dto.PointDTO;

public class Main {

    public static void main(String...args)throws Exception{
        for(int i=0;i<5;i++){
            PointDTO point = new PointDTO();
            point.setLat(43);
            System.out.println(point.toJson());
            Thread.sleep(1000);
        }
    }
}
