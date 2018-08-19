package com.rakesh.areaofcircle.areaofcircle;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/calculateAOC")
public class aocController {

    private org.slf4j.Logger log = LoggerFactory.getLogger(aocController.class);

    @Autowired
    private aocService aocService;

    @GetMapping(path = {"/{radius}"})
    public String calculateAOC(@PathVariable("radius") double radius) {
        return aocService.calculateAOC(radius);
    }
}
