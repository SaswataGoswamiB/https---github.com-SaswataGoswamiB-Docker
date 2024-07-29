package Docker.sample;

import java.util.List;

import org.antlr.v4.runtime.misc.DoubleKeyMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class DockerSampleController {

@Autowired
DockerSampleRepo dockersamplerepo;



@PostMapping("/Sample")    
public ResponseEntity<DockerSampleEntity>PostSample(@RequestBody DockerSampleEntity dockersampleentity)
{
    return ResponseEntity.status(HttpStatus.OK).body(dockersamplerepo.save(dockersampleentity));
}
  
@GetMapping("/GetSample")
public ResponseEntity<List<DockerSampleEntity>> getSample()
{
    return ResponseEntity.status(HttpStatus.OK).body(dockersamplerepo.findAll());
}
}
