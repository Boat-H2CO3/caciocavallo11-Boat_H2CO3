package net.java.openjdk.awt.peer.web;

import sun.awt.*;
import sun.font.*;

public class WebFontManager extends X11FontManager {
    
    @Override
    protected FontConfiguration createFontConfiguration() {
	FcFontConfiguration fcFontConfig = new FcFontConfiguration(this);
	fcFontConfig.init();
	return fcFontConfig;
    }

    @Override
    protected String getFontPath(boolean b) {
	return "";
    }
}