package com.university.guitarbulder;

public class Guitar {
    private final BodyType;
    private final int numberOfStrings;
    private final String bodyWood;
    private final String neckWood;
    private final PickupType pickupType;
    private final BridgeType bridgeType;
    private final boolean hasPickguard;
    private final boolean includesCase;

    Guitar(GuitarBuilder builder) {
        this.bodytype = builder.bodyType;
        this.numberOfStrings = builder.numberOfStrings;
        this.bodyWood = builder.bodyWood;
        this.neckWood = builder.neckWood;
        this.pickupType = builder.pickupType;
        this.color = builder.color;
        this.hasPickguard = builder.hasPickguard;
        this.includesCase = builder.includesCase;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "bodyType=" + bodyType +
                ", strings=" + numberOfStrings +
                ", bodyWood='" + bodyWood + '\'' +
                ", neckWood='" + neckWood + '\'' +
                ", pickupType=" + pickupType +
                ", bridgeType=" + bridgeType +
                ", color='" + color + '\'' +
                ", pickguard=" + hasPickguard +
                ", case=" + includesCase +
                '}';
    }
}