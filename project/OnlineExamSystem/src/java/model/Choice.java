package model;

/**
 * Choice generated by hbm2java
 */
public class Choice implements java.io.Serializable {

    private static final long serialVersionUID = -5006284148909625602L;

    private int id;
    private Question question;
    private String content;
    private boolean correct;

    public Choice() {
    }

    public Choice(int id, Question question, String content, boolean correct) {
        this.id = id;
        this.question = question;
        this.content = content;
        this.correct = correct;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Question getQuestion() {
        return this.question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isCorrect() {
        return this.correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

}