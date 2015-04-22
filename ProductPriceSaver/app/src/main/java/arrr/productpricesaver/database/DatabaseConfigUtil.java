package arrr.productpricesaver.database;

import com.j256.ormlite.android.apptools.OrmLiteConfigUtil;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import arrr.productpricesaver.entities.Product;

/**
 * Created by arrr on 07/04/2015.
 */
public class DatabaseConfigUtil extends OrmLiteConfigUtil {

    private static final Class<?>[] classes = new Class[] {
            Product.class
    };

    public static void main(String[] args) throws SQLException, IOException {
        writeConfigFile(new File("D:/Code/Android/ProductPriceSaver/app/src/main/res/raw/ormlite_config.txt"), classes);
    }
}
