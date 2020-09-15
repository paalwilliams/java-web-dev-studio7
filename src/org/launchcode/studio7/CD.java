package org.launchcode.studio7;

public class CD extends BaseDisc {

    public double getBitrate() {
        return bitrate;
    }

    public void setBitrate(double bitrate) {
        this.bitrate = bitrate;
    }

    private double bitrate;

    @Override
    public void startDisc() {
        System.out.println("The CD is now spinning real fast");
    }

    @Override
    public void stopDisc() {
        System.out.println("Stopping that CD now");
    }


    public CD(int storageCapacity, String name, int dataSize, int runtime, String mediaType, double bitrate) {
        super(storageCapacity,name,dataSize,runtime,mediaType);
        this.bitrate = bitrate;
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
