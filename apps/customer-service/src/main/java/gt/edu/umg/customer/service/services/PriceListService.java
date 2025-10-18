package gt.edu.umg.customer.service.services;

import gt.edu.umg.customer.service.dtos.PriceListDto;
import gt.edu.umg.customer.service.entities.PriceList;
import gt.edu.umg.customer.service.repositories.PriceListRepository;
import gt.edu.umg.generic.data.services.GenericServiceImpl;
import gt.edu.umg.generic.data.utils.GenericMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PriceListService extends GenericServiceImpl<PriceListDto, PriceList, Integer> {

    private final PriceListRepository priceListRepository;
    private final GenericMapper mapper;

    public PriceListService(PriceListRepository priceListRepository, GenericMapper mapper){
        super(priceListRepository, mapper, PriceListDto.class, PriceList.class);
        this.priceListRepository = priceListRepository;
        this.mapper = mapper;
    }
}
