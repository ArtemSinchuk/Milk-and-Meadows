package com.github.artemsinchuk.gui.components;

import javax.swing.JProgressBar;

public class ProgressBar extends JProgressBar {

  public ProgressBar() {
    setSize(100, 15);
    setMaximum(100);
    setValue(100);
  }
}
