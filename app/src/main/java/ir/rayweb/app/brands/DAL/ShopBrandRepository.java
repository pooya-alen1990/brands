package ir.rayweb.app.brands.DAL;

import android.content.Context;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;
import java.util.List;

import ir.rayweb.app.brands.Model.ShopBrand;

/**
 * Created by parsa on 2/6/2015.
 */
public class ShopBrandRepository {
    private DatabaseHelper databaseHelper;
    Dao<ShopBrand, Integer> shopBrandDao;
    public ShopBrandRepository(Context context)
    {
        try {
            DatabaseManager dbManager = new DatabaseManager();


            databaseHelper = dbManager.getHelper(context);
            databaseHelper.getWritableDatabase();
            shopBrandDao = databaseHelper.getShopBrandDao();
        } catch (SQLException e) {
            // TODO: Exception Handling
            e.printStackTrace();
        }

    }
    public int createShopBrand(ShopBrand shopBrand) throws SQLException {
        try {
            return shopBrandDao.create(shopBrand);
        } catch (SQLException e) {
            // TODO: Exception Handling
            e.printStackTrace();

        }
        catch (Exception e)
        {

        }
        return 0;
    }
    public int updateShopBrand(ShopBrand shopBrand)
    {
        try {
            return shopBrandDao.update(shopBrand);
        } catch (SQLException e) {
            // TODO: Exception Handling

        }
        return 0;
    }
    public int deleteShopBrand(ShopBrand shopBrand)
    {
        try {
            return shopBrandDao.delete(shopBrand);
        } catch (SQLException e) {
            // TODO: Exception Handling
            e.printStackTrace();
        }
        return 0;
    }

    public List<ShopBrand> getAllShopBrand()
    {
        try {
            return shopBrandDao.queryForAll();
        } catch (SQLException e) {
            // TODO: Exception Handling
            e.printStackTrace();
        }
        return null;
    }
    public ShopBrand getShopBrandById(int id)
    {
        try {
            return shopBrandDao.queryForId(id);
        } catch (SQLException e) {
            // TODO: Exception Handling
            e.printStackTrace();
        }
        return null;
    }
}
