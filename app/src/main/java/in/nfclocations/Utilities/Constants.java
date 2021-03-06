package in.nfclocations.Utilities;

import okhttp3.MediaType;

/**
 * Created by Brekkishhh on 24-08-2016.
 */
public class Constants {

    public static final String IS_SENDED = "sended";
    public static final String IS_RECEIVED = "received";

    public static final int SENDER = 0;
    public static final int RECEIVED = 1;
    public static final String TYPE_MESSAGE_TEXT  = "text_message";
    public static final String TYPE_MESSAGE_IMAGE = "image_message";
    public static final String TYPE_MESSAGE_VIDEO  = "video_message";
    public static final int RQ_GALLERY_IMAGE = 574;

    public static final MediaType TYPE_JSON = MediaType.parse("application/json; charset=utf-8");

}
