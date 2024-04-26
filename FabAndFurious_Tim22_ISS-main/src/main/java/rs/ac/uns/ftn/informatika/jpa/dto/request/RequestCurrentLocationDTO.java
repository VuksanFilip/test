package rs.ac.uns.ftn.informatika.jpa.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestCurrentLocationDTO {

    @NotBlank(message = "Cant be empty")
    @Length(max = 50, message = "You have exceeded the allowed length (50)")
    private String address;

    @NotNull(message = "Cant be empty")
    @DecimalMax("90.0") @DecimalMin("-90.0")
    private double latitude;

    @NotNull(message = "Cant be empty")
    @DecimalMax("90.0") @DecimalMin("-90.0")
    private double longitude;

}
