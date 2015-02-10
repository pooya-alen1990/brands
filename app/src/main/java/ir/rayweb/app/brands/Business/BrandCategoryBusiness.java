package ir.rayweb.app.brands.Business;

import android.content.Context;

import java.sql.SQLException;
import java.util.List;

import ir.rayweb.app.brands.DAL.BrandCategoryRepository;
import ir.rayweb.app.brands.Model.BrandCategory;

/**
 * Created by parsa on 2/6/2015.
 */
public class BrandCategoryBusiness {
    BrandCategoryRepository brandCategoryRepository;

    public  BrandCategoryBusiness(Context context)
    {
        try
        {
            brandCategoryRepository=new BrandCategoryRepository(context);
        }
        catch (Exception e)
        {
            throw  e;
        }
    }

    public  int createBrandCategory(BrandCategory brandCategory) throws SQLException {
        try
        {
            return brandCategoryRepository.createBrandCategory(brandCategory);
        }
        catch (Exception e)
        {
            throw e;
        }
    }
    public BrandCategory createBrandCategoryIfNotExist(BrandCategory brandCategory) throws SQLException {
        try
        {
            return brandCategoryRepository.createBrandCategoryIfNotExist(brandCategory);
        }
        catch (Exception e)
        {
            throw e;
        }
    }
    public  int updateBrandCategory(BrandCategory brandCategory) throws SQLException {
        try
        {
            return brandCategoryRepository.updateBrandCategory(brandCategory);
        }
        catch (Exception e)
        {
            throw e;
        }
    }
    public  int deleteBrandCategory(BrandCategory brandCategory) throws SQLException {
        try
        {
            return brandCategoryRepository.deleteBrandCategory(brandCategory);
        }
        catch (Exception e)
        {
            throw e;
        }
    }
    public List<BrandCategory> getAllBrandCategory() throws SQLException {
        try
        {
            return brandCategoryRepository.getAllBrandCategory();
        }
        catch (Exception e)
        {
            throw e;
        }
    }
    public BrandCategory getBrandCategoryById(int id) {
        try
        {
            return  brandCategoryRepository.getBrandCategoryById(id);
        }
        catch (Exception e) {
            throw e;
        }

    }
}
