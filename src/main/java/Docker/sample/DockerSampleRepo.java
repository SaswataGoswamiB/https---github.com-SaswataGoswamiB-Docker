package Docker.sample;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DockerSampleRepo extends JpaRepository<DockerSampleEntity,Integer> {
    
}
