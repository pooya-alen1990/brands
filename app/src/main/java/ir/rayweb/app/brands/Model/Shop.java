package ir.rayweb.app.brands.Model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by parsa on 2/3/2015.
 */
@DatabaseTable(tableName = "Shops")
public class Shop {

    @DatabaseField(columnDefinition = "shops_ID")
    public double id;

    @DatabaseField(columnDefinition = "shops_Name")
    public String name;

    @DatabaseField(columnDefinition = "shops_Description")
    public String description;

    @DatabaseField(columnDefinition = "shops_Active")
    public Boolean active;

    @DatabaseField(columnDefinition = "shops_ManagerName")
    public String managerName;

    @DatabaseField(columnDefinition = "shops_Telephone")
    public String telephone;

    @DatabaseField(columnDefinition = "shops_Address")
    public String address;
}
