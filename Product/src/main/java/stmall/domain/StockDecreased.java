package stmall.domain;

import stmall.domain.*;
import stmall.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class StockDecreased extends AbstractEvent {

    private Long id;
    private String productId;
    private String productName;
    private String productImage;
    private Integer stock;

    public StockDecreased(Inventory aggregate){
        super(aggregate);
    }
    public StockDecreased(){
        super();
    }
}
