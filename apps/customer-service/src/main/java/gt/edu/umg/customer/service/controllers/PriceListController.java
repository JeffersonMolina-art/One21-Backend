package gt.edu.umg.customer.service.controllers;

import gt.edu.umg.customer.service.dtos.PriceListDto;
import gt.edu.umg.customer.service.entities.PriceList;
import gt.edu.umg.customer.service.services.PriceListService;
import gt.edu.umg.generic.data.controllers.GenericController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customers/price-lists")
public class PriceListController extends GenericController<PriceListDto, PriceList, Integer> {

    public PriceListController(PriceListService priceListService) {super(priceListService);}

}
