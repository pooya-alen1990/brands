package ir.rayweb.app.brands.Business;

import android.content.Context;

import java.sql.SQLException;
import java.util.List;

import ir.rayweb.app.brands.DAL.BrandRepository;
import ir.rayweb.app.brands.Model.Brand;

/**
 * Created by parsa on 2/6/2015.
 */
public class BrandBusiness {
    BrandRepository brandRepository;

    public  BrandBusiness(Context context)
    {
        try
        {
            brandRepository=new BrandRepository(context);
        }
        catch (Exception e)
        {
            throw  e;
        }
    }

    public  int createBrand(Brand brand) throws SQLException {
        try
        {
            return brandRepository.createBrand(brand);
        }
        catch (Exception e)
        {
            throw e;
        }
    }
    public  int updateBrandCategory(Brand brand) throws SQLException {
        try
        {
            return brandRepository.updateBrand(brand);
        }
        catch (Exception e)
        {
            throw e;
        }
    }
    public  int deleteBrand(Brand brand) throws SQLException {
        try
        {
            return brandRepository.deleteBrand(brand);
        }
        catch (Exception e)
        {
            throw e;
        }
    }
    public List<Brand> getAllBrand() throws SQLException {
        try
        {
            return brandRepository.getAllBrand();
        }
        catch (Exception e)
        {
            throw e;
        }
    }
    public Brand getBrandById(int id) {
        try
        {
            return  brandRepository.getBrandById(id);
        }
        catch (Exception e) {
            throw e;
        }

    }
}
