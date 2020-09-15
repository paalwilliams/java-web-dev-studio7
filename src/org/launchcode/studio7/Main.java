package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.

        CD myCD = new CD(512, "Now that's what I call music XXXXVI", 300, 60, "AAC", 44100.00);
        DVD myDVD = new DVD(800, "Cherita Lashley", 500, 120, "MP4", 1080);

        // TODO: Call each CD and DVD method to verify that they work as expected.

        myCD.startDisc();
        myDVD.stopDisc();
        myCD.getRemainingCapacity();
        myDVD.getRemainingCapacity();

    }
}
