package polytech.mo.utils;

import com.badlogic.gdx.Gdx;

public class Constants {
    public static int WIDTH, HEIGHT, DEVICE_WIDTH, DEVICE_HEIGHT, CAMERA_WIDTH, CAMERA_HEIGHT, FONT_REGULAR, FONT_LOGO, FONT_PREVIEW, PREVIEW_WIDTH, TABLE_PAD,
    CHECKBOX_SIZE, DIVIDER_WIDTH, GAME_CAMERA_WIDTH, GAME_CAMERA_HEIGHT;
    public static float ENTER_ANIMATION_DURATION, EXIT_ANIMATION_DURATION, DIALOG_ANIMATION_DURATION, BUTTON_SCALE, BUTTON_SCALE_DURATION;

    public Constants(){
        WIDTH=1920;
        HEIGHT=1080;
        DEVICE_WIDTH= Gdx.graphics.getWidth();
        DEVICE_HEIGHT=Gdx.graphics.getHeight();
        CAMERA_WIDTH=30;
        CAMERA_HEIGHT=18;
        FONT_REGULAR =59;
        FONT_LOGO =270;
        FONT_PREVIEW=90;
        ENTER_ANIMATION_DURATION =.51f;
        EXIT_ANIMATION_DURATION=.49f;
        DIALOG_ANIMATION_DURATION=.49f;
        BUTTON_SCALE=.88f;
        BUTTON_SCALE_DURATION=.055f;
        PREVIEW_WIDTH=360;
        TABLE_PAD=40;
        CHECKBOX_SIZE=80;
        DIVIDER_WIDTH=600;
        GAME_CAMERA_WIDTH=21;
        GAME_CAMERA_HEIGHT=12;
    }
}
