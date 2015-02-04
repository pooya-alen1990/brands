package ir.rayweb.app.brands.DAL;

import android.content.Context;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;
import java.util.List;

import ir.rayweb.app.brands.Model.Advertise;

/**
 * Created by parsa on 2/4/2015.
 */
public class AdvertiseRepository {
    private DatabaseHelper databaseHelper;
    Dao<Advertise, Integer> advertiseDao;
    public AdvertiseRepository(Context context)
    {
        try {
            DatabaseManager dbManager = new DatabaseManager();


            databaseHelper = dbManager.getHelper(context);
            databaseHelper.getWritableDatabase();
            advertiseDao = databaseHelper.getAdvertiseDao();
        } catch (SQLException e) {
            // TODO: Exception Handling
            e.printStackTrace();
        }

    }
    public int createAdvertise(Advertise advertise) throws SQLException {
        try {
            return advertiseDao.create(advertise);
        } catch (SQLException e) {
            // TODO: Exception Handling
            e.printStackTrace();

        }
        catch (Exception e)
        {

        }
        return 0;
    }
    public int updateAdvertise(Advertise advertise)
    {
        try {
            return advertiseDao.update(advertise);
        } catch (SQLException e) {
            // TODO: Exception Handling

        }
        return 0;
    }
    public int deleteAdvertise(Advertise advertise)
    {
        try {
            return advertiseDao.delete(advertise);
        } catch (SQLException e) {
            // TODO: Exception Handling
            e.printStackTrace();
        }
        return 0;
    }

    public List<Advertise> getAllAdvertises()
    {
        try {
            return advertiseDao.queryForAll();
        } catch (SQLException e) {
            // TODO: Exception Handling
            e.printStackTrace();
        }
        return null;
    }
    public Advertise getCategoryById(int id)
    {
        try {
            return advertiseDao.queryForId(id);
        } catch (SQLException e) {
            // TODO: Exception Handling
            e.printStackTrace();
        }
        return null;
    }
}
