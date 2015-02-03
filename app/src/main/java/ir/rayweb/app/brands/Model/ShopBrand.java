package ir.rayweb.app.brands.Model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by parsa on 2/3/2015.
 */
@DatabaseTable(tableName = "ShopBrand")
public class ShopBrand {

    @DatabaseField(columnDefinition = "shopBrand_ID")
    public double id;

    @DatabaseField(columnDefinition = "shopBrand_ShopID")
    public Shop shop;

    @DatabaseField(columnDefinition = "shopBrand_BrandID")
    public Brand brand;
}
