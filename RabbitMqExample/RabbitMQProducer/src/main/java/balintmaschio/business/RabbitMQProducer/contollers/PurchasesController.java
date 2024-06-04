package balintmaschio.business.RabbitMQProducer.contollers;

import balintmaschio.business.RabbitMQProducer.contollers.models.CreatePurchaseRequest;
import balintmaschio.business.RabbitMQProducer.contollers.models.CreatePurchaseResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/purchases")
public class PurchasesController {

    public ResponseEntity<CreatePurchaseResponse> createPurchase (@RequestBody CreatePurchaseRequest request){
        CreatePurchaseResponse response = new CreatePurchaseResponse("someCode");
        return new ResponseEntity<CreatePurchaseResponse>(response, HttpStatus.CREATED);
    }




}
