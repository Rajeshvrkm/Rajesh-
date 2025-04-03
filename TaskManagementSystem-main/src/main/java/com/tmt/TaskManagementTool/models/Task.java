package com.tmt.TaskManagementTool.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document( collection = "Task")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {

    @Id
    private ObjectId id;
    private String tid;
    private String title;
    private String description;
    private String status;
    private String priority;
    private LocalDate dueDate;
    private String createdBy;
    private String createdAt;
    private String assignedTo;
    private String assignedDate;
    private String taskType;
    private String taskCategory;
    @DocumentReference
    private List<Comment> comments = new ArrayList<Comment>();
    @DocumentReference
    private List<Attachment> attachments = new ArrayList<Attachment>();

    public void setCreatedBy(String nraj) {
    }

    public void setTid(String tid) {
    }

    public void setTitle(String title) {
    }

    public void setDescription(String description) {
    }

    public void setStatus(String status) {
    }

    public void setPriority(String priority) {
    }

    public void setAssignedTo(String assignedTo) {
    }

    public void setDueDate(LocalDate dueDate) {
    }

    public void setTaskType(String taskType) {
    }

    public void setTaskCategory(String taskCategory) {
    }

    public void setComments(List<Comment> comments) {
    }

    public void setAttachments(List<Attachment> attachments) {
    }

    public List<Comment> getComments() {
        return null;
    }

    public List<Attachment> getAttachments() {
        return null;
    }

    public PdfPCell getCreatedBy() {
        return null;
    }

    public PdfPCell getTid() {
        return null;
    }

    public Phrase getTitle() {
        return null;
    }

    public Phrase getCreatedAt() {
        return null;
    }

    public Phrase getPriority() {
        return null;
    }

    public Phrase getStatus() {
        return null;
    }

    public Object getDueDate() {
        return null;
    }

    public Phrase getAssignedTo() {
        return null;
    }

    public void setCreatedAt(String currentDateTime) {
    }

    public ObjectId getId() {
        return null;
    }
}
