package balintmaschio.business.RabbitMQProducer.services;


import balintmaschio.business.RabbitMQProducer.dao.PurchaseDao;
import balintmaschio.business.RabbitMQProducer.repositories.PurchaseRepository;
import balintmaschio.business.RabbitMQProducer.services.models.CreatePurchase;
import balintmaschio.business.RabbitMQProducer.services.models.Purchase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PurchasesService {
    @Autowired
    PurchaseRepository purchaseRepository;

    public Purchase create(CreatePurchase request){

        /* Saving in the repository*/
        PurchaseDao purchaseData = PurchaseDao.builder()
                .address(request.getAddress())
                            .productName(request.getProductName())
                                    .quantity(request.getQuantity())
                                            .totalPrice(request.getTotalPrice()).build();

        purchaseRepository.save(purchaseData);



        //  Inform other Services


    }

}
