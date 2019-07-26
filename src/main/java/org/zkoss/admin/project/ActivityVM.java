package org.zkoss.admin.project;

import org.zkoss.admin.project.dao.*;
import org.zkoss.zul.ListModelList;

public class ActivityVM {
    private ListModelList<Activity> activityList;

    public ActivityVM(){
        activityList = new ListModelList<>(Dao.getActivityList());
    }

    public ListModelList<Activity> getActivityList() {
        return activityList;
    }
}
