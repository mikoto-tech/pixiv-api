package net.mikoto.pixiv.api.model;

import java.util.Objects;

/**
 * @author mikoto
 * @date 2022/3/27 3:42
 */
public class ForwardServer {
    private final String address;
    private final int weight;
    private int currentWeight = 0;
    private String key;

    public ForwardServer(String address, int weight) {
        this.address = address;
        this.weight = weight;
    }

    public ForwardServer(String address, int weight, String key) {
        this.address = address;
        this.weight = weight;
        this.key = key;
    }

    public String getAddress() {
        return address;
    }

    public int getWeight() {
        return weight;
    }

    public int getCurrentWeight() {
        return currentWeight;
    }

    public void setCurrentWeight(int currentWeight) {
        this.currentWeight = currentWeight;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ForwardServer that)) {
            return false;
        }
        return getWeight() == that.getWeight() && getCurrentWeight() == that.getCurrentWeight() && getAddress().equals(that.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAddress(), getWeight(), getCurrentWeight());
    }

    @Override
    public String toString() {
        return "Mikoto-Pixiv-Generic-Data-Type[" + this.getClass().getPackage().getName() + this.getClass().getName() + "]:\nForwardServer{" +
                "address='" + address + '\'' +
                ", weight=" + weight +
                ", currentWeight=" + currentWeight +
                ", key='" + key + '\'' +
                '}';
    }
}
