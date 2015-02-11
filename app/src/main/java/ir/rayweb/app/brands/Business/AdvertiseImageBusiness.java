package ir.rayweb.app.brands.Business;

import android.content.Context;

import java.sql.SQLException;
import java.util.List;

import ir.rayweb.app.brands.DAL.AdvertiseImageRepository;
import ir.rayweb.app.brands.Model.AdvertiseImage;

/**
 * Created by parsa on 2/11/2015.
 */
public class AdvertiseImageBusiness {
    AdvertiseImageRepository advertiseImageRepository;

    public  AdvertiseImageBusiness(Context context)
    {
        try
        {
            advertiseImageRepository=new AdvertiseImageRepository(context);
        }
        catch (Exception e)
        {
            throw  e;
        }
    }

    public  int createAdvertiseImage(AdvertiseImage advertiseImage) throws SQLException {
        try
        {
            return advertiseImageRepository.createAdvertiseImage(advertiseImage);
        }
        catch (Exception e)
        {
            throw e;
        }
    }
    public AdvertiseImage createAdvertiseImageIfNotExist(AdvertiseImage advertiseImage) throws SQLException {
        try
        {
            return advertiseImageRepository.createAdvertiseImageIfNotExist(advertiseImage);
        }
        catch (Exception e)
        {
            throw e;
        }
    }
    public  int updateAdvertiseImage(AdvertiseImage advertiseImage) throws SQLException {
        try
        {
            return advertiseImageRepository.updateAdvertiseImage(advertiseImage);
        }
        catch (Exception e)
        {
            throw e;
        }
    }
    public  int deleteAdvertiseImage(AdvertiseImage advertiseImage) throws SQLException {
        try
        {
            return advertiseImageRepository.deleteAdvertiseImage(advertiseImage);
        }
        catch (Exception e)
        {
            throw e;
        }
    }
    public List<AdvertiseImage> getAllAdvertiseImages(int advertiseId) throws SQLException {
        try
        {
            return advertiseImageRepository.getAllAdvertiseImages(advertiseId);
        }
        catch (Exception e)
        {
            throw e;
        }
    }
    public AdvertiseImage getAdvertiseImageById(int id) {
        try
        {
            return  advertiseImageRepository.getAdvertiseImageById(id);
        }
        catch (Exception e) {
            throw e;
        }

    }
   
}
