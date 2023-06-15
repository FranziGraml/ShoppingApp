package dto;

import com.example.shoppingApp.entity.User;
import com.example.shoppingApp.enumeration.Availability;
import com.example.shoppingApp.enumeration.Category;
import com.example.shoppingApp.enumeration.ShippingState;
import lombok.*;

import java.util.Date;

@Getter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor

public class OrderCreateDTO {

    private Long id;
    private User user;
    private Number total;
    private Date date;
    private ShippingState shippingState;

}

