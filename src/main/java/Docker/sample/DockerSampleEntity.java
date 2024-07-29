package Docker.sample;

import org.antlr.v4.runtime.misc.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Saswata_Beni")
public class DockerSampleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    @JsonProperty("id")
    int id;

    @Column(name = "name")
    @JsonProperty("name")
    String name;

    @Column(name="PhoneNo")
    @JsonProperty("PhoneNo")
    int phoneno;

    
}
