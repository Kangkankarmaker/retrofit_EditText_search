package com.kangkan.developer.retrofitselect;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class Adapter extends ArrayAdapter<Contact> {

    private Context context;
    private List<Contact> responses;
    public Adapter(@NonNull Context context, List<Contact> responses) {
        super(context, R.layout.student_rows ,responses);
        this.context =context;
        this.responses = responses;
    }

    class ViewHolder{
        TextView stuName,stuPhone,s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ViewHolder viewHolder;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            assert inflater != null;
            convertView = inflater.inflate(R.layout.student_rows, parent, false);

            viewHolder.stuName = convertView.findViewById(R.id.stu_name);
            viewHolder.stuPhone = convertView.findViewById(R.id.stu_phone);
            viewHolder.s1 = convertView.findViewById(R.id.stu_1);
            viewHolder.s2 = convertView.findViewById(R.id.stu_2);
            viewHolder.s3 = convertView.findViewById(R.id.stu_3);
            viewHolder.s4 = convertView.findViewById(R.id.stu_4);
            viewHolder.s5 = convertView.findViewById(R.id.stu_5);
            viewHolder.s6 = convertView.findViewById(R.id.stu_6);
            viewHolder.s7 = convertView.findViewById(R.id.stu_7);
            viewHolder.s8 = convertView.findViewById(R.id.stu_8);
            viewHolder.s9 = convertView.findViewById(R.id.stu_9);
            viewHolder.s10 = convertView.findViewById(R.id.stu_10);
            viewHolder.s11 = convertView.findViewById(R.id.stu_11);


            convertView.setTag(viewHolder);

        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.stuName.setText(responses.get(position).getSName());
        viewHolder.stuPhone.setText(responses.get(position).getSId());
        viewHolder.s1.setText(responses.get(position).getSReg());
        viewHolder.s2.setText(responses.get(position).getSRoll());
        viewHolder.s3.setText(responses.get(position).getInstitute());
        viewHolder.s4.setText( responses.get(position).get211());
        viewHolder.s5.setText(responses.get(position).get212());
        viewHolder.s6.setText(responses.get(position).get213());
        viewHolder.s7.setText(responses.get(position).get214());
        viewHolder.s8.setText(responses.get(position).get215());

        return convertView;

    }
}
