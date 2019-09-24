package controller;
/*   RajUser created on 9/21/2019 
inside the package - controller  */

import model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.PersonService;

import java.util.Map;

@RestController
@RequestMapping("/govinda")
public class PersonController {
    @Autowired
    PersonService personService;

    @RequestMapping("/sarvam")
    public Map<String, Person> getAllEmployees()
    {
       return personService.getAllPersons();
    }

    @RequestMapping("{exactID}")
    public Person getSpecific(@PathVariable("exactID") String exactID)
    {
        return personService.getPerson(exactID);
    }

}
