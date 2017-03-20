package com.example.recycleview;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.example.recycleview.adapter.ExpandableItemAdapter;
import com.example.recycleview.entity.Level0Item;
import com.example.recycleview.entity.Person;

import java.util.ArrayList;
import java.util.Random;

public class InspectionRecord extends BaseAcitivity {

    private RecyclerView mRecyclerView;
    private ArrayList<MultiItemEntity> list;
    private ExpandableItemAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setBackBtn();
        setTitle("ExpandableItem Activity");
        setContentView(R.layout.activity_inspection_record);

        mRecyclerView = (RecyclerView) findViewById(R.id.rv);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        list = generateData();
        adapter = new ExpandableItemAdapter(list);
        adapter.openLoadAnimation(BaseQuickAdapter.SLIDEIN_LEFT);
        mRecyclerView.setAdapter(adapter);
        expandAll();
    }

    private void expandAll() {
        for (int i = 0; i <list.size() ; i++) {
            adapter.expand(i + adapter.getHeaderLayoutCount(), false, false);
        }
    }

    private ArrayList<MultiItemEntity> generateData() {
        int lv0Count = 2;
        int personCount = 5;

        String[] nameList = {"Bob", "Andy", "Lily", "Brown", "Bruce"};
        Random random = new Random();

        ArrayList<MultiItemEntity> res = new ArrayList<>();
        for (int i = 0; i < lv0Count; i++) {
            Level0Item lv0 = new Level0Item("This is " + i + "th item in Level 0", "subtitle of " + i);
                for (int k = 0; k < personCount; k++) {
                    lv0.addSubItem(new Person(nameList[k],nameList[k]+"--子类", random.nextInt(40)));
                }
            res.add(lv0);
        }
        return res;
    }
}
