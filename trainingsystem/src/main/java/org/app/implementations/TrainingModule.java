package org.app.implementations;
import org.app.interfaces.EmployeeInterface;
import org.app.interfaces.TrainingModuleInterface;
import java.util.Dictionary;
import java.util.List;
import java.util.Objects;

public class TrainingModule implements TrainingModuleInterface {
    private String title;
    private String content;
    private Dictionary<String, String> quiz;
    private List<EmployeeInterface> participants;
    private float rewardPercentage;
    private boolean completed;


    // Constructor

    public TrainingModule(String title, String content, Dictionary<String, String> quiz, List<EmployeeInterface> participants, float rewardPercentage) {
        this.title = title;
        this.content = content;
        this.quiz = quiz;
        this.participants = participants;
        this.rewardPercentage = rewardPercentage;
        this.completed = false;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        TrainingModule that = (TrainingModule) obj;
        return Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

    // setter methods
    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setQuiz(Dictionary<String, String> quiz) {
        this.quiz = quiz;
    }

    public void setParticipants(List<EmployeeInterface> participants) {
        this.participants = participants;
    }

    public void setRewardPercentage(float rewardPercentage) {
        if (rewardPercentage >= 0 && rewardPercentage <= 100) {
            this.rewardPercentage = rewardPercentage;
            System.out.println("Reward Percentage Setting Success");
        } else {
            System.out.println("Reward Percentage Setting Error");
        }
    }

    public void setCompleted() {
        this.completed = true;
    }

    // Interface getter methods

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String getContent() {
        return this.content;
    }

    @Override
    public Dictionary<String, String> getQuiz() {
        return quiz;
    }

    @Override
    public List<EmployeeInterface> getParticipants() {
        return participants;
    }

    @Override
    public float getRewardPercentage() {
        return rewardPercentage;
    }

    @Override
    public boolean getCompleted() {
        return completed;
    }


    @Override
    public void updateModule(String title, String content, Dictionary<String, String> quiz) {
        this.title = title;
        this.content = content;
        this.quiz = quiz;
    }

    @Override
    public void deleteModule() {
        // Implementation for deleting a module
    }


}