package episen.archcloud.testapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.transaction.Transactional;

@Controller
@RequestMapping("/api")
public class TestService {
    @Autowired
    private TestRepo testRepo;
    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") Long id) {
        User getuser = testRepo.getUserById(id);
        System.out.println(getuser);
        return getuser;
    }
}
