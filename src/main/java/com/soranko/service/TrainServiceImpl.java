
package com.soranko.service;

import com.soranko.model.Train;
import com.sun.corba.se.impl.presentation.rmi.DynamicMethodMarshallerImpl;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.ws.rs.HttpMethod;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by kallesoranko on 16/07/2017.
 */

@Service
public class TrainServiceImpl {

    private static List<Train> list;
    static {
        list = populate();
    }
    RestTemplate restTemplate = new RestTemplate();
    String url = "https://rata.digitraffic.fi/api/v1/all-trains";

    /*
    ParameterizedTypeReference<Map<String, List<Train>>> typeRef =
            new ParameterizedTypeReference<Map<String, List<Train>>>() {};

    ResponseEntity<Map<String, List<Train>>> response =
            restTemplate.exchange(url, HttpMethod.GET,  null, typeRef);

    System.out.println(response.getBody().get("trainCategory"));
    */

    //List<Train> list = restTemplate.getForObject(url, Train.class);

    public String findBytrainNumber(int trainNumber) {
        for(Train train : list){
            if(train.getTrainNumber() == trainNumber) {
                return train.getTrainCategory();
            }
        }
        return null;
    }

    private static List<Train> populate(){
        List<Train> list = new ArrayList<Train>();
        list.add(new Train(1,"jee"));
        list.add(new Train(2,"jaa"));
        list.add(new Train(3,"jii"));
        list.add(new Train(4,"juu"));
        list.add(new Train(5,"joo"));
        return list;

    }

}

