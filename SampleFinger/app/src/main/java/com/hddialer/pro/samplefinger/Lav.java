package com.hddialer.pro.samplefinger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.hddialer.pro.samplefinger.adapter.AbsentAdapter;
import com.hddialer.pro.samplefinger.support.Absent;

import java.util.ArrayList;

public class Lav extends AppCompatActivity {
    RecyclerView leaveRecycler;
    AbsentAdapter adapter;

    public static ArrayList<Absent> arraylist = new ArrayList<Absent>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lav);
        leaveRecycler= (RecyclerView) findViewById(R.id.rv_recycler_view);

        addDummyData();



       /* adapter = new AbsentAdapter(arraylist, getApplicationContext());
        leaveRecycler.setAdapter(adapter);*/
    }

    public void addDummyData(){
        Absent absent = new Absent();
        absent.setName("jithu");
        absent.setDesignation("Manager");
        absent.setUrl("https://www.bulkmail.co.za/media/k2/items/cache/fc1da7257992fc36032e11db3df7a664_L.jpg");
        absent.setType(1);
        arraylist.add(absent);

        Absent absent1 = new Absent();
        absent1.setName("Joe");
        absent1.setDesignation("Manager");
        absent1.setUrl("http://thetrashcan.co/wp-content/uploads/2016/05/election.jpg");
        absent1.setType(1);
        arraylist.add(absent1);


        Absent absent2 = new Absent();
        absent2.setName("Amal");
        absent2.setDesignation("Hr");
        absent2.setUrl("http://www.redcamelsolutions.com/wp-content/uploads/freshizer/ccb200859f29899362b9dfc5dfda7d86_man-780-c.png");
        absent2.setType(0);
        arraylist.add(absent2);


        Absent absent3 = new Absent();
        absent3.setName("Sai");
        absent3.setDesignation("Manager");
        absent.setstatusAbsnt("1");
        absent3.setUrl("http://media.istockphoto.com/photos/portrait-of-a-smiling-young-man-in-barcelona-picture-id490362624?k=6&m=490362624&s=170667a&w=0&h=0zTB_5I8lpyafKUunL8BO3LjD1lIezVlIEN-Ph_8CVE=");
        absent3.setType(1);
        arraylist.add(absent3);



        Absent absent14 = new Absent();
        absent14.setName("Nikil John");
        absent14.setDesignation("Manager");
        absent14.setUrl("");
        absent.setstatusAbsnt("1");
        absent14.setType(0);
        arraylist.add(absent14);

        Absent absent4 = new Absent();
        absent4.setName("John");
        absent4.setDesignation("Manager");
        absent4.setUrl("http://www.frilla.se/wp-content/uploads/2017/02/herrfrisyrer-85-min.jpg");
        absent.setstatusAbsnt("0");
        absent4.setType(1);
        arraylist.add(absent4);

        Absent absent5 = new Absent();
        absent5.setName("Hafees");
        absent5.setDesignation("Manager");
        absent5.setUrl("http://thetrashcan.co/wp-content/uploads/2016/05/election.jpg");
        absent.setstatusAbsnt("0");
        absent5.setType(0);
        arraylist.add(absent5);

        Absent absent6 = new Absent();
        absent6.setName("Saranya");
        absent6.setDesignation("Manager");
        absent.setstatusAbsnt("kk");
        absent6.setUrl("https://s-media-cache-ak0.pinimg.com/736x/53/6c/18/536c18f3ef3a65c0fc637d63b9e3626c--profile-picture-ideas-profile-pictures.jpg");
        absent6.setType(1);
        arraylist.add(absent6);

        Absent absent12 = new Absent();
        absent12.setName("Debin Tom");
        absent12.setDesignation("Manager");
        absent12.setUrl("");
        absent.setstatusAbsnt("0");
        absent12.setType(0);
        arraylist.add(absent12);

        Absent absent7 = new Absent();
        absent7.setName("Maya");
        absent7.setDesignation("Manager");
        absent.setstatusAbsnt("ll");
        absent7.setUrl("https://secure.meetupstatic.com/photos/member/4/7/8/8/highres_223818312.jpeg");
        absent7.setType(1);
        arraylist.add(absent7);

        Absent absent8 = new Absent();
        absent8.setName("Priya");
        absent8.setDesignation("Manager");
        absent.setstatusAbsnt("pp");
        absent8.setUrl("http://static5.businessinsider.com/image/551437bc69bedd4a15fff1db/23-of-the-most-powerful-women-engineers-in-the-world.jpg");
        absent8.setType(0);
        arraylist.add(absent8);

        Absent absent13 = new Absent();
        absent13.setName("Sibin Frances");
        absent13.setDesignation("Manager");
        absent13.setUrl("");
        absent.setstatusAbsnt("0");
        absent13.setType(1);
        arraylist.add(absent13);

        Absent absent9 = new Absent();
        absent9.setName("Raju");
        absent9.setDesignation("Manager");
        absent.setstatusAbsnt("0");
        absent9.setUrl("https://ichef-1.bbci.co.uk/news/660/cpsprodpb/493A/production/_90464781_mannybbc.jpg");
        absent9.setType(0);
        arraylist.add(absent9);

        Absent absent10 = new Absent();
        absent10.setName("Preesa");
        absent10.setDesignation("Manager");
        absent.setstatusAbsnt("1");
        absent10.setUrl("http://www.wonderslist.com/wp-content/uploads/2016/02/Emilia-Clarke-Beautiful-Woman-2016.jpg");
        absent10.setType(1);
        arraylist.add(absent10);

        Absent absent11 = new Absent();
        absent11.setName("Sangeetha");
        absent11.setDesignation("Manager");
        absent.setstatusAbsnt("1");
        absent11.setUrl("http://listosphere.com/wp-content/uploads/2015/07/jessica-alba-e1449052706215.png");
        absent11.setType(0);
        arraylist.add(absent11);






        adapter = new AbsentAdapter(arraylist, getApplicationContext());
        //leaveRecycler.setAdapter(adapter);


       // horizontalAdapter = new HorizontalAdapter(Home_4.contactDetailsArrayList);

        LinearLayoutManager horizontalLayoutManagaer
                = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        leaveRecycler.setLayoutManager(horizontalLayoutManagaer);

        leaveRecycler.setHasFixedSize(true);
        leaveRecycler.setItemViewCacheSize(20);
        leaveRecycler.setDrawingCacheEnabled(true);
        leaveRecycler.setDrawingCacheQuality(View.DRAWING_CACHE_QUALITY_HIGH);
        leaveRecycler.setAdapter(adapter);
    }
}
