package org.la.sample.webapp.controllers;

import org.la.sample.webapp.model.Car;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class StatusEndpoint {

    private static final Logger log = LoggerFactory.getLogger(StatusEndpoint.class);

    @RequestMapping(value = "/status", method = RequestMethod.GET)
    @ResponseBody
    public String getStatus() {
        log.info("Check status");

        return "We're good.";
    }

    @RequestMapping(value = "/sample/json", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Car getJsonSample() {
        log.info("Get sample JSON");
        Car car = new Car();
        car.setId(23);
        car.setMake("Toyota");
        car.setModel("Sienna");
        car.setYear("2007");
        return car;

    }
}
