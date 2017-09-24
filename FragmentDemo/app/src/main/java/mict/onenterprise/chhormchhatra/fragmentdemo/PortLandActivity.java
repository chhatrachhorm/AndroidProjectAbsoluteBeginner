package mict.onenterprise.chhormchhatra.fragmentdemo;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PortLandActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pot_land);

        FragmentManager mFragmentManger = getFragmentManager();
        FragmentTransaction mTransaction = mFragmentManger.beginTransaction();
        Configuration mConfig = getResources().getConfiguration();

        if(mConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            mTransaction.replace(android.R.id.content, new PortraitFragment()).commit();
        }else{
            mTransaction.replace(android.R.id.content, new LandscapeFragment()).commit();
        }


    }
}