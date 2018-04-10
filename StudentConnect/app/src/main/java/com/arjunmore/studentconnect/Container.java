package com.arjunmore.studentconnect;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.arjunmore.studentconnect.Fragments.AboutUs;
import com.arjunmore.studentconnect.Fragments.Accreditation;
import com.arjunmore.studentconnect.Fragments.Admissions;
import com.arjunmore.studentconnect.Fragments.AwardsAchivements;
import com.arjunmore.studentconnect.Fragments.ContactUs;
import com.arjunmore.studentconnect.Fragments.Cources;
import com.arjunmore.studentconnect.Fragments.Directory;
import com.arjunmore.studentconnect.Fragments.LifeOnCampus;
import com.arjunmore.studentconnect.Fragments.Location;
import com.arjunmore.studentconnect.Fragments.Placements;

public class Container extends AppCompatActivity {
    FragmentManager fr;
    FragmentTransaction ft;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);
        Intent intent = getIntent();
        String one = intent.getStringExtra("frag");
        Bundle bundle = new Bundle();
        bundle.putString("one",one);

        Cources cources = new Cources();
        cources.setArguments(bundle);

            switch (one){
                case "1":
                    fr= getFragmentManager();
                    ft = fr.beginTransaction().replace(R.id.Container,new AboutUs(),"about");
                    ft.commit();
                    break;
                case "2":
                    fr= getFragmentManager();
                    ft = fr.beginTransaction().replace(R.id.Container,new Cources(),"about");
                    ft.commit();
                    break;
                case "3":
                    fr= getFragmentManager();
                    ft = fr.beginTransaction().replace(R.id.Container,new Accreditation(),"about");
                    ft.commit();
                    break;
                case "4":
                    fr= getFragmentManager();
                    ft = fr.beginTransaction().replace(R.id.Container,new AwardsAchivements(),"about");
                    ft.commit();
                    break;
                case "5":
                    fr= getFragmentManager();
                    ft = fr.beginTransaction().replace(R.id.Container,new LifeOnCampus(),"about");
                    ft.commit();
                    break;
                case "6":
                    fr= getFragmentManager();
                    ft = fr.beginTransaction().replace(R.id.Container,new Placements(),"about");
                    ft.commit();
                    break;
                case "7":
                    fr= getFragmentManager();
                    ft = fr.beginTransaction().replace(R.id.Container,new Admissions(),"about");
                    ft.commit();
                    break;
                case "8":
                    fr= getFragmentManager();
                    ft = fr.beginTransaction().replace(R.id.Container,new Location(),"about");
                    ft.commit();
                    break;
                case "9":
                    fr= getFragmentManager();
                    ft = fr.beginTransaction().replace(R.id.Container,new Directory(),"about");
                    ft.commit();
                    break;
                case "10":
                    fr= getFragmentManager();
                    ft = fr.beginTransaction().replace(R.id.Container,new ContactUs(),"about");
                    ft.commit();
                    break;
            }


           if (one.equals("2")){
               FragmentManager fr = getFragmentManager();
               FragmentTransaction ft = fr.beginTransaction();
               ft.replace(R.id.Container,cources,"done").commit();

           }






    }
}
