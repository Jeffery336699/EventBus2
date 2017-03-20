package com.example.recycleview.entity;

import com.chad.library.adapter.base.entity.SectionEntity;

/**
 * Created by $tangj$
 * Time at: 2017/3/18 22:14
 */

public class WorkSelect extends SectionEntity<WorkContent>{
    public boolean isMore;
    public boolean isHeader;
    public String header;

    public WorkSelect(boolean isHeader, String header, boolean isMroe) {
        super(isHeader, header);
        this.isHeader=isHeader;
        this.isMore = isMroe;
        this.header=header;
    }

    public WorkSelect(WorkContent t) {
        super(t);
    }

    public boolean isMore() {
        return isMore;
    }

    public void setMore(boolean mroe) {
        isMore = mroe;
    }

    @Override
    public String toString() {
        return "WorkSelect{" +
                "isMore=" + isMore +
                ", isHeader=" + isHeader +
                ", header='" + header + '\'' +
                '}';
    }
}
