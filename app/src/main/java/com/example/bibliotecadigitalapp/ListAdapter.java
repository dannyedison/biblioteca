package com.example.bibliotecadigitalapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    private List<ListElement> mdata;
    private LayoutInflater mInflater;
    private Context context;


    public ListAdapter(List<ListElement> itemList, Context context){
        this.mInflater= LayoutInflater.from(context);
        this.context= context;
        this.mdata= itemList;

    }

    //metodos que rrecorren
    @Override
    public int getItemCount(){ return mdata.size();}

    @Override

    public ViewHolder onCreateViewHolder (ViewGroup parent, int viewType){
        View view = mInflater.inflate(R.layout.list_element, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position){
        holder.binData(mdata.get(position));
    }

    public void setItems(List<ListElement> items){ mdata= items;}

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView titulo, autor;
        ImageView imagen;

        ViewHolder (View itemView){

            super(itemView);
            //iconImage= itemView.findViewById(R.id.iconImageView);
            titulo= itemView.findViewById(R.id.tituloTextView);
            autor= itemView.findViewById(R.id.autorTextView);
            imagen=itemView.findViewById(R.id.imagenImageView);

        }

        void binData(final ListElement item){
            //iconImage.setColorFilter(Color.parseColor (item.getColor()), PorterDuff.Mode.SRC_IN);
            titulo.setText(item.getTitulo());
            autor.setText(item.getAutor());
            imagen.setImageResource(item.getImagen());

        }

    }

}








