package service;

import model.Person;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/*   RajUser created on 9/21/2019
inside the package - service  */
@Service
public class PersonService {
Map<String, Person> personMap = new HashMap<String, Person>();


    public PersonService() {
        Person p1 = new Person();
        p1.setId("1");
        p1.setFname("Krishna");
        p1.setLname("Krishna");
        p1.setAge(9);
        personMap.put("1",p1);

        Person p2 = new Person();
        p2.setId("1");
        p2.setFname("Rama");
        p2.setLname("Rama");
        p2.setAge(9);
        personMap.put("2",p2);
    }

    public Person getPerson(String id)
    {
        if(personMap.containsKey(id))
            return personMap.get(id);
        else
            return null;
    }

    public Map<String,Person> getAllPersons()
    {
        return personMap;
    }
}
