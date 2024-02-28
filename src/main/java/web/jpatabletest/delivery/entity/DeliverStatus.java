package web.jpatabletest.delivery.entity;

public enum DeliverStatus {

    READY("배송"),
    COMP("배송 완료");

    private String status;

    DeliverStatus(String status) {
        this.status = status;
    }
}
