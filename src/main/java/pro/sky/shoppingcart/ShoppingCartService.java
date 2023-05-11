package pro.sky.shoppingcart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

@Service
@Component
@SessionScope
public class ShoppingCartService {

    @Autowired
    private ShoppingCart sc;

//    @SessionScope
    public String addPurchase (String id) {
        sc.setItems(id);
        return "id " + id + " добавлен";
    }
//    @SessionScope
    public ShoppingCart getPurchase () {
        return sc;
    }


/*    @SessionScope
    public String addPurchase (String id) {
        sc.setItems(id);
        return "id " + id + " добавлен";
    }
    @SessionScope
    public ShoppingCart getPurchase () {
        return sc;
    }*/


/*    public ShoppingCart getPurchase (int id) {
        for (Employee employee : employees) {
            if (StringUtils.equalsIgnoreCase(employee.getLastName(), lastName) && StringUtils.equalsIgnoreCase(employee.getFirstName(), firstName)) {
                return employee;
            }
*//*            if (employee.getLastName().equals(lastName) && employee.getFirstName().equals(firstName)) {
                return employee;
            }*//*
        }
        throw new EmployeeNotFoundException();
    }*/

}