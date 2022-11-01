public class Jobs {
    private String jobId;

    private String idJobPosition;
    private String jobPosition;

    private String jobAddress;

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getIdJobPosition() {
        return idJobPosition;
    }

    public void setIdJobPosition(String idJobPosition) {
        this.idJobPosition = idJobPosition;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public String getJobAddress() {
        return jobAddress;
    }

    public void setJobAddress(String jobAddress) {
        this.jobAddress = jobAddress;
    }

    public void print() {
        System.out.println("Job Id : " + this.jobId + ", job address " + this.jobAddress + ", job postion id : " + this.idJobPosition + ", job position name : " + this.jobPosition);
    }
}
