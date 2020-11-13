package com.giannissupervettesoftwarebedrijfbvllcfirma;

import java.util.ArrayList;

public class Facebook {
    private ArrayList<FacebookPage> facebookPages;

    public ArrayList<FacebookPage> getFacebookPages() {
        return facebookPages;
    }

    public Facebook() {
        this.facebookPages = new ArrayList<>();
    }

    public void addPage(FacebookPage page) {
        this.facebookPages.add(page);
    }

    public void listPages(){
        for (FacebookPage facebookPage: this.facebookPages){
            facebookPage.printFacebookPage();
        }
    }
}
