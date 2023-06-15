package dto;

import com.example.shoppingApp.entity.User;
import com.example.shoppingApp.enumeration.ShippingState;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.jetbrains.annotations.NotNull;

import java.util.Date;

@Getter
@ToString
@RequiredArgsConstructor



public class OrdertUpdateDTO {

    private Long id;
    private User user;
    private Number total;
    private Date date;
    private ShippingState shippingState;




}
