/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.java.skripsi;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Andi Taru NNW
 */
public class ImageFilter extends FileFilter {

    @Override
    public boolean accept(File f) {
        if (f.isFile() && f.getName().endsWith(".JPG")
                && f.getName().endsWith(".JPEG"))
            return true;
        else
            return false;
    }

    @Override
    public String getDescription() {
        return "JPEG Image Files";
    }

}