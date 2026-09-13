package com.university.guitarbuilder;

public class GuitarDirector {

    public Guitar buildStratocasterStyle(GuitarBuilder builder) {
        return builder
                .setBodyType(BodyType.SOLID_BODY)
                .setNumberOfStrings(6)
                .setBodyWood("Alder")
                .setNeckWood("Maple")
                .setPickupType(PickupType.SINGLE_COIL)
                .setBridgeType(BridgeType.TREMOLO)
                .setColor("Sunburst")
                .build();
    }

    public Guitar buildAcousticDreadnought(GuitarBuilder builder) {
        return builder
                .setBodyType(BodyType.ACOUSTIC)
                .setNumberOfStrings(6)
                .setBodyWood("Spruce")
                .setNeckWood("Mahogany")
                .setPickupType(PickupType.NONE)
                .setBridgeType(BridgeType.FIXED)
                .setColor("Natural")
                .setIncludesCase(true)
                .build();
    }

    public Guitar buildMetalGuitar(GuitarBuilder builder) {
        return builder
                .setBodyType(BodyType.SOLID_BODY)
                .setNumberOfStrings(7)
                .setBodyWood("Basswood")
                .setNeckWood("Maple")
                .setPickupType(PickupType.HUMBUCKER)
                .setBridgeType(BridgeType.FIXED)
                .setColor("Matte Black")
                .build();
    }
}