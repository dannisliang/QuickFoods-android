package com.intuit.quickfoods;

import android.graphics.Color;

public final class Constants {

    // settings
    public static String FTU_ENABLED = "FTU Enabled";

    public static String take_order = "Take Order";
    public static String items = "Items";
    public static String kitchen = "Kitchen";
    public static String history = "History";
    public static String review = "Reviews";

    // if you change this order the todal order will change
    public static String[] nav_drawer_items = new String[]{take_order, items,
            kitchen, history, review};

    // colors
    public static int nav_drawer_text_color = Color.BLACK;

    public static int ITEM_CREATED_STATUS = 0;
    public static int ITEM_IN_KITCHEN = 1;
    public static int ITEM_COMPLETE = 2;
    // colors for items in take order page
    public static int[] ITEM_BORDER = new int[]{
            R.drawable.black_orange_border,
            R.drawable.black_blue_border,
            R.drawable.black_green_border
    };

    // data will be like command^1`2`3~4`5`6
    public static String DELIMITER_COMMAND = "^";
    public static String DELIMITER_ITEM = "`";
    public static String DELIMITER_ITEM_SET = "~";

    // message codes
    public static int _TO_K_ORDER_SUBMIT = 1;
    public static int _TO_W_ORDER_COMPLETE = 2;
    public static int _TO_K_ORDER_DIRECTIONS = 3;
    public static int _TO_K_DELETE_ORDER= 4;

}
