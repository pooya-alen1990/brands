package ir.rayweb.app.brands.Business;

import android.content.Context;

import java.sql.SQLException;
import java.util.List;

import ir.rayweb.app.brands.DAL.AdvertiseRepository;
import ir.rayweb.app.brands.Model.Advertise;

/**
 * Created by parsa on 2/6/2015.
 */
public class AdvertiseBusiness {
    AdvertiseRepository advertiseRepository;

    public  AdvertiseBusiness(Context context)
    {
        try
        {
            advertiseRepository=new AdvertiseRepository(context);
        }
        catch (Exception e)
        {
            throw  e;
        }
    }

    public  int createAdvertise(Advertise advertise) throws SQLException {
        try
        {
            return advertiseRepository.createAdvertise(advertise);
        }
        catch (Exception e)
        {
            throw e;
        }
    }
    public Advertise createAdvertiseIfNotExist(Advertise advertise) throws SQLException {
        try
        {
            return advertiseRepository.createAdvertiseIfNotExist(advertise);
        }
        catch (Exception e)
        {
            throw e;
        }
    }
    public  int updateAdvertise(Advertise advertise) throws SQLException {
        try
        {
            return advertiseRepository.updateAdvertise(advertise);
        }
        catch (Exception e)
        {
            throw e;
        }
    }
    public  int deleteAdvertise(Advertise advertise) throws SQLException {
        try
        {
            return advertiseRepository.deleteAdvertise(advertise);
        }
        catch (Exception e)
        {
            throw e;
        }
    }
    public List<Advertise> getAllAdvertise() throws SQLException {
        try
        {
            return advertiseRepository.getAllAdvertises();
        }
        catch (Exception e)
        {
            throw e;
        }
    }
    public List<Advertise> getAllActiveAdvertise() throws SQLException {
        try
        {
            List<Advertise> advertiseList= advertiseRepository.getAllActiveAdvertises();
           /* for(int x = 10; x < advertiseList.size(); x = x+1) {
              advertiseList.get(x).persianRegisterDate= Utility.getCurrentShamsidate(advertiseList.get(x).registerDate)
            }*/
            return advertiseList;
        }
        catch (Exception e)
        {
            throw e;
        }
    }
    public Advertise getAdvertiseById(int id) {
        try
        {
            return  advertiseRepository.getAdvertiseById(id);
        }
        catch (Exception e) {
            throw e;
        }

    }
    public List<Advertise> getAdvertisesByBrandId(int id) {
        try
        {
            return  advertiseRepository.getAdvertisesByBrandId(id);
        }
        catch (Exception e) {
            throw e;
        }

    }
}
