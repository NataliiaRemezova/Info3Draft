package GetMotivated;

public class Task {
    private String name;
    private String description;
    private TaskTimer timer;
    private boolean isTimeSensitive;
    private String plannedTimeslot;
    private String deadline;
    private boolean notification;
    private boolean isDone;
    private Montage photo;
    private String project;

    //constructor
    public Task(String name, String description, TaskTimer timer, String deadline, boolean notification, String project) {
        this.name = name;
        this.description = description;
        this.timer = timer;
        this.isTimeSensitive = this.timer!=null;
        this.plannedTimeslot = null;
        this.deadline = deadline;
        this.notification = notification;
        this.isDone = false;
        this.photo = null;
        this.project = project;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTimer(TaskTimer timer) {
        this.timer = timer;
    }

    public void setTimeSensitive(boolean timeSensitive) {
        isTimeSensitive = timeSensitive;
    }

    public void setPlannedTimeslot(String plannedTimeslot) {
        this.plannedTimeslot = plannedTimeslot;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public void setNotification(boolean notification) {
        this.notification = notification;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public void setPhoto(Montage photo) {
        this.photo = photo;
    }

    public void setProject(String project) {
        this.project = project;
    }

    //getter
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public TaskTimer getTimer() {
        return timer;
    }

    public boolean isTimeSensitive() {
        return isTimeSensitive;
    }

    public String getPlannedTimeslot() {
        return plannedTimeslot;
    }

    public String getDeadline() {
        return deadline;
    }

    public boolean isNotification() {
        return notification;
    }

    public boolean isDone() {
        return isDone;
    }

    public Montage getPhoto() {
        return photo;
    }

    public String getProject() {
        return project;
    }
}
