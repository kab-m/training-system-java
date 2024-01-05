package org.app.interfaces;

import java.util.Dictionary;
import java.util.List;

public interface TrainingModuleInterface {
    String getTitle();
    String getContent();
    Dictionary<String, String> getQuiz();
    List<EmployeeInterface> getParticipants();
    float getRewardPercentage();
    boolean getCompleted();
    void updateModule(String title, String content, Dictionary<String, String> quiz);
    void deleteModule();
}
