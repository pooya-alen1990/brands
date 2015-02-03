package ir.rayweb.app.brands.Model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by parsa on 2/3/2015.
 */
@DatabaseTable(tableName = "Categories")
public class Category   {
  /*Label Table Name*/
/*    public static final String Table_Name="Categories";

    *//*Labels Columns Name In DB*//*
    public  static final String Column_ID="categories_ID";
    public  static final String Column_Name="categories_Name";
    public  static final String Column_Active="Categories_Active";*/

    /*Properties*/
    @DatabaseField(columnDefinition = "categories_ID")
    public double id;

    @DatabaseField(columnDefinition = "categories_Name")
    public String name;

    @DatabaseField(columnDefinition = "categories_Active")
    public Boolean active;

}
