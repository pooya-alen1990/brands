package ir.rayweb.app.brands.Model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by parsa on 2/3/2015.
 */
@DatabaseTable(tableName = "BrandCategory")
public class BrandCategory {

    /*Properties*/
   @DatabaseField(columnDefinition = "brandCategory_ID")
    public double id;

    @DatabaseField(columnDefinition = "brandCategory_CategoryID")
    public Category category;

    @DatabaseField(columnDefinition = "brandCategory_BrandID")
    public Brand brand;
}
