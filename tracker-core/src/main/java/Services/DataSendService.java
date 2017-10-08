package Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class DataSendService {

    @Autowired
    private DataPeekService dataPeekService;

    @Scheduled(cron = "${cron.init}")
    public void getCoordinate() throws InterruptedException {
        System.out.println(dataPeekService.take());
    }
}
