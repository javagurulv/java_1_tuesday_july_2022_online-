package student_olegs_radigins.lesson_11.level_3.task_7;

import java.util.ArrayList;

class InMemoryDatabase implements ProductDatabase{
    ArrayList<String> productList = new ArrayList<String>();

    @Override
    public void save(Product product) {
        productList.add(product.getTitle());

    }

    @Override
    public String findByTitle(String productTitle) {
      if( productList.contains(productTitle)){
          return productTitle;
      } return null;
      }

}
