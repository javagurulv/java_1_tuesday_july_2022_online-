package student_olegs_radigins.lesson_11.level_3.task_7_10;

import java.util.ArrayList;
import java.util.List;

class InMemoryDatabase implements ProductDatabase {
    List<Product> products = new ArrayList<>();
    @Override
    public void save(Product product){
        products.add(product);

    }

    @Override
    public Product findByTitle(String productTitle) {
        for(Product product : products) {
            if (productTitle.equals(product.getTitle())) {
                return product;
            }
        }
        return null;
    }
}
