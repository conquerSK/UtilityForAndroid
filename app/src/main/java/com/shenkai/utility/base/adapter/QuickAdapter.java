package com.shenkai.utility.base.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by shenkai on 2019/4/30.
 * Describe: 万能适配器
 */
public abstract class QuickAdapter<T> extends RecyclerView.Adapter<BaseViewHolder> {
    private List<T> mDatas;

    public QuickAdapter(List<T> datas) {
        mDatas = datas;
    }

    public abstract int getLayoutId(int viewType);

    @NonNull
    @Override
    public BaseViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        return BaseViewHolder.get(viewGroup, getLayoutId(viewType));
    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder baseViewHolder, int position) {
        convert(baseViewHolder, mDatas.get(position), position);
    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }

    public abstract void convert(BaseViewHolder holder, T data, int position);
}
