package com.example.splashdemo.Trafficrules;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.example.splashdemo.R;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public  class ListViewMainAdapter extends BaseExpandableListAdapter {
private List<String> listGroup;
private Context context;
private HashMap<String,List<String>> listItem;


    ListViewMainAdapter(Context context, List<String> listGroup, HashMap<String, List<String>> listItem){
    this.context=context;
    this.listGroup=listGroup;
    this.listItem=listItem;

}

    @Override
    public int getGroupCount() {
        return  listGroup.size();

    }

    @Override
    public int getChildrenCount(int i) {
        return  Objects.requireNonNull(this.listItem.get(this.listGroup.get(i))).size();
}

    @Override
    public Object getGroup(int i) {
        return this.listGroup.get(i);
    }

    @Override
    public Object getChild(int i, int childPosition) {
        return this.listItem.get(this.listGroup.get(i)).get(childPosition);
    }

    @Override
    public long getGroupId(int i) {
        return i;
    }

    @Override
    public long getChildId(int i, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
        String group=(String) getGroup(i);
        if (view==null){
            LayoutInflater layoutInflater=(LayoutInflater)
            this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view=layoutInflater.inflate(R.layout.list_group,null);

        }
        TextView textView=view.findViewById(R.id.list_parent);
        textView.setText(group);
        return view;
    }

    @Override
    public View getChildView(int i, int childPosition, boolean b, View view, ViewGroup viewGroup) {
       String child=(String) getChild(i,childPosition);
       if(view==null){
           LayoutInflater layoutInflater=(LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
           view=layoutInflater.inflate(R.layout.list_item,null);
       }
        TextView textView=view.findViewById(R.id.listchild);
        textView.setText(child);
        return view;
    }

    @Override
    public boolean isChildSelectable(int i, int childPosition) {
        return true;
    }
}
