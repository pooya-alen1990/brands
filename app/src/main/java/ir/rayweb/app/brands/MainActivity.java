package ir.rayweb.app.brands;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import ir.rayweb.app.brands.Business.AdvertiseBusiness;
import ir.rayweb.app.brands.Business.BrandBusiness;
import ir.rayweb.app.brands.Business.CategoryBusiness;
import ir.rayweb.app.brands.Business.ShopBusiness;
import ir.rayweb.app.brands.Model.Advertise;
import ir.rayweb.app.brands.Model.Brand;
import ir.rayweb.app.brands.Model.Category;
import ir.rayweb.app.brands.Model.Shop;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CategoryBusiness categoryBusiness=new CategoryBusiness(this.getBaseContext());
        ShopBusiness shopBusiness =new ShopBusiness(this.getBaseContext());
        BrandBusiness brandBusiness=new BrandBusiness(this.getBaseContext());
        AdvertiseBusiness advertiseBusiness=new AdvertiseBusiness(this.getBaseContext());
        Category cat=new Category();
        cat.id=1;
        cat.name="test";
        cat.active=true;
        try {
            categoryBusiness.createCategoryIfNotExist(cat);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        List<Category> category= null;
        try {
            category = categoryBusiness.getAllCategory();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        TextView tv=(TextView) findViewById(R.id.MainText);
        tv.setText(category.get(0).name);

        Shop shop=new Shop();
        shop.id=1;
        shop.active=true;
        shop.address="shopAddress";
        shop.description="shopTest";
        shop.managerName="shopManager";
        shop.name="shopName";
        shop.telephone="shopTel";
        try {
            shopBusiness.createShopIfNotExist(shop);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        Brand brand=new Brand();
        brand.id=1;
        brand.active=true;
        brand.name="brandName";
        try {
            brandBusiness.createBrandIfNotExist(brand);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        Advertise adv=new Advertise();
        adv.id=1;
        adv.active=true;
        adv.description="test2";
        adv.isNew=true;
        adv.hasDiscount=false;
        adv.isSendDetail=false;
        adv.likeCount=0;
        adv.name="test2";
        adv.brand=brand;
        adv.shop=shop;
        adv.percentDiscount=0;
        adv.price=10000;
        adv.registerDate=new Date();
        adv.title="advTitle";
        try {
            advertiseBusiness.createAdvertiseIfNotExist(adv);
        } catch (SQLException e) {
            e.printStackTrace();
        }

      List<Advertise> advertiseList=  advertiseBusiness.getAdvertisesByBrandId(1);

        TextView textView2= (TextView) findViewById(R.id.MainText2);
      textView2.setText(advertiseList.get(0).name);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
