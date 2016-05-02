package com.samux.musikapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.samux.musikapp.model.Tracks;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by Yonkishum on 5/1/2016.
 */
public class CustomListAdapter extends BaseAdapter {

    private Activity activity;
    private LayoutInflater inflater;
    private List<Tracks> tracksItems;
    ImageLoader imageLoader = AppController.getInstance().getImageLoader();

    public CustomListAdapter(Activity activity, List<Tracks> tracksItems) {
        this.activity = activity;
        this.tracksItems = tracksItems;
    }

    @Override
    public int getCount() {
        return tracksItems.size();
    }

    @Override
    public Object getItem(int position) {
        return tracksItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (inflater == null)
            inflater = (LayoutInflater) activity
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null)
            convertView = inflater.inflate(R.layout.list_row, null);

        if (imageLoader == null)
            imageLoader = AppController.getInstance().getImageLoader();
        NetworkImageView thumbNail = (NetworkImageView) convertView.findViewById(R.id.thumbnail);
        TextView title = (TextView) convertView.findViewById(R.id.title);
        TextView album = (TextView) convertView.findViewById(R.id.album);
        TextView artist = (TextView) convertView.findViewById(R.id.artist);

        Tracks m = tracksItems.get(position);

        thumbNail.setImageUrl(m.getThumbnailUrl(), imageLoader);

        title.setText(m.getTitle());

        album.setText(m.getAlbum());

        artist.setText(m.getArtist());

        return convertView;
    }
}