package balintmaschio.business.RabbitMQProducer.repositories;

import balintmaschio.business.RabbitMQProducer.dao.PurchaseDao;
import org.springframework.data.repository.CrudRepository;

public interface PurchaseRepository extends CrudRepository<PurchaseDao , Long > {

}
