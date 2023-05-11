package pro.sky.shoppingcart;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/store/order")

public class ShoppingCartController {
    private final ShoppingCartService scs;

    public  ShoppingCartController (ShoppingCartService scs) {
        this.scs = scs;
    }
    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping ("/add")
    public String add (@RequestParam ("id") String id) {
        return scs.addPurchase(id);
    }
    @GetMapping ("/get")
 //   @Bean
    public ShoppingCart get () {
        return scs.getPurchase();
    }


}