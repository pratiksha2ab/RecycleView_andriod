package com.pratiksha.recycleview;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class SimpleRecylerViewAdapter extends RecyclerView.Adapter<SimpleRecylerViewAdapter.ViewHolder> {
//    ArrayList<String> meroData=new ArrayList<>()

    ArrayList<NewSampleModel>meroData=new ArrayList<>();
    Context context;




    SimpleRecylerViewAdapter(Context context,ArrayList<NewSampleModel> passedData){
        meroData=passedData;
        this.context=context;

    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view= LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.layout_simple_recycler,
                        parent,
                         false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
       viewHolder.textView.setText(Integer.toString(position+1));
        viewHolder.textView2.setText(meroData.get(position).name);

        viewHolder.textView3.setText(meroData.get(position).latitude);//tala view holder ma thapesi balla yeha pass garneview
    viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(
                    context,DetailActivity.class
            );
            intent.putExtra(
                    "data",meroData.get(position).name);
            context.startActivity(intent);
        }
    });
    }



    @Override
    public int getItemCount() {
        return meroData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
       TextView title;
        TextView textView;
        TextView textView2;
        TextView textView3;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.textView);
            textView=itemView.findViewById(R.id.textView);
            textView2=itemView.findViewById(R.id.textView2);
            textView3=itemView.findViewById(R.id.textView3);

            //jati thapinxa layout recycler ma teti nai yeha thapdai gainxa ,image number jati thape ni
        }
    }
}
