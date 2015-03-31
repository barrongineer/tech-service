package io.barrongineer.techservice.web;

import io.barrongineer.techservice.domain.Technology;
import io.barrongineer.techservice.repository.TechnologyRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by shaunn on 3/29/2015.
 */
@RestController
public class TechnologyController {

    private static final Logger logger = LoggerFactory.getLogger(TechnologyController.class);

    @Autowired
    private TechnologyRepository technologyRepository;

    @RequestMapping(value = "/technology", method = RequestMethod.GET)
    public List<Technology> findAll() {
        logger.info("findAll() requested...");
        return technologyRepository.findAll();
    }

    @RequestMapping(value = "/technology/{id}", method = RequestMethod.GET)
    public Technology findById(@PathVariable("id") long id) {
        logger.info("findById({}) requested...", id);
        return technologyRepository.findOne(id);
    }

    @RequestMapping(value = "/technology/displayName/{displayName}")
    public List<Technology> findByDisplayNameLike(@PathVariable("displayName") String displayName) {
        logger.info("findByDisplayNameLike({}) requested...", displayName);
        return technologyRepository.findAllByDisplayNameContainingIgnoreCase(displayName);
    }

    @RequestMapping(value = "/technology", method = RequestMethod.POST)
    public Technology save(@RequestBody Technology technology) {
        logger.info("save({}) requested...", technology.toString());

        return technologyRepository.save(technology);
    }
}
