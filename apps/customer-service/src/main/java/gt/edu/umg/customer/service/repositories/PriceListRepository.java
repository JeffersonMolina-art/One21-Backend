package gt.edu.umg.customer.service.repositories;

import gt.edu.umg.customer.service.entities.PriceList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceListRepository extends JpaRepository<PriceList, Integer> {
}