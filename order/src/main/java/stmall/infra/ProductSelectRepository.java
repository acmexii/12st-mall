package stmall.infra;

import stmall.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel="productSelects", path="productSelects")
public interface ProductSelectRepository extends PagingAndSortingRepository<ProductSelect, Long> {

    

    
}
