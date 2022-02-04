// Sort package names and format them: for latex.

package com.RA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringSorter {
    public static void main(String[] args) {
        sortLatexPackages();
    }

    private static void sortLatexPackages() {
        ArrayList<String> literals = new ArrayList<>(List.of("authblk, % Redefines \\author command. Permits footnote type affiliation.", "transparent, % Control image/text transparency. OR, make a transparent photo from photoshop.", "hyperref, % clickable hyper link", "gensymb, % degree symbol", "multimedia, % sound, audio, video. Supported by beamer distro. Use media9 for another LaTeX class.", "qrcode", "caption, % I used it to remove buit-in caption tag from any figure by like \\caption*{•}", "awesomebox", "array, % control table-rule properties", "longtable, % another version of table that can extends through many pages. To use it in beamer class: \\documentclass[table, compress]{beamer}", "graphicx", "tabularx", "listings", "xcolor"));
        Collections.sort(literals);

        System.out.println("\\usepackage");
        System.out.println("{");
        for(String _package : literals)
            System.out.println("\t" + _package);
        System.out.println("}");
    }
}