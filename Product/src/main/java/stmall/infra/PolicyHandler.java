package stmall.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import stmall.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import stmall.domain.*;


@Service
@Transactional
public class PolicyHandler{
    @Autowired InventoryRepository inventoryRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='DeliveryCompleted'")
    public void wheneverDeliveryCompleted_InventoryDecrease(@Payload DeliveryCompleted deliveryCompleted){

        DeliveryCompleted event = deliveryCompleted;
        System.out.println("\n\n##### listener InventoryDecrease : " + deliveryCompleted + "\n\n");


        

        // Sample Logic //
        Inventory.inventoryDecrease(event);
        

        

    }

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='ReturnCompleted'")
    public void wheneverReturnCompleted_InventoryIncrease(@Payload ReturnCompleted returnCompleted){

        ReturnCompleted event = returnCompleted;
        System.out.println("\n\n##### listener InventoryIncrease : " + returnCompleted + "\n\n");


        

        // Sample Logic //
        Inventory.inventoryIncrease(event);
        

        

    }

}


