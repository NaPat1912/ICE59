package pbru.ice.nataporn.ice59;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Administrator on 6/4/2559.
 */
public class MyAdapter extends BaseAdapter {

    private Context objContext;
    private int[] comInts;
    private String comString;

    public MyAdapter(Context context, int[] ints, String[] string) {
        this.objContext = context;
        this.comInts = ints;
        this.comString = string;
    }

    @Override
    public int getCount() {
        return comString.length();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater objLayoutInflater = (LayoutInflater) objContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = objLayoutInflater.inflate(R.layout.com,viewGroup,false);

        ImageView iconImageView = (ImageView) view1.findViewById(R.id.imageView);
        iconImageView.setBackgroundResource(comInts[i]);

        TextView titleTextView = (TextView) view1.findViewById(R.id.textView2);
        titleTextView.setText(comString);

        return view1;
    }
}
