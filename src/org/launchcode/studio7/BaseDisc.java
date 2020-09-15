package org.launchcode.studio7;

public abstract class BaseDisc implements OpticalDisc{
    protected int storageCapacity;
    protected String name;
    protected int runtime;

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    private String mediaType;

    public int getDataSize() {
        return dataSize;
    }

    public void setDataSize(int dataSize) {
        this.dataSize = dataSize;
    }

    private int dataSize;



    public BaseDisc(int storageCapacity, String name, int dataSize, int runtime, String mediaType) {
        this.storageCapacity = storageCapacity;
        this.name = name;
        this.dataSize = dataSize;
        this.runtime = runtime;
        this.mediaType = mediaType;
    }

    public void getRemainingCapacity() {
        System.out.println("Used space: " + this.dataSize + "MB Capacity: " + this.storageCapacity + "MB Remaining Space: " + (this.storageCapacity - this.dataSize) + "MB");

    }

}
