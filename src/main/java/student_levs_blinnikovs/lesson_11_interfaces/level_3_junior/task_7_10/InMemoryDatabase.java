package student_levs_blinnikovs.lesson_11_interfaces.level_3_junior.task_7_10;

class InMemoryDatabase implements ProductDatabase {

    Product[] products = new Product[0];

    @Override
    public void save(Product product) {
        Product[] temp = new Product[this.products.length + 1];
        System.arraycopy(this.products, 0, temp, 0, this.products.length); // I decided not to use for loop because... we all know I know how to use it
        temp[temp.length - 1] = product;
        this.products = new Product[temp.length];
        System.arraycopy(temp, 0, this.products, 0, temp.length);
    }

    /*
     not sure which variant is better:
     1. first - create temporary with original +1, copy, put product to last, create new original with +1 (using temp length) and copy temp to new original OR
     2. second - create temp with original's length, copy (backup), then create new original with +1, copy temp there and add product to last pos
        @Override
        public void save(Product product) {
            Product[] temp = new Product[this.products.length];
            System.arraycopy(this.products, 0, temp, 0, this.products.length); // I decided not to use for loop because... we all know I know how to use it
            this.products = new Product[this.products.length + 1];
            System.arraycopy(temp, 0, this.products, 0, temp.length);
            this.products[this.products.length - 1] = product;
        }
    */

    @Override
    public Product findByTitle(String productTitle) {
        for (Product product : this.products) {
            if (titleEquals(product, productTitle)) {
                return product;
            }
        }
        return null;
    }

    private boolean titleEquals(Product product, String productTitle) {
        return product.getTitle().equals(productTitle);
    }

}
