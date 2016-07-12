package com.example.m.prarecycleview;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by m on 2016-07-11.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter. RecyclerViewHolder> {

    ArrayList<Listy> arrayList = new ArrayList<Listy>();
    private static int HEAD=0;
    private static int LIST=1;


    RecyclerAdapter (ArrayList<Listy> arrayList){
        this.arrayList=arrayList;

    }

    @Override
    public int getItemViewType(int position) {

        if(position==0){
            return HEAD;
        }
        return LIST;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;

       if(viewType==LIST){
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_layout,parent,false);
           RecyclerViewHolder viewHolder = new  RecyclerViewHolder(view,viewType);
           return viewHolder;
       }
        if(viewType==HEAD){

             view = LayoutInflater.from(parent.getContext()).inflate(R.layout.head_titles,parent,false);
            RecyclerViewHolder viewHolder = new  RecyclerViewHolder(view,viewType);
            return viewHolder;

        }
        return null;

    }

    @Override
    public void onBindViewHolder( RecyclerViewHolder holder, int position) {
        Listy listy;
        if(holder.viewType==HEAD){
            holder.titleKlub.setText("KLUB");
            holder.titleHerb.setText("Herb");
            holder.titleGwiazda.setText("Gwiazda");
        }
        if(holder.viewType==LIST) {
            listy = arrayList.get(position);
            holder.image1.setImageResource(listy.getImage_id());
            holder.tekstKlub.setText(listy.getKlub());
            holder.testGwiazda.setText(listy.getGwiazda());
        }





    }

    @Override
    public int getItemCount() {

        return arrayList.size()+1;
    }



    static  class  RecyclerViewHolder extends RecyclerView.ViewHolder{
      //variables for list
      ImageView image1;
        int viewType;
      TextView tekstKlub,testGwiazda;
      //variables for header
        TextView titleKlub,titleGwiazda,titleHerb;

      public   RecyclerViewHolder(View itemView,int position2) {
          super(itemView);
          if(position2==LIST){

              image1 = (ImageView)itemView.findViewById(R.id.imageView);
              tekstKlub=(TextView)itemView.findViewById(R.id.textView2);
              testGwiazda = (TextView)itemView.findViewById(R.id.textView);
              viewType =1;


          }

          if(position2==HEAD){


              titleHerb = (TextView)itemView.findViewById(R.id.textView3);
              Log.d("Uwaga","titleherbzrobiony");
              titleKlub = (TextView)itemView.findViewById(R.id.textView4);
              Log.d("Uwaga","titleklubzrobiony");
              titleGwiazda = (TextView)itemView.findViewById(R.id.textView5);
              Log.d("Uwaga","titlegwiazdazrobiony");
              viewType = 0;


          }




      }

  }
}
