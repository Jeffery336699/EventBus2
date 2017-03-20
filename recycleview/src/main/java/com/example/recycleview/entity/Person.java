package com.example.recycleview.entity;

import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.example.recycleview.adapter.ExpandableItemAdapter;

/**
 * Created by luoxw on 2016/8/10.
 */

public class Person implements MultiItemEntity {
    public Person(String name,String subName,int age) {
        this.age = age;
        this.name = name;
        this.subName=subName;
    }

    public String name;
    public String subName;
    public int age;

    @Override
    public int getItemType() {
        return ExpandableItemAdapter.TYPE_PERSON;
    }
}