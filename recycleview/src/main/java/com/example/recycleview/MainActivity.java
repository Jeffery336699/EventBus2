package com.example.recycleview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.example.recycleview.adapter.SectionAdapter;
import com.example.recycleview.data.DataServer;
import com.example.recycleview.entity.WorkSelect;

import java.util.List;


public class MainActivity extends AppCompatActivity {
    private static final Class<?>[] ACTIVITY = {InspectionRecord.class,InspectionRecord.class,InspectionRecord.class};
    private final String TAG = this.getClass().getSimpleName();
    private RecyclerView mRecyclerView;
    private List<WorkSelect> mData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.rv_list);
        mRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL));
        mData = DataServer.getSampleData();
        Log.i(TAG, "onCreate: "+mData);
        SectionAdapter sectionAdapter = new SectionAdapter(R.layout.item_section_content, R.layout.def_section_head, mData);
        sectionAdapter.openLoadAnimation(BaseQuickAdapter.SCALEIN);
        mRecyclerView.addOnItemTouchListener(new OnItemClickListener() {

            @Override
            public void onSimpleItemClick(BaseQuickAdapter adapter, View view, int position) {
                WorkSelect mySection = mData.get(position);
                if (mySection.isHeader)
                    Toast.makeText(MainActivity.this, mySection.header+"----position:"+position, Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(MainActivity.this, mySection.t.getContent()+"----position:"+position, Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(), ACTIVITY[position]);
                startActivity(intent);
            }

//            @Override
//            public void onItemChildClick(BaseQuickAdapter adapter, View view, int position) {
//                Toast.makeText(MainActivity.this, "onItemChildClick" + position, Toast.LENGTH_LONG).show();
//            }


        });
        mRecyclerView.setAdapter(sectionAdapter);
    }

}

