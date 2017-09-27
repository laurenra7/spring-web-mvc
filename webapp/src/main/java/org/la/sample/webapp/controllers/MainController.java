package org.la.sample.webapp.controllers;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by laurenra on 9/14/17.
 */
@Controller
public class MainController {

    private static final Logger jullog = java.util.logging.Logger.getLogger(MainController.class.getName());

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView showIndex(HttpServletRequest request, HttpServletResponse response) {

        jullog.info("jullog show index page...");

        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }
}
