package me.blok601.antiipvp;

/**
 * Created by Blok on 7/15/2017.
 */
public class Settings {

    public static boolean getCancel(){
        return Antiipvp.getInstance().getConfig().getBoolean("cancel-event");
    }

    public static String getCancelMessage(){
        return Antiipvp.getInstance().getConfig().getString("cancel-message");
    }

}
