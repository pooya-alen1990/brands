package ir.rayweb.app.brands.Model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;

/**
 * Created by parsa on 2/3/2015.
 */
@DatabaseTable(tableName = "Advertises")
public class Advertise {

    @DatabaseField(columnDefinition = "advertises_ID")
    public double id;

    @DatabaseField(columnDefinition = "advertises_Name")
    public String name;

    @DatabaseField(columnDefinition = "advertises_Title")
    public String title;

    @DatabaseField(columnDefinition = "advertises_Description")
    public String description;

    @DatabaseField(columnDefinition = "advertises_RegisterDate")
    public Date registerDate;

    @DatabaseField(columnDefinition = "advertises_Active")
    public Boolean active;

    @DatabaseField(columnDefinition = "advertises_BrandID")
    public Brand brand;

    @DatabaseField(columnDefinition = "advertises_ShopID")
    public Shop shop;

    @DatabaseField(columnDefinition = "advertises_LikeCount")
    public int likeCount;

    @DatabaseField(columnDefinition = "advertises_Price")
    public int price;

    @DatabaseField(columnDefinition = "advertises_HasDiscount")
    public Boolean hasDiscount;

    @DatabaseField(columnDefinition = "advertises_PercentDiscount")
    public int percentDiscount;

    @DatabaseField(columnDefinition = "advertises_IsSendDetail")
    public Boolean isSendDetail;

    @DatabaseField(columnDefinition = "advertise_IsNew")
    public Boolean isNew;
}
