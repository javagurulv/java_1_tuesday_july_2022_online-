package student_levs_blinnikovs.lesson_11_interfaces.level_3_junior.task_7_10;

import java.util.Optional;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class OptionalCompatibleInMemoryDatabase implements OptionalProductDatabase {

    Product[] products = new Product[0];

    @Override
    public void save(Product product) {
        Product[] temp = new Product[this.products.length + 1];
        System.arraycopy(this.products, 0, temp, 0, this.products.length); // I decided not to use for loop because... we all know I know how to use it
        temp[temp.length - 1] = product;
        this.products = new Product[temp.length];
        System.arraycopy(temp, 0, this.products, 0, temp.length);
    }

    @Override
    public Optional<Product> findByTitle(String productTitle) {
        Optional<Product> optionalProduct = Optional.empty();
        for (Product product : this.products) {
            if (titleEquals(product, productTitle)) {
                optionalProduct = Optional.of(product);
            }
        }
        return optionalProduct;
    }

    private boolean titleEquals(Product product, String productTitle) {
        return product.getTitle().equals(productTitle);
    }

}
