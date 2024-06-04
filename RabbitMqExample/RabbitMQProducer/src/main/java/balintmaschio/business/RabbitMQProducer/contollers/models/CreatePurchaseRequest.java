package balintmaschio.business.RabbitMQProducer.contollers.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
@AllArgsConstructor
public class CreatePurchaseRequest {
    @JsonProperty("productName")
    String productName;
    @JsonProperty("address")
    String address;
    @JsonProperty("totalPrice")
    double totalPrice;
    @JsonProperty("quantity")
    int quantity;
}
