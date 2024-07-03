package pe.elcafe.api.purchaseorder.domain;

public enum Status {
    PROCESSING, // Payment method and products availability are being confirmed
    PENDING, // Items are being picked and packed
    COMPLETED,
    CANCELLED,
    REFUNDED,
    EXCHANGED
}
