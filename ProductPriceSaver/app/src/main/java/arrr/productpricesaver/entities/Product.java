package arrr.productpricesaver.entities;


import com.j256.ormlite.field.DatabaseField;

/**
 * Created by arrr on 07/04/2015.
 */
public class Product {

    public Product(){

    }

    public Product(String name){
        this.name = name;
    }

    @DatabaseField(generatedId = true)
    int id;

    @DatabaseField(canBeNull = false, index = true, unique = true)
    String name;

    @DatabaseField(canBeNull = true, index = true)
    int barcode;

    @Override
    public String toString() {
        return name;
    }
}
