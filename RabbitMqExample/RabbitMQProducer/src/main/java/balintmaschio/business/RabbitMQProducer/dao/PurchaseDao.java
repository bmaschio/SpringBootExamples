package balintmaschio.business.RabbitMQProducer.dao;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;

@Entity
@Builder
@Getter
public class PurchaseDao {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    String productName;
    String address;
    double totalPrice;
    int quantity;
}
