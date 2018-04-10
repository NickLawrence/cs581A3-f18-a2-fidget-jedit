package org.gjt.sp.jedit.gui;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.Serializable;

import javax.swing.UIManager;

public class VersionLabel implements Serializable {
	private static final long serialVersionUID = -7174120476605029745L;
	private Font labelFont = UIManager.getFont("Label.font").deriveFont(9.8f);
	private Color versionColor1 = new Color(55, 55, 55);
	private Color versionColor2 = new Color(255, 255, 255, 50);

	public Font getLabelFont() {
		return labelFont;
	}

	public void paintString(Graphics g, String version, int drawOffsetX, int drawOffsetY) {
		g.setFont(labelFont);
		g.setColor(versionColor1);
		g.drawString(version, drawOffsetX, drawOffsetY);
		g.setColor(versionColor2);
		g.drawString(version, drawOffsetX + 1, drawOffsetY + 1);
	}
}