package S4.Models;

import java.util.Date;
import java.util.UUID;

public abstract class BaseTask {
    private UUID id;
    public UUID getId() {
        return id;
    }
    private Date dateAdded; 
    public Date getDateAdded() {
        return dateAdded;
    }
    private Date deadLine;
    public Date getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(Date deadLine) {
        this.deadLine = deadLine;
    }
    private String fio;
    public String getFio() {
        return fio;
    }
    private String header;
    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }
    private String description;
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private PriorityType priority;


    public PriorityType getPriority() {
        return priority;
    }

    public void setPriority(PriorityType priority) {
        this.priority = priority;
    }

    protected BaseTask(String fio) {
        dateAdded = new Date();
        id = UUID.randomUUID();
        this.fio = fio;
    }

    protected BaseTask(String fio, String header, String description) {
        this(fio);
        this.header = header;
        this.description = description;
    }
    protected BaseTask(String fio, String header, String description, Date deadLine) {
        this(fio, header, description);
        this.deadLine = deadLine;
    }


}
