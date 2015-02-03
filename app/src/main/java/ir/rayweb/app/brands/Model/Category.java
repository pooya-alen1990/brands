package ir.rayweb.app.brands.Model;

/**
 * Created by parsa on 2/3/2015.
 */
public class Category {
  /*Label Table Name*/
    public static final String Table_Name="Categories";

    /*Labels Columns Name In DB*/
    public  static final String Column_ID="categories_ID";
    public  static final String Column_Name="categories_Name";
    public  static final String Column_Active="Categories_Active";

    /*Properties*/
    public int id;
    public String name;
    public Boolean active;

}
