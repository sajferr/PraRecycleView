package com.example.m.prarecycleview;

/**
 * Created by m on 2016-07-11.
 */
public class Listy
{

    Listy (int image_id,String klub,String gwiazda){
        this.image_id = image_id;
        this.klub = klub;
        this.gwiazda=gwiazda;

    }

    public String getGwiazda() {


        return gwiazda;
    }

    public void setGwiazda(String gwiazda) {

        this.gwiazda = gwiazda;
    }

    public int getImage_id() {

        return image_id;
    }

    public void setImage_id(int image_id) {

        this.image_id = image_id;
    }

    public String getKlub() {

        return klub;
    }

    public void setKlub(String klub) {

        this.klub = klub;
    }

    String gwiazda,klub;
    int image_id;




}
