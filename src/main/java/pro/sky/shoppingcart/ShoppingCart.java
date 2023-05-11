package pro.sky.shoppingcart;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
@Scope("prototype")
public class ShoppingCart {
    private Set<String> items = new HashSet<>();

    public Set<String> getItems() {
        return items;
    }
    public void setItems(String id) {
        items.add(id);
    }
    /*    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ShoppingCart that)) return false;
        return Objects.equals(items, that.items);
    }*/

/*    @Override
    public int hashCode() {
        return Objects.hash(id);
    }*/

}
