/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myarraylist;
//STEP 2: define a movie class
public class Movies {
    private String name;
    private int year;
    private int rating;
    private static final int ratingRange = 10;

    public Movies() {
    }

    public Movies(String name, int year, int rating) {
        this.name = name;
        this.year = year;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
//override to string method
    @Override
    public String toString() {
        String s;
        s="Movie: "+name+". Release: "+year+". Rating: "+rating+"/"+ratingRange+"\n";
        return s;
    }
    
    
}
