package kr.co.tjoeun.a20200319_02_fragmenr02.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import kr.co.tjoeun.a20200319_02_fragmenr02.fragments.ChickenStoreFragment;
import kr.co.tjoeun.a20200319_02_fragmenr02.fragments.RoomListFragment;

public class MainViewPagerAdapter extends FragmentPagerAdapter {
    public MainViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return new ChickenStoreFragment();
        }
        else{
            return new RoomListFragment();
        }
    }

    @Override
    public int getCount() { // 화면 몇페이지 쓸거니?
        return 2;
    }
}
