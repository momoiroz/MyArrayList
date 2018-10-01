/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myarraylist;
//STEP 3: Test program

public class TestProgram {

    public static void main(String[] args) {
        //Parameter constructor with list len = 4
        ArrayList<Movies> movie = new ArrayList<Movies>(4);
        //current size
        System.out.println("Current size: " + movie.size());
        //isEmpty method
        if (movie.isEmpty()) {
            System.out.println("The list is empty!");
        } else {
            System.out.println("The list is not empty!");
        }
        //Adding movies
        Movies mv1 = new Movies("Venom", 2018, 8);
        movie.add(mv1);
        Movies mv2 = new Movies("Frozen", 2013, 6);
        movie.add(mv2);
        Movies mv3 = new Movies("A quiet place", 2017, 8);
        movie.add(mv3);
        Movies mv4 = new Movies("The Shawshank redemption", 1994, 9);
        movie.add(mv4);
        Movies mv5 = new Movies("Shrek", 2001, 8);
        movie.add(mv5);
        //method toString()
        System.out.println("\nMovie list after adding 5 new movies: ");
        System.out.println(movie.toString());
        //current size after adding movies
        System.out.println("Current size: " + movie.size());
        //set movie number 3 method
        Movies mv6 = new Movies("Big fish", 2003, 9);
        movie.set(2, mv6);
        //after setting movie
        System.out.println("\nMovie list after changing movie number 3: ");
        System.out.println(movie.toString());
        //remove movie number 1
        movie.remove(0);
        System.out.println("\nMovie list after removing movie number 1: ");
        System.out.println(movie.toString());
        System.out.println("Current size: " + movie.size());
        //isEmpty() method
        if (movie.isEmpty()) {
            System.out.println("The list is empty!");
        } else {
            System.out.println("The list is not empty!");
        }
        //get movie number 3
        Movies x = movie.get(2);
        System.out.println("\nThis is the movie after getting: "+x.toString());
    }

}
