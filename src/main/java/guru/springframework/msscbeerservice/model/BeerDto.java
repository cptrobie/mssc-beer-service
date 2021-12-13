package guru.springframework.msscbeerservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Created by michael on 2021-12-10.
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class BeerDto {
    private UUID id;
    private String upc;
    private String beerNane;
    private BeerStyleType beerStyle;
    private BigDecimal price;
    private Integer quantityOnHand;
    private Integer version;
    private OffsetDateTime createdDate;
    private OffsetDateTime modifiedDate;
}
