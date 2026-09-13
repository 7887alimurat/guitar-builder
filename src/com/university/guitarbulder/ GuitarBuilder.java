package com.university.guitarbulder;

import java.utill.Set;

public class GuitarBuilder {

    private static final Set<Integer> ALLOWED_STRING_COUNTS = set.of(4, 6, 7, 8, 12);

    BodyType bodyType;
    int numberOfStrings;
    String bodyWood;
    String neckWood;
    PickupType pickupType = PickupType.NONE;
    BridgeType bridgeType = BridgeType.FIXED;
    String color = "Natural";
    boolean hasPickguard = false;
    boolean includesCase = false;

    public GuitarBuilder setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
        return this;
    }

    public GuitarBuilder setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
        return this;
    }

    public GuitarBuilder setBodyWood(String bodyWood) {
        this.bodyWood = bodyWood;
        return this;
    }

    public GuitarBuilder setNeckWood(String neckWood) {
        this.neckWood = neckWood;
        return this;
    }

    public GuitarBuilder setPickupType(PickupType pickupType) {
        this.pickupType = pickupType;
        return this;
    }

    public GuitarBuilder setBridgeType(BridgeType bridgeType) {
        this.bridgeType = bridgeType;
        return this;
    }

    public GuitarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public GuitarBuilder setHasPickguard(boolean hasPickguard) {
        this.hasPickguard = hasPickguard;
        return this;
    }

    public GuitarBuilder setIncludesCase(boolean includesCase) {
        this.includesCase = includesCase;
        return this;
    }

    public Guitar build() {
        vaildate();
        return new Guitar(this);
    }

    private void validate() {
        if (bodyType == null) {
            throw new InvalidGuitarConfigurationException(
                    "Body type must be specified before building a guitar.");

        }
        if (!ALLOWED_STRING_COUNTS.contains(numberOfStrings)) {
            throw new InvalidGuitarConfigurationException(
                    "Number of strings must be one of " + ALLOWED_STRING_COUNTS +
                            ", got " + numberOfStrings + ".");

        }
        if (bodyWood == null || neckWood == null) {
            throw new InvalidGuitarConfigurationException(
                    "Body wood and neck wood must be specifies.");

        }

        if (bodyType == BodyType.ACOUSTIC && pickupType != PickupType.NONE) {
            throw new InvalidGuitarConfigurationException(
                    "Acoustic guitars cannot have electric pickups (" + pickupType + ").");

        }
    }
}