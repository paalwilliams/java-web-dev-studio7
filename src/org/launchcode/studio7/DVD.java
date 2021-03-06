package org.launchcode.studio7;

public class DVD extends BaseDisc {
    private int resolution;

    public DVD(int storageCapacity, String name, int dataSize, int runtime, String mediaType, int resolution) {
        super(storageCapacity,name,dataSize,runtime,mediaType);
        this.resolution = resolution;
    }


    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    @Override
    public void startDisc() {
        System.out.println("The DVD is now spinning real fast");
    }

    @Override
    public void stopDisc() {
        System.out.println("The DVD is now stopping");
    }


    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
