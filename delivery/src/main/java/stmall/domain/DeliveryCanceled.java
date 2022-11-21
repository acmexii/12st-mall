package stmall.domain;

import stmall.domain.*;
import stmall.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class DeliveryCanceled extends AbstractEvent {

    private Long id;
    private String orderId;
    private String productId;
    private String productName;
    private Integer qty;
    private String customerId;
    private String address;
    private String status;

    public DeliveryCanceled(Delivery aggregate){
        super(aggregate);
    }
    public DeliveryCanceled(){
        super();
    }
}
