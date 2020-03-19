package kr.co.tjoeun.a20200319_02_fragmenr02.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

import kr.co.tjoeun.a20200319_02_fragmenr02.R;
import kr.co.tjoeun.a20200319_02_fragmenr02.adapters.ChickenStoreAdapter;
import kr.co.tjoeun.a20200319_02_fragmenr02.databinding.FragmentChickenStoreBinding;
import kr.co.tjoeun.a20200319_02_fragmenr02.datas.ChickenStore;

public class ChickenStoreFragment extends Fragment {

    List<ChickenStore> chickenStoreList = new ArrayList<>();

    ChickenStoreAdapter adapter = null;

    FragmentChickenStoreBinding binding = null;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_chicken_store, container, false);

                return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        adapter = new ChickenStoreAdapter(getActivity(), R.layout.chicken_store_list_item, chickenStoreList);

        binding.chickenListView.setAdapter(adapter);

        chickenStoreList.add(new ChickenStore("굽네치킨"));
        chickenStoreList.add(new ChickenStore("네네치킨"));
        chickenStoreList.add(new ChickenStore("BBQ"));
        chickenStoreList.add(new ChickenStore("호식이두마리치킨"));
        chickenStoreList.add(new ChickenStore("처갓집치킨"));
        chickenStoreList.add(new ChickenStore("호치킨"));
        chickenStoreList.add(new ChickenStore("맛닭꼬"));

        adapter.notifyDataSetChanged();
    }
}
