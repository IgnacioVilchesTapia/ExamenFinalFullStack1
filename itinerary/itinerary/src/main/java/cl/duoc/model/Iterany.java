public class Iterany {
package cl.duoc.itinerary.model;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "itinerary")
@Data
public class Iterany { 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String type; 
    private Long travelId;
}
}
