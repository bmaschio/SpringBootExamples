package balintmaschio.business.RabbitMQProducer.services.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CreatePurchase {

    String productName;
    String address;
    double totalPrice;
    int quantity;

}
