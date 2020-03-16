package com.chris.mukasa.dialoger;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.widget.TextView;

import java.util.Objects;

public class Dialoger
{
    public static void download(Dialog dialog, String title, String message)
    {
        dialog.setCancelable(true);
        dialog.setContentView(R.layout.dialog_animation_download);
        TextView lb_tile    = dialog.findViewById(R.id.lb_dialog_animation_title);
        TextView lb_message = dialog.findViewById(R.id.lb_dialog_animation_message);

        lb_tile   .setText(title);
        lb_message.setText(message);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT)
            Objects.requireNonNull(dialog.getWindow()).setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
    }

    public static void error(Dialog dialog, String title, String message)
    {
        dialog.setCancelable(true);
        dialog.setContentView(R.layout.dialog_animation_error);
        TextView lb_tile    = dialog.findViewById(R.id.lb_dialog_animation_title);
        TextView lb_message = dialog.findViewById(R.id.lb_dialog_animation_message);

        lb_tile   .setText(title);
        lb_message.setText(message);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT)
            Objects.requireNonNull(dialog.getWindow()).setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
    }

    public static void loading(Dialog dialog, String title, String message)
    {
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.dialog_animation_loading);
        TextView lb_tile    = dialog.findViewById(R.id.lb_dialog_animation_title);
        TextView lb_message = dialog.findViewById(R.id.lb_dialog_animation_message);

        lb_tile   .setText(title);
        lb_message.setText(message);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT)
            Objects.requireNonNull(dialog.getWindow()).setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
    }

    public static void network(Dialog dialog, String title, String message)
    {
        dialog.setCancelable(true);
        dialog.setContentView(R.layout.dialog_animation_network);
        TextView lb_tile    = dialog.findViewById(R.id.lb_dialog_animation_title);
        TextView lb_message = dialog.findViewById(R.id.lb_dialog_animation_message);

        lb_tile   .setText(title);
        lb_message.setText(message);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT)
            Objects.requireNonNull(dialog.getWindow()).setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
    }

    public static void success(Dialog dialog, String title, String message)
    {
        dialog.setCancelable(true);
        dialog.setContentView(R.layout.dialog_animation_success);
        TextView lb_tile    = dialog.findViewById(R.id.lb_dialog_animation_title);
        TextView lb_message = dialog.findViewById(R.id.lb_dialog_animation_message);

        lb_tile   .setText(title);
        lb_message.setText(message);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT)
            Objects.requireNonNull(dialog.getWindow()).setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
    }
}
