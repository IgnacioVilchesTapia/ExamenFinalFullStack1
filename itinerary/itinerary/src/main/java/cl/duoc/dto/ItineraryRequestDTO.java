public class ItineraryRequestDTO {
package cl.duoc.itinerary.dto;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class ItineraryRequestDTO {
    @NotNull(message = "El nombre es obligatorio")
    @Size(min = 3, message = "El nombre debe tener al menos 3 caracteres")
    private String name;
    private String type;
    private Long travelId;
}
}
