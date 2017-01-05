package com.seonoh.tabrecycler.tabrecyclerexample;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by 선오 on 2017-01-04.
 */
public class TabPageAdapter extends FragmentStatePagerAdapter {
    //탭 개수
    private int tabcount;

    public TabPageAdapter(FragmentManager fm, int tabcount) {
        super(fm);
        this.tabcount = tabcount;
    }
    @Override
    public int getCount() {
        return tabcount;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 : MyTabFragment01 myTabFragment01 = new MyTabFragment01();
                return myTabFragment01;

            case 1 : MyTabFragment02 myTabFragment02 = new MyTabFragment02();
                return myTabFragment02;

            case 2 : MyTabFragment03 myTabFragment03 = new MyTabFragment03();
                return  myTabFragment03;

            default: return null;
        }
    }
}
