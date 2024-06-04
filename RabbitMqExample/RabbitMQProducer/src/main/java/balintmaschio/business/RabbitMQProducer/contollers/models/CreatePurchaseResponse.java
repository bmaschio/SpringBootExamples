package balintmaschio.business.RabbitMQProducer.contollers.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class CreatePurchaseResponse {
    @JsonProperty("purchaseId")
    String purchaseId;
}
