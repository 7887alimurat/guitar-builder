package com.university.guitarbuilder;

public class Main {
    public static void main(String[] args) {
        GuitarDirector director = new GuitarDirector();

        // Сборка через Director — типовые конфигурации
        Guitar strat = director.buildStratocasterStyle(new GuitarBuilder());
        Guitar acoustic = director.buildAcousticDreadnought(new GuitarBuilder());
        Guitar metal = director.buildMetalGuitar(new GuitarBuilder());

        System.out.println("Preset guitars:");
        System.out.println(strat);
        System.out.println(acoustic);
        System.out.println(metal);

        // Ручная сборка клиентом напрямую через билдер (без Director)
        Guitar custom = new GuitarBuilder()
                .setBodyType(BodyType.HOLLOW_BODY)
                .setNumberOfStrings(6)
                .setBodyWood("Maple")
                .setNeckWood("Mahogany")
                .setPickupType(PickupType.HUMBUCKER)
                .setBridgeType(BridgeType.FIXED)
                .setColor("Cherry Red")
                .setHasPickguard(true)
                .build();

        System.out.println("\nCustom guitar:");
        System.out.println(custom);

        // Bалидация: невалидная конфигурация должна кинуть исключение
        System.out.println("\nTrying an invalid configuration:");
        try {
            new GuitarBuilder()
                    .setBodyType(BodyType.ACOUSTIC)
                    .setNumberOfStrings(6)
                    .setBodyWood("Spruce")
                    .setNeckWood("Mahogany")
                    .setPickupType(PickupType.HUMBUCKER) // акустика + хамбакер — ошибка
                    .build();
        } catch (InvalidGuitarConfigurationException e) {
            System.out.println("Caught expected error: " + e.getMessage());
        }
    }
}
