package kr.co.tjoeun.a20200319_02_fragmenr02.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;
import java.util.zip.Inflater;

import kr.co.tjoeun.a20200319_02_fragmenr02.R;
import kr.co.tjoeun.a20200319_02_fragmenr02.datas.ChickenStore;
import kr.co.tjoeun.a20200319_02_fragmenr02.datas.Room;

public class ChickenStoreAdapter extends ArrayAdapter<ChickenStore> {

    Context mContext;
    List<ChickenStore> mList;
    LayoutInflater inf;

    public ChickenStoreAdapter(@NonNull Context context, int resource, @NonNull List<ChickenStore> objects) {
        super(context, resource, objects);

        mContext = context;
        mList = objects;
        inf = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;

        if(row == null){
            row = inf.inflate(R.layout.chicken_store_list_item, null);
        }

        ChickenStore chickenStore = mList.get(position);

        TextView chickenStoreTxt = row.findViewById(R.id.chickenStoreTxt);

        chickenStoreTxt.setText(chickenStore.getStoreName());

        return row;

    }
}
