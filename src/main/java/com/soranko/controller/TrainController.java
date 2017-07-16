package com.soranko.controller;

/**
 * Created by kallesoranko on 11/07/2017.
 */


import com.soranko.model.Train;
import com.soranko.service.TrainServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping(value = "/rata.digitraffic.fi/api/v1/all-trains")
public class TrainController {

    @Value("https://rata.digitraffic.fi/api/v1/all-trains")
    String url;

    @Autowired
    TrainServiceImpl trainService;



    /*
    @RequestMapping(path="/train/{trainNumber}", method= RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public String postCustomer(@RequestParam(value = "trainNumber") int trainNumber){
        return trainService.findBytrainNumber(trainNumber);
    }
    */

    @RequestMapping(path="/train/{trainNumber}", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
    public String getCategory(@RequestParam(value = "trainNumber") int trainNumber) {
        RestTemplate restTemplate = new RestTemplate();
        Train response = restTemplate.getForObject(url, Train.class);
        return response.getTrainCategory();
    }

    /*
    @RequestMapping(value = "/train/{trainNumber}", method = RequestMethod.GET)
    public ResponseEntity<?> getUser(@PathVariable("trainNumber") int trainNumber) {
        //logger.info("Fetching User with id {}", id);
        String train = trainService.findBytrainNumber(trainNumber);
        return new ResponseEntity<String>(train, HttpStatus.OK);
    }*/


    /*
    private static final String template1 = "Train's category is, %s!";
    private static final String template2 = "Trains that go through the given station, %s!";

    ObjectMapper mapper = new ObjectMapper();

    @RequestMapping(path="/train", method= RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Train postTrain(@RequestBody int trainNumber){
        return new Train(trainNumber);
    }
    */

/*
    @RequestMapping(path="/customers", method= RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Train postCustomer(@RequestBody Train train){
        return Train();
    }
*/

    //JSON from URL to Object
    //Train obj = mapper.readValue(new URL("https://rata.digitraffic.fi/api/v1/all-trains.json"), Train.class);

    /*
    private final AtomicLong counter = new AtomicLong();

    public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
        InputStream is = new URL(url).openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
            JSONObject json = new JSONObject(jsonText);
            return json;
        } finally {
            is.close();
        }
    }
    */

        //JSONObject json = new JSONObject(readUrl("https://rata.digitraffic.fi/api/v1/all-trains"));

        //String title = (String) json.get("title");


    //String json = readUrl("http://www.javascriptkit.com/"
    //        + "dhtmltutors/javascriptkit.json");

    /*
    InputStream in = new java.net.URL( "https://rata.digitraffic.fi/api/v1/all-trains" ).openStream();

    try {
        System.out.println( IOUtils.toString( in ) );
    }
    catch (Exception e) {
        e.printStackTrace();
    }
    finally {
        IOUtils.closeQuietly(in);
    }
    */

    /*
    java.net.URL website = new URL("https://rata.digitraffic.fi/api/v1/all-trains");
    URLConnection conn = url.openConnection();
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream(), StandardCharsets.UTF_8))) {
        pageText = reader.lines().collect(Collectors.joining("\n"));
    */

    /*
    @RequestMapping("https://rata.digitraffic.fi/api/v1/all-trains")
    //@Produces(MediaType.APPLICATION_JSON)
    //@RequestMapping("/data")
    public @ResponseBody Map<String, String> getData(Model model) {
    }
    */

    /*
    @RequestMapping("/train")
    public Train train(@RequestParam(value="trainCategory", defaultValue="") String trainCategory) {
        return new Train(2328, String.format(template1, trainCategory));
    }
    */

    /*
    @RequestMapping("/route")
    public Route reitti(@RequestParam(value="stationShortCode", defaultValue="") String code) {
        List<Integer> route = new LinkedList<Integer>();
                new Route(String.format(template2, code));
    }
    */

    /*
    @RequestMapping(value = "/train", method = RequestMethod.GET)
    public Train juna(@RequestParam(value="trainCategory", defaultValue="") String trainCategory) {
        return new Train(String.format(template1, trainCategory));
    }
    */
}

