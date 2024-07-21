package operations;




public class Transaction {
	
    private Long id;
    private String transactionId;
    private String transactionData;

    
    public Transaction() {}

    public Transaction(String transactionId, String transactionData) {
        this.transactionId = transactionId;
        this.transactionData = transactionData;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionData() {
        return transactionData;
    }

    public void setTransactionData(String transactionData) {
        this.transactionData = transactionData;
    }
}
