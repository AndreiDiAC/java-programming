package Jobs;

public class Job {

    private String status;
    private String companyName;
    private String jobId;
    private String endClient;
    private String position;
    private String recruiter;
    private String site;
    private String RTR;
    private String state;
    private String remote;
    private String jobTitle;
    private String description;


    public Job(){

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getRemote() {
        return remote;
    }

    public void setRemote(String remote) {
        this.remote = remote;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRTR() {
        return RTR;
    }

    public void setRTR(String RTR) {
        this.RTR = RTR;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getEndClient() {
        return endClient;
    }

    public void setEndClient(String endClient) {
        this.endClient = endClient;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getRecruiter() {
        return recruiter;
    }

    public void setRecruiter(String recruiter) {
        this.recruiter = recruiter;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }


    @Override
    public String toString() {
        return "Job{" +
                "status='" + status + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobId='" + jobId + '\'' +
                ", endClient='" + endClient + '\'' +
                ", position='" + position + '\'' +
                ", recruiter='" + recruiter + '\'' +
                ", site='" + site + '\'' +
                ", RTR='" + RTR + '\'' +
                ", state='" + state + '\'' +
                ", remote='" + remote + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
